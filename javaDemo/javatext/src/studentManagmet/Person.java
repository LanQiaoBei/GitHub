package studentManagmet;

import javax.swing.JOptionPane;

public class Person {
	private String name;
	private String gender;
	private String address;
	private String phone;
	
	public void setData() {
		name=JOptionPane.showInputDialog(null,"����������");
		gender=JOptionPane.showInputDialog(null,"�������Ա�");
		address=JOptionPane.showInputDialog(null,"�������ַ");
		phone=JOptionPane.showInputDialog(null,"������绰");
	}
	
	public void display() {
		System.out.println("����:"+name+"\t�Ա�:"+gender+"\t��ַ:"+address+"\t�绰:"+phone);
	}

}
