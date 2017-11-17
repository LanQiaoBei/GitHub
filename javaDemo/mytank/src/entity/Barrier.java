package entity;

import java.awt.Graphics;
import java.awt.Image;

public  abstract class Barrier {
          private  int  x;
          private  int  y;
          private  int  type;       //ÀàÐÍ     0:Ê÷  1:ºÓ
          private  int width;
          private  int height;
          private  Image  img=null;
      	
  	
        public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public Image getImg() {
			return img;
		}
		public void setImg(Image img) {
			this.img = img;
		}
	 public abstract void draw(Graphics g); 
}
