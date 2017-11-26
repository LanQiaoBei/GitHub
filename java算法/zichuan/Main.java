package zichuan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入主串:");
		String str1=sc.nextLine();
		System.out.println("请输入子串:");
		String str2=sc.nextLine();
		
		String[] sa=new String[str1.length()-str2.length()+1]; //生成子串长度的n个字符串数组
		for(int i=0;i<sa.length;i++) {
			sa[i]=str1.substring(i, i+str2.length());
		}
		
		int sum=0;
		//子串与n个拆开子串对比
		for(int i=0;i<sa.length;i++) {
			if(sa[i].equals(str2)) {
				sum++; //成功配对,加1
				i=i+str2.length(); //不计算重叠的子串,跳过配对之后的部分拆分子串
			}	
		}
		System.out.println("子串出现的次数为:"+sum);
	}

}
