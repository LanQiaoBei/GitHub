package Test4;

import java.util.Arrays;
import java.util.Scanner;

public class XiTi4_2_arraySort {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[3];
		int i;
		sc = new Scanner(System.in);
		System.out.println("请输入3个数:");
		
		for( i = 0 ; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("从小到大的顺序是:"+ arr[0] + " " + arr[1] + " " + arr[2]);
	}

}
