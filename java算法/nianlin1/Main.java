package nianlin1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第五个人年龄是:"+getAge(5));
	}
	public static int getAge(int x) {
		if(x==1) return 10;
		return 2+getAge(x-1);
	}

}
