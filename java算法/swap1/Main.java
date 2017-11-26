package swap1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp1,temp2,max=0,min=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组的长度:");
		int l=sc.nextInt();
		int[] arr=new int[4];
		System.out.println("请依次输入数组元素值:");
		for(int i=0;i<l;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<l;i++) {
			if(arr[i]>arr[max]) max=i;
			if(arr[i]<arr[min]) min=i;
		}
		temp1=arr[0];
		arr[0]=arr[max];
		arr[max]=temp1;
		
		temp2=arr[min];
		
		if(min!=0) {
			arr[min]=arr[l-1];
			arr[l-1]=temp2;
		} else {
			arr[max]=arr[l-1];
			arr[l-1]=temp1;
		}
		for(int i=0;i<l;i++)
		System.out.print(arr[i]+" ");
	}

}
