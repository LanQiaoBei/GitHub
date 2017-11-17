package student;

  public class Student {
	public String name;
	public String studentID;
	public String address;
	protected String major;
	private float gpa;
	
	public void register() {
	}
	
	//获得平均成绩绩点数
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