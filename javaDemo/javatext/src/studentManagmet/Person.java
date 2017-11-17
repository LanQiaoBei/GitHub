package studentManagmet;

import javax.swing.JOptionPane;

public class Person {
	private String name;
	private String gender;
	private String address;
	private String phone;
	
	public void setData() {
		name=JOptionPane.showInputDialog(null,"请输入姓名");
		gender=JOptionPane.showInputDialog(null,"请输入性别");
		address=JOptionPane.showInputDialog(null,"请输入地址");
		phone=JOptionPane.showInputDialog(null,"请输入电话");
	}
	
	public void display() {
		System.out.println("姓名:"+name+"\t性别:"+gender+"\t地址:"+address+"\t电话:"+phone);
	}

}
