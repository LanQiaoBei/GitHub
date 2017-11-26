package juzhen;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,sum1=0,sum2=0,sum=0;
		Random rand=new Random();
		int[][] arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				arr[i][j]=rand.nextInt(100)+1;
				System.out.print(arr[i][j]+"\t");
			}
				System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				if(i==j) sum1=sum1+arr[i][j];
				if(i+j==arr.length-1 && i!=j) sum2=sum2+arr[i][j];
			}
			sum=sum1+sum2;
		}
		System.out.println("对角线和为:"+sum);
	}
}
