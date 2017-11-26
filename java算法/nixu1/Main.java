package nixu1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入不大于100000的一个正整数:");
		String str=sc.next();
		if(str.matches("\\d+")) { // \\d+   数字出现1次或多次
			System.out.println("输入的是"+str.length()+"位数!");
			StringBuffer buf=new StringBuffer(str);
			System.out.println(buf.reverse());//字符串反转
		}
	}
}
