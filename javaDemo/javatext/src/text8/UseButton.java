package text8;

import javax.swing.*;

public class UseButton {
	public static void main(String[] args) {
		JFrame frm=new JFrame("使用4种按钮");
		frm.setLayout(null);
		
		//创建普通按钮并设置位置及大小
		JButton btn=new JButton("普通按钮");
		btn.setBounds(50, 20, 120, 25);
		frm.add(btn);
		//创建切换按钮并设置位置及大小
		JToggleButton tbtn=new JToggleButton("切换按钮");
		tbtn.setBounds(210,20,120,25);
		frm.add(tbtn);
		
		//创建提醒标签并设置位置及大小
		JLabel slabel=new JLabel("性   别:");
		slabel.setBounds(50,60,120,25);
		frm.add(slabel);
		
		//创建单选按钮管理组件
		ButtonGroup btnGroup=new ButtonGroup();
		
		//创建两个单选按钮,并设置位置及大小,其中第一个被选中
		JRadioButton manRadioButton=new JRadioButton("男人");
		manRadioButton.setBounds(110, 60, 80, 25);
		manRadioButton.setSelected(true);
		JRadioButton womanRadioButton=new JRadioButton("女人");
		womanRadioButton.setBounds(210, 60, 80, 25);
		
		//添加单选按钮到管理组件中以及窗体中
		btnGroup.add(manRadioButton);
		btnGroup.add(manRadioButton);
		frm.add(manRadioButton);
		frm.add(womanRadioButton);
		
		//创建提醒标签并设置位置及大小
		JLabel clabel=new JLabel("课目:");
		clabel.setBounds(50, 90, 120, 25);
		frm.add(clabel);
		
		//创建4个复选按钮,并设置位置及大小,其中第1、4个被选中
		JCheckBox mCheckBox=new JCheckBox("高等数学");
		mCheckBox.setBounds(110, 90, 80, 25);
		mCheckBox.setSelected(true);
		frm.add(mCheckBox);
		JCheckBox eCheckBox=new JCheckBox("大学英语");
		eCheckBox.setBounds(210, 90, 80, 25);
		frm.add(eCheckBox);
		JCheckBox pCheckBox=new JCheckBox("大学物理");
		pCheckBox.setBounds(110, 120, 80, 25);
		frm.add(pCheckBox);
		JCheckBox dCheckBox=new JCheckBox("程序设计");
		dCheckBox.setBounds(210, 120, 80, 25);
		frm.add(dCheckBox);
		
		frm.setBounds(450, 230, 400, 200);
		frm.setVisible(true);
	}
}
