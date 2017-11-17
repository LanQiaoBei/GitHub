package entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class River extends Barrier {
	
     public River(int x,int y) {
    	 setX(x);
    	 setY(y);
    	 setWidth(40);                      //把河的宽度和高度设死  宽40  高100
    	 setHeight(100);
    	 setImg((new ImageIcon("images/river.jpg")).getImage());
     }

	@Override
	public void draw(Graphics g) {
			g.drawImage(getImg(), getX(), getY(), getWidth(), getHeight(), null);
	}
	 //返回一个长方形实例对象
    public Rectangle getRectangle() {
    	return new Rectangle(getX(), getY(), getWidth(), getHeight());
    			
    }
}
