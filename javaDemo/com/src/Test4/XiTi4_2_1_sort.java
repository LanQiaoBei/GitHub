package Test4;

import java.util.Scanner;

public class XiTi4_2_1_sort {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("������3������:");
		int sc1 = sc.nextInt();
		int sc2 = sc.nextInt();
		int sc3 = sc.nextInt();
		int temp;
		
		if(sc1 > sc2)
		{
			temp = sc1;
			sc1 = sc2;
			sc2 = temp;
		}
		
		if(sc1 > sc3)
		{
			temp = sc1;
			sc1 = sc3;
			sc3 = temp;
		}
		
		if(sc2 > sc3) 
		{
			temp = sc2;
			sc2 = sc3;
			sc3 = temp;
		}
		
		System.out.println("��С�����˳����:");
		System.out.println(sc1 + " " +  sc2 + " " + sc3);

	}

}
