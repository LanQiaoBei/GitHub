package print1;

import java.util.Scanner;

public class Main {
	public static void print(int x) {
		for(int i=0;i<x;i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++) {
			int temp=sc.nextInt();
			print(temp);
		}
	}

}
