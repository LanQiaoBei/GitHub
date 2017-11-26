package quzhi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个7位以上都数:");
		long l=sc.nextLong();
		if(l<=999999) {
			System.out.println("输入错误,请重新输入!");
			System.exit(0);
		}
		String str=Long.toString(l);
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(i>=3 && i<=6) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
