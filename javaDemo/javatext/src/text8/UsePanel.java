package text8;

import java.awt.*;

import javax.swing.*;


public class UsePanel {
	public static void main(String[] args) {
		//创建窗体并设置窗体标题
		JFrame frm=new JFrame("使用JPanel");
		//设置窗体关闭方式
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//创建面板并放在窗体上半部分
		JPanel topPanel=new JPanel();
		frm.add(topPanel,BorderLayout.NORTH);
		
		//创建提示标签并设置显示信息
		JLabel show=new JLabel();
		show.setText("请输入姓名:");
		
		//创建输入框，设置为可编辑，左侧输入，20列
		JTextField input=new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(20);
		
		//创建提交按钮
		JButton myBtn=new JButton("提交");
		
		//添加显示标签、输入框和按钮
		topPanel.add(show);
		topPanel.add(input);
		topPanel.add(myBtn);
		
		//创建面板并放在窗体下半部分
		JPanel bottomPanel=new JPanel();
		frm.add(bottomPanel,BorderLayout.CENTER);
		
		//创建提示标签并设置显示信息
		JLabel againshow=new JLabel();
		againshow.setText("显示所有输入的姓名:");
		
		//创建输出框，5行32列，不可编辑
		JTextArea output=new JTextArea();
		output.setRows(5);
		output.setColumns(32);
		output.setEditable(false);
		
		//添加提示标签和输出框
		bottomPanel.add(againshow);
		bottomPanel.add(output);
		
		//设置窗体位置与大小并显示
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}

}
