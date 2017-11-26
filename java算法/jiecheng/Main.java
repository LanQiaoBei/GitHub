package jiecheng;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(int i=1;i<=20;i++) {
		 sum=sum+f(i);
		}
		System.out.println(sum);
	}
	public static long f(int x) {
		if(x==1)
			return 1;
		return x*f(x-1);
		
	}
}
