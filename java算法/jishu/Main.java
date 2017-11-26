package jishu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=4,sum=0;
		System.out.println("组成1位数的奇数有:"+s);
		s=7*s;
		System.out.println("组成2位数的奇数有:"+s);
		for(int j=3;j<9;j++) {
			s=s*8;
			System.out.println("组成"+j+"位数的奇数有:"+s);
			sum=sum+s;
		}
		System.out.println("总共有"+(sum+4+28)+"个奇数");
	}
}
