package text8;

import java.awt.*;

import javax.swing.*;

public class UseLabel {
	public static void main(String[] args) {
		JFrame frm=new JFrame("��ʾ��ͼ��ı�ǩ");
		frm.setLayout(null);
		
		//������ǩ���,����λ�ü���С����ʾ���塢����ͼƬ
		JLabel label=new JLabel("��ʾ22�Ŵ�����");
		label.setBounds(5, 5, 220, 100);
		label.setFont(new Font("",Font.BOLD,22));
		label.setIcon(new ImageIcon("label.jpg"));
		label.setHorizontalAlignment(JLabel.LEFT);
		
		//���ñ�ǩ���ͼƬ��λ��,��JDK�߰汾���������µľ�̬����
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		frm.add(label);
		frm.setBounds(450, 200, 230, 130);
		frm.setVisible(true);
	}
}
