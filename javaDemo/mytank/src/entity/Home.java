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
    public static final int width = 40, height = 40; // ȫ�־�̬��������
    public static boolean live = true;            //���ѿ�ʼ�Ǻúõ�
    public void draw(Graphics g) {
       g.drawImage(img, (800-this.width)/2, 600-this.height,this.width,this.height,null);
    }
    public void HomeDeath() {
    	if(live==false) {
    		JOptionPane.showMessageDialog(null, "������");
    		System.exit(0);  //��Ϸ����
    	}
    }
    //�������ѵĳ�����ʵ��
    public Rectangle getRectangle() {
    	 return new Rectangle((800-this.width)/2, 600-this.height,this.width,this.height);
    }
}
