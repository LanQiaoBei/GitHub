package yuesefuhuan1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入人数:");
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=1;
		}
		int left=arr.length;
		int j=0;
		int num=0;
		while(left>1) {
			if(arr[j]==1) {
				num++;
			}
			if(num==3) {
				num=0;
				arr[j]=0;
				left--;
			}
			j++;
			if(j==arr.length) {
				j=0;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				System.out.println("剩下的那个人是"+(i+1)+"号");
			}
		}
	}
}
