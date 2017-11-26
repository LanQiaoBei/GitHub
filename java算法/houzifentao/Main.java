package houzifentao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=6;;i++) { //最后一只猴子最少分6个桃
			sum=i;
			for(int j=0;j<5;j++) { //分的次数循环
				if((sum-1)%5==0 && j<5) { //如果扔一个后能均分,则继续
					sum=(sum-1)/5*4; //每分一次剩余桃子数
				if(j==4) { //如果已分5次仍能除尽,输出,退出程序
					System.out.println(i);
					System.exit(0);
					}
				}
			}
		}
	}

}
