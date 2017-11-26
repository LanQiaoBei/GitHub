package runnian1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum=0,days = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年月日:");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		for(int i=1;i<month;i++) {
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: days=31;break;
		case 4:
		case 6:
		case 9:
		case 11:days=30;break;
		case 2:if( (year%4==0&&year%100!=0)||year%400==0) { 
			days =29;
		} else {
			days=28;
		}
		break;
		}
		sum=sum+days;
		}
		sum=sum+day;
		System.out.println("总共有:"+sum);
	}

}
