package entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.ImageIcon;
 //敌方坦克类
public class Tank extends Thread{
   private static  final int width=30,height=30;
   public int x;
   public int y;
   public Direction direction;  //画的方向 1 上 2 下 3 左 4右
   private Image[] img = new Image[4];
   private static final int speed=10;
   public int oldX;   //坦克上一次移动的坐标
   public int oldY; 
   public  Direction oldDirection;           //坦克上一次的方向
   public boolean live = true;
   public static boolean stop = false;       //坦克是否停下 实际上是一种假死状态 线程不断的运行 不执行move方法 给人的是暂停的错觉
   //敌方坦克的构造方法
   public  Tank(int x,int y) {
	    img[0] = new ImageIcon("Images/tankU.gif").getImage();
	    img[1] = new ImageIcon("Images/tankD.gif").getImage();
	    img[2] = new ImageIcon("Images/tankL.gif").getImage();
	    img[3] = new ImageIcon("Images/tankR.gif").getImage();
	    this.x=x;
	    this.y=y;
	    this.oldX=x;
	    this.oldY=y;
	    this.direction = Direction.D;
	    this.oldDirection=this.direction;
   }
   //敌方坦克的构造方法
   public  Tank() {
	    this.x = 330;
	    this.y = 570;
	    img[0] = new ImageIcon("Images/tankU.gif").getImage();
	    img[1] = new ImageIcon("Images/tankD.gif").getImage();
	    img[2] = new ImageIcon("Images/tankL.gif").getImage();
	    img[3] = new ImageIcon("Images/tankR.gif").getImage();
	    this.direction = Direction.D;
	    this.oldX=x;
	    this.oldY=y;
	    this.oldDirection=this.direction;   
  }
   
   //画敌方坦克
   public void draw(Graphics g){
	   if(direction==Direction.U) {
	   g.drawImage(img[0], x, y, width, height, null);
	   }else if(direction==Direction.D) {
		   g.drawImage(img[1], x, y, width, height,null);
	   }else if(direction==Direction.L) {
		   g.drawImage(img[2], x, y, width, height,null);
	   }else {
		   g.drawImage(img[3], x, y, width, height,null);
	   }
	 }
   
   //移动
   public void move() {
	   if(stop==false) {
	  oldDirection = direction;
	   oldX = x;
	   oldY = y;
	   switch (direction) {  //选择移动方向
		case L:
			x -= speed;
			break;
		case U:
			y -= speed;
			break;
		case R:
			x += speed;
			break;
		case D:
			y += speed;
			break;
	
   }
	}
   }
   //随机生成方向
   public void RandomDirection() {
	   int flag;
	   Random random = new Random();
	   flag = random.nextInt(3)+1;  //随机生成1-4的整数
	   switch(flag) {
		case 1: this.direction = Direction.D; break;
		case 2: this.direction = Direction.L; break;
		case 3: this.direction = Direction.U; break;
		case 4: this.direction = Direction.R; break;
		}
	 
   }
   
  //碰到障碍物转换方向
  public void  RunToBar() {
	   if(IsBar()) {
		   RandomDirection();
			this.x = oldX;
			this.y = oldY;
	   } 
  } 
  
  //前方是否是障碍物
   public boolean IsBar() {
	   for(int i=0;i<Battle.mlist.size();i++) {
	   if(this.getRectangle().intersects(Battle.mlist.get(i).getRectangle())){
	   	   return true;
	   }
	   }
	   for(int i=0;i<Battle.clist.size();i++) {
		     if(this.getRectangle().intersects(Battle.clist.get(i).getRectangle())) {
		    	 return true;
		     }                                                  
	   }
	   
	   if(this.getRectangle().intersects(Battle.river.getRectangle())) {
		   return true;
	   }
	   return false;
   }
   //遇到了坦克转换方向
   public void EncounterTank() {
	   for(int i=0;i<Battle.tankList.size();i++) {
		   if(this.getRectangle().intersects(Battle.tankList.get(i).getRectangle())) {
			   RandomDirection();
				this.x = oldX;
				this.y = oldY;
				return;
		   }
	   }
	   if(this.getRectangle().intersects(Battle.mk.getRectangle())) {
		   RandomDirection();
			this.x = oldX;
			this.y = oldY;
			return;
	   }
   } 
   
  //遇到边界转换方向
   public void RunToBorder() {
	  
	   if(this.x+width>Battle.WIDTH) {
			RandomDirection();
			this.x = oldX;
			this.y = oldY;
		}
		if(this.y+height>Battle.HEIGHT) {
		   RandomDirection();
			this.x = oldX;
			this.y = oldY;
		}
		if(this.x<0) {
		 RandomDirection();
			this.x =0;
			this.y = oldY;
		}
		if(this.y<30) {
	      RandomDirection();
			this.x = oldX;
			this.y = 30;
		}	
   }
   //坦克的长方形实例
   public Rectangle getRectangle() {
	   return new Rectangle(x, y, width, height);
   }
  public  synchronized void OpenFire() {
	 
		  Bullet bullet = null;
		   if(this.direction==Direction.U) {
		      bullet = new Bullet(x+10,y+height/2,this.direction);  //实例化一个子弹
		   }else if(this.direction==Direction.R) {
			   bullet = new Bullet(x+width/2,y+10,this.direction);  
		   }else if(this.direction==Direction.L) {
			   bullet = new Bullet(x+width/2,y+10,this.direction); 
		   }else {
			   bullet = new Bullet(x+10,y+height/2,this.direction); 
		   }
		   Battle.tankBullet.add(bullet); 
		   bullet.start();      //开启子弹线程
  }
   
@Override
public void run() {
	int count = 0; //每移动五次开一次火
	while(live) {
		if(count==5) {
			count=0;   //让坦克停下来开
			OpenFire();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	   }else{
		move();
		RunToBar();
		RunToBorder();
		EncounterTank();
		count++;
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}	
}
   
}
