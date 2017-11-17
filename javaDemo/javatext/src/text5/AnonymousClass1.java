package text5;

public class AnonymousClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.f(new Show() {
			public void show() {
				System.out.println("实现了接口的匿名类");
			}
			
		});
	}
}

interface Show {
	public void show();
}

class A {
	void f(Show s) {
		s.show();
	}
	
}
