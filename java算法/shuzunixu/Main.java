package shuzunixu;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组的长度:");
		int l=sc.nextInt();
		int[] arr=new int[l];
		Random rand=new Random();
		for(i=0;i<l;i++) {
			arr[i]=rand.nextInt(100)+1;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(i=l-1;i>=0;i--) System.out.print(arr[i]+"\t");
	}
}
