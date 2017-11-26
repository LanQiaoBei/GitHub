package charu;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,temp;
		Random rand=new Random();
		int[] arr=new int[11];
		for(int i=0;i<10;i++) {
			arr[i]=rand.nextInt(100)+1;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			for(j=1;j<10-i;j++) {
				if(arr[j-1]<arr[j]) {
					 temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			System.out.print(arr[j-1]+"\t");
		}
		System.out.println("\n请输入一个数:");
		Scanner sc=new Scanner(System.in);
		arr[10]=sc.nextInt();
		for(int i=0;i<10;i++) 
			if(arr[10]>arr[i]) {
				 temp=arr[10];
				for(j=10;j>i;j--)
					arr[j]=arr[j-1];
					arr[i]=temp;                                  
			}	
		for(int i=10;i>=0;i--)
			System.out.print(arr[i]+"\t");
	}
}
