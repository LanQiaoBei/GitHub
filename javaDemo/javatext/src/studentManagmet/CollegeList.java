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
		input=JOptionPane.showInputDialog(null,"输入C录入教师信息"+"\n输入S录入学生信息"+"\n输入Q退出");
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
				JOptionPane.showMessageDialog(null, "对不起，录入太多教师信息");
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
					JOptionPane.showMessageDialog(null, "对不起，录入太多的学生信息");
			}
			input=JOptionPane.showInputDialog(null,"输入C教师信息"+"\n输入S录入学生信息"+"\n输入Q退出");
			input=input.toUpperCase();
			letter=input.charAt(0);
		}
		System.out.println("\n教师信息:");
		if(empCount == 0) System.out.println("没有录入教师信息");
		else 
			for(x=0;x<empCount;++x) emp[x].display();
		System.out.println("\n以上教师中的最高年薪:"+maxAnnualSalary+"平均年薪:"+sumAnnualSalary/empCount);
		System.out.println("\n学生信息:");
		if(stuCount == 0) System.out.println("没有录入学生信息");
		else
			for(x=0;x<stuCount;++x) stu[x].display();
		System.out.println("\n以上学生中的最高学分:"+maxGpa+"平均学分:"+sumGpa/stuCount);
		System.exit(0);
	}	
}
