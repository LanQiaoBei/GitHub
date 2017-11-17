package entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
//import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Bullet extends Thread {
    public int x;
	public int y;
	private Image[] img = new Image[4];
    public static final int speed = 10;	
	public Direction direction;
	public boolean live;        //子弹是否碰到障碍物和敌方坦克
	public static final int width = 10;
	public static final int height= 10;
	private int kind;      //打到东西的类型   0：打到墙了  1:打到坦克或者老窝
	public static boolean stop = false;  //子弹是否停下  实际上是一种假死状态 线程不断的休眠 不执行move方法 给人的是暂停的错觉
	//public  int flag = 0;   //由于不能自己从列表中移除自己 所以干脆不画 0：画  1：不画
	//子弹的构造方法
	public Bullet(int x,int y,Direction direction) {
		img[0] = new ImageIcon("Images/bulletU.gif").getImage();
		img[1] = new ImageIcon("Images/bulletD.gif").getImage();
		img[2] = new ImageIcon("Images/bulletL.gif").getImage();
		img[3] = new ImageIcon("Images/bulletR.gif").getImage();
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.live = true;
	}
	
	//子弹移动
	public void move() {
		if(stop==false) {
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
	
	//画子弹
  public void draw(Graphics g) {
	  if(direction==Direction.U) {
		   g.drawImage(img[0], x, y, width, height, null);
		   }else if(direction==Direction.D) {
			   g.drawImage(img[1], x, y, width, height,null);
		   }else if(direction==Direction.L) {
			   g.drawImage(img[2], x, y, width, height/2,null);
		   }else {
			   g.drawImage(img[3], x, y, width, height/2,null);
		   }
  }	
  
  //遇到边界消失
  public void RunToBorder() {
	  if(this.x+width>Battle.WIDTH) {
		  this.live = false; 
		  Battle.mkBullet.remove(this);
		  Battle.tankBullet.remove(this);
		}
		if(this.y+height>Battle.HEIGHT) {
	     this.live = false;
	     Battle.mkBullet.remove(this);
		  Battle.tankBullet.remove(this);
		}
		if(this.x<0) {
	     this.live = false;
	     Battle.mkBullet.remove(this);
		  Battle.tankBullet.remove(this);
		}
		if(this.y<30) {
		this.live = false; 
		 Battle.mkBullet.remove(this);
		 Battle.tankBullet.remove(this);//两个列表都删除这个子弹，不过肯定有个列表是没有这个子弹的 
		}
	}
  
  
  //子弹死亡后该干的事情
  public void BulletDeath() {
	  Battle.bombList.add(new Bomb(x, y,kind));
	  this.live = false;
	  Battle.mkBullet.remove(this);
	  Battle.tankBullet.remove(this);
  }
  //得到子弹的长方形实例
  public Rectangle getRectangle() {
	    	 return new Rectangle(x, y, width, height);		
  }
  //子弹打到障碍物或者坦克了
  public void HitBarOrTank() {
	  //是否打到了金砖
	  for(int i=0;i<Battle.mlist.size();i++) {
	  if(this.getRectangle().intersects(Battle.mlist.get(i).getRectangle())) {
		  this.kind = 0;
		  BulletDeath();
		  return;
	  }
	 }
	  //是否打到了普砖
	  for(int i=0;i<Battle.clist.size();i++) {
		  if(this.getRectangle().intersects(Battle.clist.get(i).getRectangle())) {
			 //让打到的普通砖墙消失
			  Battle.clist.remove(i);
			  this.kind = 0;
			  BulletDeath();
			  return;
		  }
		 }
	  //是否打到了敌方坦克    
	  for(int i=0;i<Battle.tankList.size();i++) {
		  if(this.getRectangle().intersects(Battle.tankList.get(i).getRectangle())) {
			  if(Battle.mkBullet.contains(this)) {        //如果主机子弹列表包含这个子弹
			  this.kind = 1;
			  Battle.tankList.get(i).live = false;         //这个地方坦克死亡
			  Battle.tankList.remove(i);                   //删除这个地方坦克
			  BulletDeath();
			  return;
			  }
		  }
		 }
	  //打到主机坦克  
	  if(this.getRectangle().intersects(Battle.mk.getRectangle())) {
		  if(Battle.tankBullet.contains(this)) {      //如果敌方子弹列表包含这个子弹
		  this.kind = 1;
		  BulletDeath();
		  Battle.mk.live = false;
		 
		  }
	  }
	  //打到了老窝
	  if(this.getRectangle().intersects(Battle.home.getRectangle())) {
		  this.kind = 1;
		  Battle.home.live = false;
		  BulletDeath(); 
	  }
  }
 
	public void run(){
		while(live) {
			move();
			RunToBorder();
			HitBarOrTank();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
