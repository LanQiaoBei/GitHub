package text5;

abstract class Student3 {
	abstract void speak();
}

class Teacher2 {
	void look(Student3 s) {
		s.speak();
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher2 zhang = new Teacher2();
		Student3 liu = new Student3() {
			void speak() {
				System.out.println("�����������еķ���");
			}
		};
		zhang.look(liu);
	}
}
