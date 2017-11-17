package studentManagmet;

import javax.swing.JOptionPane;

public class CollegeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeEmployee[] emp = new CollegeEmployee[10];
		Student[] stu = new Student[20];
		int empCount=0,stuCount=0;
		char letter;
		String input;
		int x;
		double maxAnnualSalary=0,sumAnnualSalary=0,tempAnnualSalary;
		double maxGpa=0,tempGpa,sumGpa=0;
		input=JOptionPane.showInputDialog(null,"����C¼���ʦ��Ϣ"+"\n����S¼��ѧ����Ϣ"+"\n����Q�˳�");
		input=input.toUpperCase();
		letter=input.charAt(0);
		while(letter !='Q') {
			if(letter == 'C') {
				if(empCount < emp.length) {
					CollegeEmployee c = new CollegeEmployee();
					c.setData();
					emp[empCount]=c;
					++empCount;
					tempAnnualSalary=c.getAnnualSalary();
					sumAnnualSalary=sumAnnualSalary+tempAnnualSalary;
					if(tempAnnualSalary > maxAnnualSalary)  maxAnnualSalary=tempAnnualSalary;
					} else
				JOptionPane.showMessageDialog(null, "�Բ���¼��̫���ʦ��Ϣ");
			} else if(letter == 'S') {
				if(stuCount < stu.length) {
					Student s = new Student();
					s.setData();
					stu[stuCount] = s;
					++stuCount;
					tempGpa = s.getGpa();
					sumGpa = sumGpa + tempGpa;
					if(maxGpa < tempGpa)  maxGpa=tempGpa;
				} else 
					JOptionPane.showMessageDialog(null, "�Բ���¼��̫���ѧ����Ϣ");
			}
			input=JOptionPane.showInputDialog(null,"����C��ʦ��Ϣ"+"\n����S¼��ѧ����Ϣ"+"\n����Q�˳�");
			input=input.toUpperCase();
			letter=input.charAt(0);
		}
		System.out.println("\n��ʦ��Ϣ:");
		if(empCount == 0) System.out.println("û��¼���ʦ��Ϣ");
		else 
			for(x=0;x<empCount;++x) emp[x].display();
		System.out.println("\n���Ͻ�ʦ�е������н:"+maxAnnualSalary+"ƽ����н:"+sumAnnualSalary/empCount);
		System.out.println("\nѧ����Ϣ:");
		if(stuCount == 0) System.out.println("û��¼��ѧ����Ϣ");
		else
			for(x=0;x<stuCount;++x) stu[x].display();
		System.out.println("\n����ѧ���е����ѧ��:"+maxGpa+"ƽ��ѧ��:"+sumGpa/stuCount);
		System.exit(0);
	}	
}
