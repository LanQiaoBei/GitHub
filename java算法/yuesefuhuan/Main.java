package yuesefuhuan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入n的值:");
		int n=sc.nextInt();
		boolean[] arr=new boolean[n];
		for(int i=0;i<n;i++) {
			arr[i]=true;  //下标为true说明还在圈内
		}
		
		int leftCount=n;  //留在圈内的人
		int countNum=0; //存取报数结果
		int index=0; 
		
		while(leftCount>1) {
			if(arr[index]==true) {  //当还在圈内时
				countNum++; //报数增加
			}
			if(countNum==3) {
				countNum=0; //从零开始继续报数
				arr[index]=false; //此人退出圈子
				leftCount--; //剩余人数减一
			}
			index++; //每报一次数,下标加1
			if(index==n) {//index是循环数,当下标大于n时,说明已经数完一圈了
				index=0; //下标置零,重新开始
			}
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]==true) {
				System.out.println("剩下的人是第:"+(i+1)+"个人");
			}
		}
	}
}
