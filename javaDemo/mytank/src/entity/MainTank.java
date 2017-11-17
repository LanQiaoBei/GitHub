package entity;

//import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//我方坦克
public class MainTank {
	 private static  final int width=30,height=30;
	   public int x;
	   public int y;
	   public Direction direction;  //画的方向 1 上 2 下 3 左 4右
	   private Image[] img = new Image[4];
	   private static final int speed=10;
	   public int oldX;   //坦克上一次移动的坐标
	   public int oldY; 
	   public  Direction oldDirection;           //坦克上一次的方向
	   public boolean live = true;               //是否活着
	   public static boolean stop=false;        //当stop=true时  move方法没用
	   //我方坦克构造方法
	   public  MainTank() {
		    this.x = 330;
		    this.y = 570;
		    img[0] = new ImageIcon("Images/tankU.gif").getImage();
		    img[1] = new ImageIcon("Images/tankD.gif").getImage();
		    img[2] = new ImageIcon("Images/tankL.gif").getImage();
		    img[3] = new ImageIcon("Images/tankR.gif").getImage();
		    this.direction = Direction.U;
		    this.oldX=x;
		    this.oldY=y;
		    this.oldDirection=this.direction;   
	  }
	   
	   //画我方坦克
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
	   
	  //碰到障碍物
	   public void  RunToBar() {
	 	   if(IsBar()) {
	 			this.x = oldX;
	 			this.y = oldY;
	 	   } 
	   } 
	   
	   //遇到边界
	   public void RunToBorder() {
		  
		   if(this.x+width>Battle.WIDTH) {
				this.x = oldX;
				this.y = oldY;
			}
			if(this.y+height>Battle.HEIGHT) {
				this.x = oldX;
				this.y = oldY;
			}
			if(this.x<0) {
				this.x =0;
				this.y = oldY;
			}
			if(this.y<30) {
				this.x = oldX;
				this.y = 30;
			}	
	   }
	   
	   //遇到了坦克走不动了
	   public void EncounterTank() {
		   for(int i=0;i<Battle.tankList.size();i++) {
			   if(this.getRectangle().intersects(Battle.tankList.get(i).getRectangle())) {
				  
					this.x = oldX;
					this.y = oldY;
					return;
			   }
		   }
	   } 
	   //坦克的长方形实例
	   public Rectangle getRectangle() {
		   return new Rectangle(x, y, width, height);
	   }
	   //按键后开始移动
	   public void keyPressed(KeyEvent e) {
		   switch(e.getKeyCode()) {
		   case KeyEvent.VK_DOWN : 
			   this.direction = Direction.D;
			   move();
			   RunToBar();
			   RunToBorder();
			   EncounterTank();
			   break;
		   case KeyEvent.VK_UP : 
			   this.direction = Direction.U;
			   move();
			   RunToBar();
			   RunToBorder();
			   EncounterTank();
			   break;
		   case KeyEvent.VK_LEFT :
			   this.direction = Direction.L;
			   move();
			   RunToBar();
			   RunToBorder();
			   EncounterTank();
			   break;
		   case KeyEvent.VK_RIGHT :
			   this.direction = Direction.R;
			   move();
			   RunToBar();
			   RunToBorder();
			   EncounterTank();
			   break;
		   case KeyEvent.VK_F:
			   OpenFire();
			   break;
		   }
		   
	   }
	   //开火
	   public void OpenFire() {
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
		   Battle.mkBullet.add(bullet);
		   bullet.start();  //开启子弹线程
	   }
	  //主机坦克是否死亡
	   public void MainTankDeath() {
		   if(live==false) {
			   JOptionPane.showMessageDialog(null, "你输了");
			   System.exit(0);
		   }
	   }
}
