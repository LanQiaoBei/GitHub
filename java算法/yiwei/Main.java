package yiwei;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组的长度n:");
		int n=sc.nextInt();
		System.out.println("请输入要移动的位数m:");
		int m=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("请输入第"+(i+1)+"个数组元素的值");
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("排序前:");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<m;i++) {
			arr2[i]=arr1[n-m+i];
		}
		
		for(int i=n-m-1;i>=0;i--) {
			arr1[i+m]=arr1[i];
		}
		
		for(int i=0;i<m;i++) {
			arr1[i]=arr2[i];
		}
		
		System.out.println("排序后:");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
