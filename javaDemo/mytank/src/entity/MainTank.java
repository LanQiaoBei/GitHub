package entity;

//import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//�ҷ�̹��
public class MainTank {
	 private static  final int width=30,height=30;
	   public int x;
	   public int y;
	   public Direction direction;  //���ķ��� 1 �� 2 �� 3 �� 4��
	   private Image[] img = new Image[4];
	   private static final int speed=10;
	   public int oldX;   //̹����һ���ƶ�������
	   public int oldY; 
	   public  Direction oldDirection;           //̹����һ�εķ���
	   public boolean live = true;               //�Ƿ����
	   public static boolean stop=false;        //��stop=trueʱ  move����û��
	   //�ҷ�̹�˹��췽��
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
	   
	   //���ҷ�̹��
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
	   
	   //�ƶ�
	   public void move() {
		   if(stop==false) {
		  oldDirection = direction;
		   oldX = x;
		   oldY = y;
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
	 //ǰ���Ƿ����ϰ���
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
	   
	  //�����ϰ���
	   public void  RunToBar() {
	 	   if(IsBar()) {
	 			this.x = oldX;
	 			this.y = oldY;
	 	   } 
	   } 
	   
	   //�����߽�
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
	   
	   //������̹���߲�����
	   public void EncounterTank() {
		   for(int i=0;i<Battle.tankList.size();i++) {
			   if(this.getRectangle().intersects(Battle.tankList.get(i).getRectangle())) {
				  
					this.x = oldX;
					this.y = oldY;
					return;
			   }
		   }
	   } 
	   //̹�˵ĳ�����ʵ��
	   public Rectangle getRectangle() {
		   return new Rectangle(x, y, width, height);
	   }
	   //������ʼ�ƶ�
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
	   //����
	   public void OpenFire() {
		   Bullet bullet = null;
		   if(this.direction==Direction.U) {
		      bullet = new Bullet(x+10,y+height/2,this.direction);  //ʵ����һ���ӵ�
		   }else if(this.direction==Direction.R) {
			   bullet = new Bullet(x+width/2,y+10,this.direction);  
		   }else if(this.direction==Direction.L) {
			   bullet = new Bullet(x+width/2,y+10,this.direction); 
		   }else {
			   bullet = new Bullet(x+10,y+height/2,this.direction); 
		   }
		   Battle.mkBullet.add(bullet);
		   bullet.start();  //�����ӵ��߳�
	   }
	  //����̹���Ƿ�����
	   public void MainTankDeath() {
		   if(live==false) {
			   JOptionPane.showMessageDialog(null, "������");
			   System.exit(0);
		   }
	   }
}
