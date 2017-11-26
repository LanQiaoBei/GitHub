package sandaxiao1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三位数:");
		int[] arr=new int[3];
		for(i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<3;i++) {
		System.out.print(arr[i]+" ");
		}
	}
}
