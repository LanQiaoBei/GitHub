package suanfa;

public class FlowerWaters {
	public static void main(String[] args) {
		math mymath=new math();
		for(int i=100;i<=999;i++) {
		if(mymath.flowerwater(i)==true) System.out.println(i);
		}
	}
}

class math {
	public boolean flowerwater(int x) {
		int a=0,b=0,c=0;
		 a=x/100;
		 b=x/10%10;
		 c=x%10;
		if(a*a*a+b*b*b+c*c*c==x)
			return true;
		return false;
	}
}
