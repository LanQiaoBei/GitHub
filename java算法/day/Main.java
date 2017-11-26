package day;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char second;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入星期几的第一个字母:");
		String str=sc.next();
		if(str.length()==1) {
			char first=str.charAt(0);
			switch(first) {
			case 'm':
			case 'M':System.out.println("星期一");
			break;
			case 't':
			case 'T':System.out.println("请输入第二个字符:");
			str=sc.next();
			if(str.length()==1) {
				second=str.charAt(0);
				if(second=='u' || second=='U') { 
					System.out.println("星期二");
				break;
				} else if(second=='h' || second=='H') {
				System.out.println("星期四");
				break;
				}
			} else System.out.println("输入错误,请输入一个字母!");
			case 'w':
			case 'W':System.out.println("星期三"); break;
			case 'f':
			case 'F':System.out.println("星期五");break;
			case 's':
			case 'S':System.out.println("请输入第二个字符:");
			str=sc.next();
			if(str.length()==1) {
				second=str.charAt(0);
				if(second=='a' || second=='A') {
					System.out.println("星期六");
					break;
				} else if(second=='u'||second=='U') {
					System.out.println("星期天");
					break;
				}
			} else System.out.println("输入错误,请输入一个字母");
			default:System.out.println("输入错误,请输入星期几的第一个字母!");
			}
		} else System.out.println("输入错误,请输入一个字母!");
	}

}
