package suanfa;

public class Sushu {
	public static void main(String[] args) {
		int count=0;
		int j=2;
		for(int i=101;i<=200;i++) {
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) break;
				}
			if(j>Math.sqrt(i)) {
				++count;
				System.out.print(i+"\t");
				if(count%5==0)
					System.out.println();
				}
			}
		System.out.println("共有"+count+"个素数");
	}
}
