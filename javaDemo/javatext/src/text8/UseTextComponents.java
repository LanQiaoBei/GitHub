package text8;

import java.awt.event.*;

import javax.swing.*;

public class UseTextComponents {
	public static void main(String[] args) {
		JFrame frm=new JFrame("使用文本组件");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		//创建文本框,设置位置、大小、默认文字属性
		JTextField text=new JTextField("输入点什么呢？");
		text.setBounds(10,10,200,25);
		frm.add(text);
		
		//创建密码框,设置位置、大小、默认文字属性
		JPasswordField password=new JPasswordField("我的密码");
		password.setBounds(10,35,200,25);
		frm.add(password);
		
		//创建密码框,设置位置、大小、默认文字等属性
		final JTextArea textarea=new JTextArea("我喜欢编程,\n\r我喜欢Java。");
		textarea.setBounds(10,65,200,75);
		textarea.setEditable(false);
		textarea.setColumns(80);
		textarea.append("\n\r宽度为"+textarea.getWidth()+"像素。\n\r");
		frm.add(textarea);
		textarea.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				//如果前面不设置列数,显示为0
				textarea.append("列数:"+textarea.getColumns()+"行数:"+textarea.getRows()+";");
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frm.setBounds(450, 200, 230, 180);
		frm.setVisible(true);
	}
}
