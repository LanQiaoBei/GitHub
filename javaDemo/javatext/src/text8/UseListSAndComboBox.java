package text8;

import javax.swing.*;

public class UseListSAndComboBox {
	public static void main(String[] args) {
		JFrame frm=new JFrame("ʹ���б����Ͽ�");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		//�����б���������
		String[] likes= {"�ߵ���ѧ","��ѧӢ��","��ѧ����","�������","�˹�����","�Ƽ���"};
		JList list=new JList(likes);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setFixedCellHeight(20);
		list.setVisibleRowCount(5);
		JScrollPane scrollpane=new JScrollPane();
		scrollpane.setViewportView(list);
		scrollpane.setBounds(50, 30, 130, 110);
		frm.add(scrollpane);
		
		//������Ͽ���������
		JComboBox comboBox=new JComboBox(likes);
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(6);
		comboBox.insertItemAt("������뿪������",3);
		comboBox.setBounds(230, 30, 130, 25);
		frm.add(comboBox);
		
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}
}
