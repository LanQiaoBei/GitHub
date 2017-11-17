package studentManagmet;

import javax.swing.JOptionPane;

public class CollegeEmployee extends Person {
	private String ssn;
	private double annualSalary;
	
	public void setData() {
		String temp;
		super.setData();
		ssn=JOptionPane.showInputDialog(null,"请输入教师社会保险号");
		while(true) {
			try {
			temp=JOptionPane.showInputDialog(null,"请输入教师年薪");
			annualSalary=Double.parseDouble(temp);
			break;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "请输入合法的薪水");
			}
		}
	}
	
	public void display() {
		super.display();
		System.out.println("\tSSN:"+ssn+"\t年薪:"+annualSalary);
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

}
