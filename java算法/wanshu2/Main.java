package wanshu2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=1000;i++) {
			int sum=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) sum=sum+j;
			}
			if(sum==i) System.out.println(i);
		}
	}
}
