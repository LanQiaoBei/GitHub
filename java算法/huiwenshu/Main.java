package huiwenshu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个五位数:");
		int n=sc.nextInt();
		if(n<10000 || n>99999) {
			System.out.println("输入错误!");
			System.exit(0);
		}
		m.panduan(n);
	}
	public void panduan(int x) {
		int a=x/10000;
		int b=x/1000%10;
		int c=x%100/10;
		int d=x%10;
		if(a==d && b==c) {
			System.out.println(x+"是回文数!");
		}
		else System.out.println(x+"不是回文数!");
	}
}
