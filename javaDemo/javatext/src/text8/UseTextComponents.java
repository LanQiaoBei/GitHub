package text8;

import java.awt.event.*;

import javax.swing.*;

public class UseTextComponents {
	public static void main(String[] args) {
		JFrame frm=new JFrame("ʹ���ı����");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		//�����ı���,����λ�á���С��Ĭ����������
		JTextField text=new JTextField("�����ʲô�أ�");
		text.setBounds(10,10,200,25);
		frm.add(text);
		
		//���������,����λ�á���С��Ĭ����������
		JPasswordField password=new JPasswordField("�ҵ�����");
		password.setBounds(10,35,200,25);
		frm.add(password);
		
		//���������,����λ�á���С��Ĭ�����ֵ�����
		final JTextArea textarea=new JTextArea("��ϲ�����,\n\r��ϲ��Java��");
		textarea.setBounds(10,65,200,75);
		textarea.setEditable(false);
		textarea.setColumns(80);
		textarea.append("\n\r���Ϊ"+textarea.getWidth()+"���ء�\n\r");
		frm.add(textarea);
		textarea.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				//���ǰ�治��������,��ʾΪ0
				textarea.append("����:"+textarea.getColumns()+"����:"+textarea.getRows()+";");
				
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
