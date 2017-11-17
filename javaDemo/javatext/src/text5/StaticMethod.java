package text5;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(staticTestFunction.addUp(10,5));
		//System.out.println(staticTestFunction.sub());实例方法不能被类直接调用
		staticTestFunction test = new staticTestFunction();
		System.out.println(test.sub());
	}
}

class staticTestFunction {
	int x=10,y=6;
	static int z = 9;
	
	public static int addUp(int a,int b) {
		return a+b+z;
	}
	
	public int sub() {
		return x-y;
	}	
	/*public static int addUp() {
		//return x+y;
	}*/
}
