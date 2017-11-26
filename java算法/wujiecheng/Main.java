package wujiecheng;
public class Main {
	static int value=0;
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
		value=f(i);
		}
		System.out.println(value);
	}
	public static int f(int x) {
		if(x==1) return 1;
		return x*f(x-1);
		
	}
}
