package text8;

import javax.swing.*;

public class UseListSAndComboBox {
	public static void main(String[] args) {
		JFrame frm=new JFrame("使用列表和组合框");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		//创建列表及设置属性
		String[] likes= {"高等数学","大学英语","大学物理","程序设计","人工智能","云计算"};
		JList list=new JList(likes);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setFixedCellHeight(20);
		list.setVisibleRowCount(5);
		JScrollPane scrollpane=new JScrollPane();
		scrollpane.setViewportView(list);
		scrollpane.setBounds(50, 30, 130, 110);
		frm.add(scrollpane);
		
		//创建组合框及设置属性
		JComboBox comboBox=new JComboBox(likes);
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(6);
		comboBox.insertItemAt("软件代码开发技术",3);
		comboBox.setBounds(230, 30, 130, 25);
		frm.add(comboBox);
		
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}
}
