package fenjie;

import java.util.Scanner;

public class Main {
	static int z,n,m,a;
	public static void main(String[] args) {
		Fenjie fj=new Fenjie();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入正整数n的值:");
		 n=sc.nextInt();
		 System.out.println("请输入正整数m的值:");
		 m=sc.nextInt();
		z=fj.fenjie(n,m);
		a=n*m/z;
		System.out.println("最大公因数为:"+z);
		System.out.println("最小公倍数为:"+a);
	}
}

class Fenjie {
	public int  fenjie(int x,int y) {
		int temp;
		if(x<y) {
			temp=x;
			x=y;
			y=temp;
		}
		temp=x%y;
		while(temp!=0) {
			x=y;
			y=temp;
			temp=x%y;
		}
		return y;
	}
}
