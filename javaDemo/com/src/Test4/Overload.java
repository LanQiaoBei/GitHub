package Test4;



public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1,s2;
		s1 = new Student();
		s2 = new Student();
		
		s1.setInfo("赵强","20100038","山西太原");
		s2.setInfo(23.5f, "20100089");
		s2.getInfo(23.5f);
		s2.getInfo("山西太原");

	}
	
}
	class Student {
		public String name;
		public String studentID;
		private String address;
		public String mobilephone;
		protected String major;
		private float gpa;
		
		public void register() {
		}
		
		//获得平均成绩点数
		public float getgpa() {
			return gpa;
		}
		
		//修改平均成绩点数
		public void setgpa() {
			gpa = 23.5f;
		}
		
		public void setInfo(String n,String ID) {
			name = n;
			studentID = ID;
		}
		
		public void setInfo(String n,String ID,String add) {
			name = n;
			studentID = ID;
			address = add;
		}
		
		public void setInfo(float g,String ID) {
			gpa = g;
			studentID = ID;
		}
		
		public void getInfo(float g) {
			System.out.println("学号:"+studentID +"\t平均成绩点数:"+g);
		}
		public void getInfo(String add) {
			System.out.println("学号:"+studentID+"\t姓名:"+name +"\t地址:"+add);
		}
	  }
	



