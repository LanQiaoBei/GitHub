package text8;

import javax.swing.*;

public class NoUseLayout {
	public static void main(String[] args) {
		//�������岢���ô�����⼰�رշ�ʽ
		JFrame frm=new JFrame("δʹ�ò��ֹ���");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ò�ʹ�ò��ֹ�����
		frm.setLayout(null);
		
		//�����û���ǩ��������ʾ��Ϣ����ʼλ�����С
		JLabel userLabel=new JLabel("�û���:");
		//userLabel.setText("�û���:");
		userLabel.setBounds(40,20,80,30);
		
		//�����û�������򣬿ɱ༭��������룬20�У���������ʼλ�����С
		JTextField userText=new JTextField();
		userText.setEditable(true);
		userText.setHorizontalAlignment(SwingConstants.LEFT);
		userText.setColumns(20);
		userText.setBounds(100,20,120,30);
		
		//������¼��ť,��������ʼλ�����С
		JButton loginBtn=new JButton("��¼");
		loginBtn.setBounds(130,60,60,30);
		
		//����ǩ�������Ͱ�ť���뵽�����������
		frm.add(userLabel);
		frm.add(userText);
		frm.add(loginBtn);
		
		//���ô���λ�����С����ʾ
		frm.setBounds(400,200,300,160);
		frm.setVisible(true);
	}
}