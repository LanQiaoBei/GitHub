package wujiecheng1;

import java.util.Scanner;

public class Main {
	public static long f(int x) {
		long value=0;
		if(x==0||x==1) value=1;
		else if(x>1) value=x*f(x-1);
		return value;
	}
	public static void main(String[] args) {
		int value=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数:");
		int n=sc.nextInt();
		System.out.println(n+"的阶乘是:"+f(n));
	}

}
