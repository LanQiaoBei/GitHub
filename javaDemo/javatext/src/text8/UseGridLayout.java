package text8;

import java.awt.*;

import javax.swing.*;

public class UseGridLayout {
	public static void main(String[] args) {
		JFrame frm=new JFrame("使用网格布局管理器");
		//创建一个2行2列的网格布局管理器,并设置
		GridLayout gridlayout=new GridLayout(2,2);
		frm.setLayout(gridlayout);
		
		//创建5个组件并添加到容器中
		JLabel label1=new JLabel("英语");
		JLabel label2=new JLabel("数学");
		JLabel label3=new JLabel("地理");
		JLabel label4=new JLabel("历史");
		JLabel label5=new JLabel("音乐");
		frm.add(label1);
		frm.add(label2);
		frm.add(label3);
		frm.add(label4);
		frm.add(label5);
		frm.setBounds(450, 230, 400, 100);
		frm.setVisible(true);
	}
}
