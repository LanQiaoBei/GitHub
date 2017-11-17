package entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Home {
    private  int x;
    private  int y;
    private  Image img=new ImageIcon("Images/home.jpg").getImage();
    public static final int width = 40, height = 40; // 全局静态变量长宽
    public static boolean live = true;            //老窝开始是好好的
    public void draw(Graphics g) {
       g.drawImage(img, (800-this.width)/2, 600-this.height,this.width,this.height,null);
    }
    public void HomeDeath() {
    	if(live==false) {
    		JOptionPane.showMessageDialog(null, "你输了");
    		System.exit(0);  //游戏结束
    	}
    }
    //返回老窝的长方形实例
    public Rectangle getRectangle() {
    	 return new Rectangle((800-this.width)/2, 600-this.height,this.width,this.height);
    }
}
