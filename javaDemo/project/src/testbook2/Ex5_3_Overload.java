package testbook2;

import student.Student;

public class Ex5_3_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1,s2;
		s1 = new Student();
		s2 = new Student();
		
		s1.setInfo("��ǿ","20100038","ɽ��̫ԭ");
		s2.setInfo(23.5f, "20100089");
		s2.getInfo(23.5f);
		s2.getInfo("ɽ��̫ԭ");

	}
	

}
