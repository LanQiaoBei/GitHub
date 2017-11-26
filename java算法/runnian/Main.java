package runnian;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年月日:");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		switch(month) {
		case 1:sum=0;break;
		case 2:sum=31;break;
		case 3:sum=59;break;
		case 4:sum=90;break;
		case 5:sum=120;break;
		case 6:sum=151;break;
		case 7:sum=181;break;
		case 8:sum=212;break;
		case 9:sum=243;break;
		case 10:sum=273;break;
		case 11:sum=304;break;
		case 12:sum=334;break;
		default:System.out.println("输入错误");
		}
		sum=sum+day;
		if(year%400==0 ||(year%4==0&&year%100!=0)) {
			if(month>=2) 
				sum=sum+1;
		}
		System.out.println(sum);
	}

}
