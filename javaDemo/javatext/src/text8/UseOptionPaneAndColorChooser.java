package text8;

import java.awt.*;

import javax.swing.*; 

public class UseOptionPaneAndColorChooser {
	public static void main(String[] args) {
		final JFrame frm=new JFrame("ʹ�����ֱ�׼�Ի���");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		
		String str=JOptionPane.showInputDialog(frm,"���!��������Ի���",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frm, "���������:"+str,"��Ϣ�Ի���",JOptionPane.PLAIN_MESSAGE);
		int t=JOptionPane.showConfirmDialog(frm,"��ѡ���Ƿ��˳�,ѡ����ɫ��","ȷ�϶Ի���",JOptionPane.YES_NO_OPTION);
		Color c;
		if(t==JOptionPane.NO_OPTION)
			c=JColorChooser.showDialog(frm, "��ɫѡ��Ի���", Color.BLUE);
		else
			JOptionPane.showMessageDialog(frm, "δ��ʾ��ɫѡ��Ի���!","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);
		frm.setBounds(400, 200, 450, 300);
		frm.setVisible(true);
	}
}
