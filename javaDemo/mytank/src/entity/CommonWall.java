package entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
 
public class CommonWall {
    private int x;
    private int y;
    public static final int width = 20; 
    public static final int height = 20; 
    private Image img=null;
    
    public CommonWall(int x,int y) {
    	this.x = x;
    	this.y = y;
    	img = new ImageIcon("Images/commonWall.gif").getImage();
    }
    
    public void draw(Graphics g) {
				g.drawImage(img,x, y,width,height,null);
    }
    //返回一个长方形实例对象
    public Rectangle getRectangle() {
    
	    	 return new Rectangle(x, y, width, height);		
    }
}
