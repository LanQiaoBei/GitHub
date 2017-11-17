package text8;

import javax.swing.*;

public class UseSplitPane {
	public static void main(String[] args) {
		//创建窗体、设置窗体标题和窗体关闭方式
		JFrame frm=new JFrame();
		frm.setTitle("使用JSplitPane");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//创建水平分割面板
		JSplitPane splitPane=new JSplitPane();
		splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		frm.add(splitPane);
		
		//创建输入框,可编辑,可左侧输入,20列,并添加到面板的左侧
		JTextArea input=new JTextArea();
		input.setEditable(true);
		input.setRows(5);
		input.setColumns(20);
		input.setText("可拉动中间分界线,\n\r观察窗口变化,\n\r如输入较多字符。");
		splitPane.setLeftComponent(input);
		
		//创建提交按钮并添加到面板的右侧
		JButton submitBtn=new JButton("提交");
		splitPane.setRightComponent(submitBtn);
		
		//设置分割比例,左侧为140个像素宽
		splitPane.setDividerLocation(140);
		
		//设置结构(JFrame)的位置和大小并显示
		frm.setBounds(450,230,400,200);
		frm.setVisible(true);
	}
}
