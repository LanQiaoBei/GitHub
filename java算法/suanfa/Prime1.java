package suanfa;

public class Prime1 {
	public static void main(String[] args) {
		int j;
		int count=0;
		for(int i=1;i<=100;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0) break;	
			}
			if(j==i) {
			System.out.print(i+"\t");
			++count;
			if(count%5==0)
				System.out.println();
			}
		}
	}

}
