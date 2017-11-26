package runnian2;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年,月,日:");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		Calendar cal=Calendar.getInstance();
		cal.set(year, month-1,day);
		int sum=cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("第"+sum+"天!");
	}

}
