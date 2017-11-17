package entity;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Tree extends Barrier {
	  private int derection;       //���ķ���  0������  1������
	  private int count;           //���ĸ���
	  
	  public Tree(int x,int y,int derection,int count) {
		  setWidth(30);
		  setHeight(30);
		  setX(x);
		  setY(y);
		  setImg(new ImageIcon("images/tree.gif").getImage());
		  this.derection = derection;
		  this.count = count;
	  }
	  
      public int getDerection() {
			return derection;
		}
		public void setDerection(int derection) {
			this.derection = derection;
		}
		
	@Override
	public void draw(Graphics g) {
		if(derection==0) {
			for(int i=0;i<count;i++) {
				g.drawImage(getImg(), getX()+i*getWidth(), getY(),getWidth(),getHeight(),null);
			}
		}else {
            for(int i=0;i<count;i++) {
            	g.drawImage(getImg(), getX(),  getY()+i*getHeight(),getWidth(),getHeight(), null);
			}
		}
   
	}

}
