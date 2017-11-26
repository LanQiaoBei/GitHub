package suanfa;

import java.util.Scanner;

public class Day {
	public static void main(String[] args) {
		String c;
		final String Y=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("please input the first letter of someday");
		c=sc.next();
			switch(c) {
			case "s":System.out.println("please input the second letter");
			c=sc.next();
			if("a".equals(c)) System.out.println("saturday");
			else if("u".equals(c))System.out.println("sunday");
			break;
			case "t":System.out.println("please input the second letter");
			c=sc.next();
			if("h".equals(c))System.out.println("thursday");
			else if("u".equals(c))System.out.println("tuesday");
			break;
			case "w":System.out.println("wensday");break;
			case "m":System.out.println("monday");break;
			case "f":System.out.println("friday");break;
			default:System.out.println("Day error");
		}
	}
}

