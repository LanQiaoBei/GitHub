package testbook3;

public class Ex5_6_this2 {
	int x =188,y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5_6_this2 e = new Ex5_6_this2();
		e.f();

	}
	void f() {
		int x = 3;
		y = x;
		System.out.println("y="+y);
		
		y = this.x;
		System.out.println("y="+y);
	}

}
