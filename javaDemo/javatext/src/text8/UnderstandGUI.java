package text8;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UnderstandGUI {
	public static void main(String[] args) {
		//��������
		JFrame frm=new JFrame();
		
		//���ñ���
		frm.setTitle("���GUI���");
		//���ò���
		frm.setLayout(new BorderLayout());
		//������ť���
		JButton myBtn=new JButton("��ť");
		
		//����ť���������ӵ�������
		frm.add(myBtn);
		
		//��ʾ��δ����¼�
		//���ô��ڳ�ʼλ�����С����ʾ
		frm.setBounds(500,200,200,100);
		//���ô���رշ�ʽ
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�ô�����ʾ
		frm.setVisible(true);
		}
}
