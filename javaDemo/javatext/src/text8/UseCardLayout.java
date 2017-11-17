package text8;

import java.awt.*;

import javax.swing.*;

public class UseCardLayout {
	public static void main(String[] args) {
		JFrame frm=new JFrame("使用卡片布局管理");
		//创建卡片布局管理器并设置
		CardLayout cardlayout=new CardLayout();
		frm.setLayout(cardlayout);
		
		//创建5个组件并添加到容器中
		JLabel label1=new JLabel("英语");
		JLabel label2=new JLabel("数学");
		JLabel label3=new JLabel("地理");
		JLabel label4=new JLabel("历史");
		JLabel label5=new JLabel("音乐");
		frm.add(label1,"课程1");
		frm.add(label2, "课程2");
		frm.add(label3, "课程3");
		frm.add(label4, "课程4");
		frm.add(label5, "课程5");
		
		//显示指定的卡片或下一、前一、第一或最后一张卡片
		cardlayout.show(frm.getContentPane(),"课程4");
		//cardlayout.next(frm.getContentPane());
		//cardlayout.previous(frm.getContentPane());
		//cardlayout.first(frm.getContentPane());
		//cardlayout.last(frm.getContentPane());
		
		frm.setBounds(450,230,200,100);
		frm.setVisible(true);
	}

}
