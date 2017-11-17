package text7;

import java.util.Scanner;

public class DefineException {
	public static void main(String[] args) {
		final int MIN=25,MAX=40;
		Scanner scan = new Scanner(System.in);
		OutOfRangException problem=new OutOfRangException();
		System.out.println("输入"+MIN+"至"+MAX+"之间的整数:");
		try {
			int value=scan.nextInt();
			if(value<MIN||value>MAX) 
				throw problem;
		} catch (OutOfRangException e) {
			System.out.println(e.toString());
		}
		System.out.println("主方法结束.");	
	}
}

class OutOfRangException extends Exception {
	OutOfRangException() {
		super("输入数据超出范围!");
	}
}
