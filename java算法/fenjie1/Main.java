package fenjie1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		a=sc.nextInt();
		System.out.println("请再输入一个正整数:");
		b=sc.nextInt();
		Fenjie fj=new Fenjie();
		m=fj.fenjie(a, b);
		n=a*b/m;
		System.out.println("最大公因数为:"+m);
		System.out.println("最小公倍数为:"+n);
	}
}

class Fenjie {
	public int fenjie(int x,int y) {
		if(x>y) {
		int temp=x;
			x=y;
			y=temp;
		}
		while(y!=0) {
			int k=x%y;
			x=y;
			y=k;
		}
		return x;
	}
}
