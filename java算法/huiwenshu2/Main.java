package huiwenshu2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个五位数:");
		String str=sc.next();
		int i=Integer.parseInt(str);
		if(i<10000 || i>99999) {
			System.out.println("输入错误,请输入一个五位数!");
			System.exit(0);
		}
		boolean is=false;
		char[] arr=str.toCharArray();
		for(int j=0;j<arr.length/2;j++) {
			if(arr[j]!=arr[arr.length-1-j]) {	
				is=false;
			}  else  {
				is=true;
			}
		}
			if(is==true) {
				System.out.println(i+"是回文数");
			} else {
				System.out.println(i+"不是回文数");
			}
	}
}
