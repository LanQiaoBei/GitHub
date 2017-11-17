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
	public boolean live;        //�ӵ��Ƿ������ϰ���͵з�̹��
	public static final int width = 10;
	public static final int height= 10;
	private int kind;      //�򵽶���������   0����ǽ��  1:��̹�˻�������
	public static boolean stop = false;  //�ӵ��Ƿ�ͣ��  ʵ������һ�ּ���״̬ �̲߳��ϵ����� ��ִ��move���� ���˵�����ͣ�Ĵ��
	//public  int flag = 0;   //���ڲ����Լ����б����Ƴ��Լ� ���Ըɴ಻�� 0����  1������
	//�ӵ��Ĺ��췽��
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
	
	//�ӵ��ƶ�
	public void move() {
		if(stop==false) {
		  switch (direction) {  //ѡ���ƶ�����
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
	
	//���ӵ�
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
  
  //�����߽���ʧ
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
		 Battle.tankBullet.remove(this);//�����б�ɾ������ӵ��������϶��и��б���û������ӵ��� 
		}
	}
  
  
  //�ӵ�������øɵ�����
  public void BulletDeath() {
	  Battle.bombList.add(new Bomb(x, y,kind));
	  this.live = false;
	  Battle.mkBullet.remove(this);
	  Battle.tankBullet.remove(this);
  }
  //�õ��ӵ��ĳ�����ʵ��
  public Rectangle getRectangle() {
	    	 return new Rectangle(x, y, width, height);		
  }
  //�ӵ����ϰ������̹����
  public void HitBarOrTank() {
	  //�Ƿ���˽�ש
	  for(int i=0;i<Battle.mlist.size();i++) {
	  if(this.getRectangle().intersects(Battle.mlist.get(i).getRectangle())) {
		  this.kind = 0;
		  BulletDeath();
		  return;
	  }
	 }
	  //�Ƿ������ש
	  for(int i=0;i<Battle.clist.size();i++) {
		  if(this.getRectangle().intersects(Battle.clist.get(i).getRectangle())) {
			 //�ô򵽵���ͨשǽ��ʧ
			  Battle.clist.remove(i);
			  this.kind = 0;
			  BulletDeath();
			  return;
		  }
		 }
	  //�Ƿ���˵з�̹��    
	  for(int i=0;i<Battle.tankList.size();i++) {
		  if(this.getRectangle().intersects(Battle.tankList.get(i).getRectangle())) {
			  if(Battle.mkBullet.contains(this)) {        //��������ӵ��б��������ӵ�
			  this.kind = 1;
			  Battle.tankList.get(i).live = false;         //����ط�̹������
			  Battle.tankList.remove(i);                   //ɾ������ط�̹��
			  BulletDeath();
			  return;
			  }
		  }
		 }
	  //������̹��  
	  if(this.getRectangle().intersects(Battle.mk.getRectangle())) {
		  if(Battle.tankBullet.contains(this)) {      //����з��ӵ��б��������ӵ�
		  this.kind = 1;
		  BulletDeath();
		  Battle.mk.live = false;
		 
		  }
	  }
	  //��������
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
