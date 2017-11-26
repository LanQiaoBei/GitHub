package sushu2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		for(int i=2;i<=100;i++) {
			for(j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) break;
			}
			if(j>Math.sqrt(i)) System.out.println(i);
		}
	}

}
