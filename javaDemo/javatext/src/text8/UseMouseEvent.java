package text8;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class UseMouseEvent {
	public static void main(String[] args) {
		JFrame frm=new JFrame("���������¼�����");
		frm.setLayout(null);
		
		
		JLabel label1=new JLabel("���ڴ������ƶ����,");
		label1.setBounds(15,5,200,25);
		frm.add(label1);
		JLabel label2=new JLabel("��ס�������϶����!");
		label2.setBounds(15,30,200,25);
		frm.add(label2);
		
		//�����ı������
		JTextField text=new JTextField(30);
		text.setBounds(15,55,200,30);
		frm.getContentPane().add(text);
		
		//ע�������,����Ϊ�¼������߶���
		MouseListenerImp mouse=new MouseListenerImp(text);
		frm.addMouseListener(mouse);
		frm.addMouseMotionListener(mouse);
		frm.addWindowListener(mouse);
		
		frm.setBounds(500,250,250,150);
		frm.setVisible(true);
	}
}

//ʵ����ꡢ������صĽӿ�
class MouseListenerImp implements MouseMotionListener,MouseListener,WindowListener {
	JTextField text;
	
	public MouseListenerImp(JTextField text) {
		this.text=text;
	}
	
	public void mouseDragged(MouseEvent e) {
		String s="��ҷ���,����:X="+e.getX()+",Y="+e.getY();
		text.setText(s);
	}
	
	public void mouseExited(MouseEvent e) {
		String s="����뿪�˴���";
		text.setText(s);
	}
	
	public void windowClosing(WindowEvent e) {
		//Ϊ��ʹ�����������ر�,���������˳�
		System.exit(1);
	}
	
	//������ʵ���¹��ܵķ���,�÷�����Ϊ�ռ���,������û����Щ�շ���
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}