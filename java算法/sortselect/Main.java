package sortselect;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=rand.nextInt(100)+1;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		int j = 0;
		for(int i=0;i<=arr.length-1;i++) {
			int min=i;
				for(j=i+1;j<=arr.length-1;j++) {
					if(arr[j]<arr[min]) {
						min=j;
						}
					}
			int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+"\t");
		}	
	}
}
