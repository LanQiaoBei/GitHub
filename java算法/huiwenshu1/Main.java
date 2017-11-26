package huiwenshu1;

import java.util.Scanner;

public class Main {
	static int[] a=new int[5];
	static int[] b=new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean is = false;
		 System.out.println("请输入一个五位数:");
		 Scanner sc=new Scanner(System.in);
		 long l=sc.nextLong();
		 if(l<10000 ||l>99999) {
			 System.out.println("输入错误!请输入五位数");
			l=sc.nextLong();
		 }
		 for(int i=4;i>=0;i--) {
			 a[i]=(int)(l/(long)Math.pow(10, i));
			 l=(l%(long)Math.pow(10, i));
		 }
		 System.out.println();
		 for(int i=0,j=0;i<=4;i++,j++) {
			 b[j]=a[i];
		 }
		 for(int i=0,j=4;i<=4;i++,j--) {
			 if(a[i]!=b[j]) {
				 is=false;
				 break;
			 } else {
				 is=true;
			 }
		 }
		 if(is==false) System.out.print("不是回文数!");
		 else System.out.print("是回文数!");
	}

}
