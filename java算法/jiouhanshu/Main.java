package jiouhanshu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈënµÄÖµ:");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(oushu(n));
		} else System.out.println(jishu(n));
	}
	
	public static double oushu(int x) {
		double result=0;
		for(int i=2;i<=x;i=i+2) {
			result+=1/(double)i;
		}
		return  result;
	}
	
	public static double jishu(int x) {
		double result=0;
		for(int i=1;i<=x;i=i+2) {
			result+=1/(double)i;
		}
		return result;
	}
}
