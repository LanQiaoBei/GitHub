package lirun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double sum;
		System.out.println("请输入当月利润(单位:万元)");
		Scanner sc=new Scanner(System.in);
		double lirun=sc.nextDouble();
		if(lirun<=10) {
			sum=lirun*0.1;
		} else if(lirun<=20) {
			sum=10*0.1+(lirun-10)*0.075;
		} else if(lirun<=40) {
			sum=10*0.1+10*0.075+(lirun-20)*0.05;
		} else if(lirun<=60) {
			sum=10*0.1+10*0.075+10*0.05+(lirun-40)*0.03;
		} else if(lirun<=100) {
			sum=10*0.1+10*0.075+10*0.05+10*0.03+(lirun-60)*0.015;
		} else {
			sum=10*0.1+10*0.075+10*0.05+10*0.03+10*0.015+(lirun-100)*0.01;
		}
		System.out.println("应发放的奖金为:"+sum+"万元");
	}

}
