package studentManagmet;
import javax.swing.JOptionPane;

public class Student extends Person {
	private String id;
	private String major;
	private Double gpa;
	
	public void setData() {
		String temp;
		super.setData();
		id=JOptionPane.showInputDialog(null,"������ѧ��");
		major=JOptionPane.showInputDialog(null,"������רҵ");
		while(true) {
			try {
				temp=JOptionPane.showInputDialog(null,"������ѧ��");
				gpa=Double.parseDouble(temp);
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "������Ϸ���ѧ��");	
			}
		}
	}
	
	public void display() {
		super.display();
		System.out.println("\tѧ��:"+id+"\tרҵ:"+major+"\tѧ��:"+gpa);
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
