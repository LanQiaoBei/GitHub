package yiwei1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组元素个数n:");
		int n=sc.nextInt();
		System.out.println("请输入要移动的位数m:");
		int m=sc.nextInt();
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			System.out.println("请输入第"+(i+1)+"个元素:");
			list.add(sc.nextInt());
		}
		
		System.out.println("排序前:");
		for(int i: list) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		List<Integer> temp1=list.subList(list.size()-m, list.size());
		List<Integer> temp2=list.subList(0, list.size()-m);
		temp2.addAll(0,temp1);
		
		System.out.println("排序后:");
		for(int i: temp2) {
			System.out.print(i+" ");
		}
	}
}
