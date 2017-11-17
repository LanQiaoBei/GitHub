package studentManagmet;
import javax.swing.JOptionPane;

public class Student extends Person {
	private String id;
	private String major;
	private Double gpa;
	
	public void setData() {
		String temp;
		super.setData();
		id=JOptionPane.showInputDialog(null,"请输入学号");
		major=JOptionPane.showInputDialog(null,"请输入专业");
		while(true) {
			try {
				temp=JOptionPane.showInputDialog(null,"请输入学分");
				gpa=Double.parseDouble(temp);
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "请输入合法的学分");	
			}
		}
	}
	
	public void display() {
		super.display();
		System.out.println("\t学号:"+id+"\t专业:"+major+"\t学分:"+gpa);
	}

	public String getId() {
		return id;
	}

	public String getMajor() {
		return major;
	}

	public Double getGpa() {
		return gpa;
	}
	
}
