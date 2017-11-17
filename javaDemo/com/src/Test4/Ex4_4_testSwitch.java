package Test4;

public class Ex4_4_testSwitch {
	public static void main(String[] args)
	{
		//产生一个1~4之间的随机数
		int random = 1 +(int)(Math.random()*4);
		switch(random) {
		case 1:
			System.out.println("I feel fine");
			break;
		case 2:
			System.out.println("I've benn better");
			break;
		case 3:
			System.out.println("I feel horrible");
			break;
		case 4:
			System.out.println("I feel terrific");
		}
	}

}
