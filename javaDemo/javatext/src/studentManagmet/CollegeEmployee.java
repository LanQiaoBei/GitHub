package studentManagmet;

import javax.swing.JOptionPane;

public class CollegeEmployee extends Person {
	private String ssn;
	private double annualSalary;
	
	public void setData() {
		String temp;
		super.setData();
		ssn=JOptionPane.showInputDialog(null,"�������ʦ��ᱣ�պ�");
		while(true) {
			try {
			temp=JOptionPane.showInputDialog(null,"�������ʦ��н");
			annualSalary=Double.parseDouble(temp);
			break;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "������Ϸ���нˮ");
			}
		}
	}
	
	public void display() {
		super.display();
		System.out.println("\tSSN:"+ssn+"\t��н:"+annualSalary);
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

}
