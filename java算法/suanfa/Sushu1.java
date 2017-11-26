package suanfa;

public class Sushu1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=2;
		int count=0;
		for(int i=101;i<=200;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) break;
			}
			 if(j==i) {
				System.out.print(i+"\t"); 
				++count; 
				if(count%5==0)
			System.out.println();
				}
			}
		System.out.println("共有"+count+"个素数!");
		}
	}


