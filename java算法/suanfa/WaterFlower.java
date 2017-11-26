package suanfa;

public class WaterFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=999;i++) {
			int a=i/100;
			int b=i/10%10;
			int c=i%10;
			if(a*a*a+b*b*b+c*c*c==i) {
				System.out.print(i+"\t");
			}
		}
	}

}
