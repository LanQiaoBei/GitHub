package entity;
 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
//战场类 运行主类
public class Battle extends JFrame {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	Thread thread = new Thread(new Runnable() {
		   
		public void run() {
			while(true){
            home.HomeDeath();                //判断老窝炸了没
		    mk.MainTankDeath();                //判断主机坦克死了没
		    
		    if(Bullet.stop==false && Tank.stop==false && MainTank.stop==false) {
			repaint();          //重画
		    }
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	});
	
	public static River river = new River(85, 100);
	public BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
	public static ArrayList<MetalWall>  mlist = new ArrayList<MetalWall>();  //金砖列表
	public static ArrayList<CommonWall> clist = new ArrayList<CommonWall>(); //普砖列表
	public static ArrayList<Tree> treeList = new ArrayList<Tree>();        //树列表
	public static ArrayList<Bomb> bombList = new ArrayList<Bomb>();     //爆炸列表
	public static ArrayList<Tank> tankList = new ArrayList<Tank>();     //敌方坦克列表
	public static ArrayList<Bullet> mkBullet = new ArrayList<Bullet>();       //主机坦克的子弹列表
	public static ArrayList<Bullet> tankBullet = new ArrayList<Bullet>();     //敌方坦克的子弹列表
    Tree t1 = new Tree(0,360,0,4);
    Tree t2 = new Tree(220,360,0,4);
    Tree t3 = new Tree(440,360,0,4);
    Tree t4 = new Tree(660,360,0,4);
    static  Home home = new Home();
    MetalWall m1 = new MetalWall(125, 135, 10,0);
    MetalWall m2 = new MetalWall(125, 165, 10,0);
    MetalWall m3 = new MetalWall(600, 450, 5, 1);
    static MainTank mk = new MainTank();           //主机坦克
    Tank tank1 = new Tank(100,60);                      //生成一个地方坦克
    Tank tank2 = new Tank(200,60);
    Tank tank3 = new Tank(300,60);
    Tank tank4 = new Tank(600,60);
     MonitorKey keyListener = new MonitorKey();    //实例化按键监听者 
    public Battle() {
    	setTitle("我的坦克大战   F:开火  移动：上下左右   暂停/继续:enter  ");
    	setSize(WIDTH,HEIGHT);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	mlist.add(m1);
    	mlist.add(m2);
    	mlist.add(m3);
        for(int i=0;i<16;i++) {
        	clist.add(new CommonWall(220+i*CommonWall.width,300));
        	clist.add(new CommonWall(220+i*CommonWall.width,320));
        }
        for(int i=0;i<10;i++) {
        	clist.add(new CommonWall(220,400+i*CommonWall.height));
        	clist.add(new CommonWall(200,400+i*CommonWall.height));
        	clist.add(new CommonWall(480,400+i*CommonWall.height));
        	clist.add(new CommonWall(500,400+i*CommonWall.height));
        }
        for(int i=0;i<15;i++) {
        	clist.add(new CommonWall(500+i*CommonWall.width,180));
        	clist.add(new CommonWall(500+i*CommonWall.width,220));
        }
        for(int i=0;i<3;i++) {
        	clist.add(new CommonWall(360,540+i*CommonWall.height));
        	clist.add(new CommonWall(420,540+i*CommonWall.height));
        }
        for(int i=0;i<2;i++) {
        	clist.add(new CommonWall(380+i*CommonWall.width,540));
        }
    	treeList.add(t1);
    	treeList.add(t2);
    	treeList.add(t3);
    	treeList.add(t4);
    	thread.start();
    	tankList.add(tank1);
    	tankList.add(tank2);
    	tankList.add(tank3);
    	tankList.add(tank4);
    	tank1.start();
    	tank2.start();
    	tank3.start();
    	tank4.start();
	    this.addKeyListener(keyListener);
    }
   //搞个内部类作为监听者
  public class MonitorKey implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		mk.keyPressed(e);
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			if(Bullet.stop==false && Tank.stop==false && MainTank.stop==false) {
				Bullet.stop = true;
				Tank.stop = true;
				MainTank.stop = true;
			}else {
				Bullet.stop = false;
				Tank.stop = false;
				MainTank.stop = false;
				repaint();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {	
   }
	    
  }
  //绘制图形缓冲区的内容
  public void drawBufferImage() {
	  //创建缓冲区对象
	  
	  Graphics g = image.getGraphics();       //获取画笔对象
	  g.clearRect(0, 0, WIDTH, HEIGHT);
	  //绘制缓冲区内容
	 river.draw(g);

	  	for(int i=0;i<mkBullet.size();i++) {
	  		if(mkBullet.get(i)!=null) {
	  		mkBullet.get(i).draw(g);
	  		}
	  	}
     for(int i=0;i<tankBullet.size();i++) {
    	 if( tankBullet.get(i)!=null) {
    	tankBullet.get(i).draw(g);
     }
   }
     for(int i=0;i<mlist.size();i++) {
	  		mlist.get(i).draw(g);
	  	}
	  	for(int i=0;i<clist.size();i++) {
	  		clist.get(i).draw(g);
	  	}
     //按这个顺序画覆盖打中墙的子弹
  	
    
  	for(int i=0;i<tankList.size();i++) {
  		if(tankList.get(i)!=null) {
  		tankList.get(i).draw(g);
  		}
  	}
	mk.draw(g);
  	for(int i=0;i<treeList.size();i++) {
  		treeList.get(i).draw(g);
  	}
  	home.draw(g);
  	for(int i=0;i<bombList.size();i++) {
  		if(bombList.get(i)!=null) {
  		bombList.get(i).draw(g);
  		}
  	}
  }
   //画战场 
    public void paint(Graphics g) {
    	  //super.paint(g);
    	 drawBufferImage();
    	 //将缓冲区图片一次性绘制
    	 g.drawImage(image, 0, 0,null);
    	 
    }
    //主方法
    public static void main(String[] args) {
		  new Battle();
	}
}
