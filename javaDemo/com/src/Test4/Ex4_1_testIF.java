package Test4;

import java.util.Scanner;

public class Ex4_1_testIF {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈë³É¼¨:");
		int score = sc.nextInt();
		
		if(score >= 0 && score <= 100) 
		{
			System.out.println("³É¼¨:" + score);
		}
		sc.close();
	}

}
