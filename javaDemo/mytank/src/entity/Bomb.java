package entity;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

//爆炸类
public class Bomb {
    private int x;  //爆炸的位置
    private int y;
    private int kind;  //爆炸的种类  0:打到普通砖墙 和金砖 1:打到坦克
    private int width;
    private int height;
    private Image img = null;
    
    //坦克的构造方法
    public Bomb(int x,int y,int kind) {
    	this.x=x;
    	this.y=y;
    	this.kind=kind;
    	if(kind==0) {
    		this.width = 15;
    		this.height = 15;
    		img = new ImageIcon("Images/2.gif").getImage();
    	}
    	if(kind==1) {
    		this.width = 30;
    		this.height = 30;
    		img = new ImageIcon("Images/4.gif").getImage();
    	}
    	
    }
    //画爆炸
    public void draw(Graphics g) {
    		g.drawImage(img, x, y, width, height, null, null);
    		//画完后从爆炸列表中移除
    		Battle.bombList.remove(this);
    }
    
}
