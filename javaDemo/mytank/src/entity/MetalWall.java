package entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class MetalWall {
   private int x;
   private int y;
   public static final int width = 30; // ���ý���ǽ�ĳ���̬ȫ�ֲ���
   public static final int height = 30;
   private Image img = null;
   private int count;  //���ĸ���
   private int direction;  //���ķ���  �᣺0  ����1
   public MetalWall(int x,int y,int count,int derection) {
	   this.x = x;
	   this.y = y;
	   this.count = count;
	   this.direction = derection;
	   img = new ImageIcon("Images/metalWall.gif").getImage();
   }
   public void draw(Graphics g) {
	   if(direction==0) {
			for(int i=0;i<count;i++) {
				g.drawImage(img, x+i*width, y,width,height, null);
			}
		}else {
           for(int i=0;i<count;i++) {
           	g.drawImage(img, x, y+i*height,width,height, null);
			}
		}
  
   }
   //����һ��������ʵ������
   public Rectangle getRectangle() {
	    if(direction==0) {
	    	 return new Rectangle(x, y, width*count, height);
	    }else {
	    	return new Rectangle(x, y, width, height*count);
	    }
	  
   }
}
