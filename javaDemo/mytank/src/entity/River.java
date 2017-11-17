package entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class River extends Barrier {
	
     public River(int x,int y) {
    	 setX(x);
    	 setY(y);
    	 setWidth(40);                      //�ѺӵĿ�Ⱥ͸߶�����  ��40  ��100
    	 setHeight(100);
    	 setImg((new ImageIcon("images/river.jpg")).getImage());
     }

	@Override
	public void draw(Graphics g) {
			g.drawImage(getImg(), getX(), getY(), getWidth(), getHeight(), null);
	}
	 //����һ��������ʵ������
    public Rectangle getRectangle() {
    	return new Rectangle(getX(), getY(), getWidth(), getHeight());
    			
    }
}
