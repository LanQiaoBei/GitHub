package text8;

import java.awt.event.*;

import javax.swing.*;

public class UseDialog {
	public static void main(String[] args) {
		final JFrame frm=new JFrame("使用普通对话框");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		//创建普通对话框并设置位置及大小、模态等
		final JDialog dlg=new JDialog(frm,"普通对话框");
		dlg.setBounds(470, 220, 200, 150);
		dlg.setLayout(null);
		dlg.setModal(true);
		
		//创建窗体中打开对话框的按钮并添加动作监听器
		JButton obtn=new JButton("打开对话框");
		obtn.setBounds(60, 60, 100, 30);
		obtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dlg.setVisible(true);
				//dlg.show(true);
			}
		});
		frm.add(obtn);
		
		//创建对话框中的退出按钮并添加动作监听器
		JButton btn=new JButton("退出");
		btn.setBounds(50, 50, 80, 30);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dlg.setVisible(false);
			}		
		});
		dlg.add(btn);
		frm.setBounds(450, 200, 250, 200);
		frm.setVisible(true);
	}
}
