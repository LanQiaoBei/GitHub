package text8;

import java.awt.BorderLayout;

import javax.swing.*;

public class UseScrollPane {
	public static void main(String[] args) {
		//创建窗体、设置窗体标题和窗体关闭方式
		JFrame frm=new JFrame();
		frm.setTitle("使用JScrollPane");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//创建3个输出框,均为2行3列,并设置默认内容
		JTextArea toutput=new JTextArea();
		toutput.setColumns(32);
		toutput.setRows(2);
		toutput.setText("这是JScrollPane使用示例!\n\r请在一行输入较多字符观察显示区的变化!");
		
		JTextArea coutput=new JTextArea();
		coutput.setRows(2);
		coutput.setColumns(32);
		coutput.setText("这是JScrollPane使用示例!\n\r请输入多行字符和一行许多字符观察显示区的变化!");
		
		JTextArea boutput=new JTextArea();
		boutput.setRows(2);
		boutput.setColumns(32);
		boutput.setText("这是JScrollPane使用示例!\n\r请输入多行字符和一行许多字符观察显示区的变化!");
		
		//创建3个滚动面板
		JScrollPane toutputScrollPane=new JScrollPane();
		JScrollPane coutputScrollPane=new JScrollPane();
		JScrollPane boutputScrollPane=new JScrollPane();
		
		//为每个滚动面板添加各自的组件
		toutputScrollPane.setViewportView(toutput);
		coutputScrollPane.setViewportView(coutput);
		boutputScrollPane.setViewportView(boutput);
		
		//为每个滚动面板设置水平和垂直显示策略
		toutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		toutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		coutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		coutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		boutputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		boutputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		//在窗体中添加3个滚动面板
		frm.add(toutputScrollPane,BorderLayout.NORTH);
		frm.add(coutputScrollPane, BorderLayout.CENTER);
		frm.add(boutputScrollPane, BorderLayout.SOUTH);
		
		//设置结构(JFrame)的位置与大小并显示
		frm.setBounds(450,230,400,180);
		frm.setVisible(true);		
	}
}
