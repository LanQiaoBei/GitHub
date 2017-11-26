package sortnum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈë3¸öÊı");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x>y) {
			int t=x;
			x=y;
			y=t;
		}
		if(x>z) {
			int t=x;
			x=z;
			z=t;
		}
		if(y>z) {
			int t=y;
			y=z;
			z=t;
		}
		System.out.println(x+" "+y+" "+z);
	}

}
