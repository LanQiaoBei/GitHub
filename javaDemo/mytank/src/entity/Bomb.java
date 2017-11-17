package entity;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

//��ը��
public class Bomb {
    private int x;  //��ը��λ��
    private int y;
    private int kind;  //��ը������  0:����ͨשǽ �ͽ�ש 1:��̹��
    private int width;
    private int height;
    private Image img = null;
    
    //̹�˵Ĺ��췽��
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
    //����ը
    public void draw(Graphics g) {
    		g.drawImage(img, x, y, width, height, null, null);
    		//�����ӱ�ը�б����Ƴ�
    		Battle.bombList.remove(this);
    }
    
}
