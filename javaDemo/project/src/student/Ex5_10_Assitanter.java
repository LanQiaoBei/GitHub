package student;
import course.Course;


public class Ex5_10_Assitanter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examination exam;
		Student1 zhangGang = new Student1(19,"山西太原","张刚",350);
		Teacher missLiu = new Teacher(35,"beijing","刘老师",2000,"102198");
		ComputerCourse c1 = new ComputerCourse(missLiu,"12345",3.5f,"必修","java语言程序设计技术","5");
		

	}
}

class Examination {
	Student1 student;
	float score;
	Course course;
	
	public Examination(Student1 student,Course course,float score) {
		this.student = student;
		this.course = course;
		this.score = score;
	}
	
	public float putCredit() {
		float c = 0.0f;
		if(score >= 60) {
			c = course.credit;
			System.out.println("通过考试,实际学分为"+c);
		}
		if(score < 60) {
			c = 0;
			System.out.println("未通过考试,实际学分为"+c);
		}
		
		//System.out.println("课程性质"+courseCharacter);
		//courseCharacter 为protected权限，不可被不同包的非子类访问
		return c;
	}
	
}

class ComputerCourse extends Course {
	Teacher teacher;
	
	public ComputerCourse(Teacher teacher,String courseID,float credit,String courseCharacter,String description,String term) {
		super(courseID,credit,courseCharacter,description,term);
		this.teacher = teacher;
	}
	
	public void putInfo() {
		System.out.println("课程编号"+courseID);
		System.out.println("学分"+credit);
		System.out.println("课程性质"+courseCharacter);
		//System.out.println("开设学期"+term);//term为private权限,不可被不同包的子类访问
		//System.out.println("课程介绍"+description);description 为默认权限，不可被不同的包的子类访问
	}
}