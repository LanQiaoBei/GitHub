package text8;

import java.awt.*;

import javax.swing.*;

public class UseBorderLayout {
	public static void main(String[] args) {
		JFrame frm=new JFrame("使用边界布局管理器");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置使用边界布局管理器
		frm.setLayout(new BorderLayout());
		//创建5个标签,并设置其对其水平方式
		JLabel northLabel=new JLabel("容器顶部(NORTH)");
		northLabel.setHorizontalAlignment(JLabel.HORIZONTAL);
		JLabel southLabel=new JLabel("容器底部(SOUTH)");
		southLabel.setHorizontalAlignment(JLabel.HORIZONTAL);
		JLabel westLabel=new JLabel("容器左侧(WEST)");
		westLabel.setHorizontalAlignment(JLabel.HORIZONTAL);
		JLabel eastLabel=new JLabel("容器右侧(EAST)");
		eastLabel.setHorizontalAlignment(JLabel.HORIZONTAL);
		JLabel centerLabel=new JLabel("容器中心(CENTER)");
		centerLabel.setHorizontalAlignment(JLabel.HORIZONTAL);
		//将5个标签添加至容器影响位置
		frm.add(northLabel,BorderLayout.NORTH);
		frm.add(southLabel, BorderLayout.SOUTH);
		frm.add(westLabel, BorderLayout.WEST);
		frm.add(eastLabel, BorderLayout.EAST);
		frm.add(centerLabel, BorderLayout.CENTER);
		frm.setBounds(450,230,400,200);
		frm.setVisible(true);	
	}
}
