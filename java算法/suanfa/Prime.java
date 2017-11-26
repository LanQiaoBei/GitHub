package suanfa;

public class Prime {
	static int j=2;
	static int count=0;
	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) break;	
			}
			if(j>Math.sqrt(i)) {
				System.out.print(i+"\t");
			++count;
			if(count%5==0)
				System.out.println();
			}
		}
	}
}
