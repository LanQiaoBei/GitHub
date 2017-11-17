package text5;

public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass sc1 = new SubClass();
		SubClass sc2 = new SubClass(400);
	}

}

class SuperClass {
	private int n;
	
	SuperClass() {
		System.out.println("SuperClass()");
	}
	
	SuperClass(int n) {
		System.out.println("SuperClass("+n+")");
		this.n = n;
	}
	
}

class SubClass extends SuperClass {
	private int n;
	SubClass(int n) {
		super();
		System.out.println("SuperClass("+n+")");                          
		this.n = n;
	}
	
	SubClass() {
		super(300);
		System.out.println("SubClass()");
	}
	
}
