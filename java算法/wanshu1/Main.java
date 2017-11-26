package wanshu1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=1000;i++) {
			int sum=1;
			int k=(int) Math.sqrt(i);
			for(int j=2;j<=k;j++) {
				if(i%j==0)
					sum=sum+j+i/j;
				if(i==k*k) sum=sum-k;
			}
			if(i==sum)
			System.out.println(i);
		}
	}

}
