package sushu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		for(int i=2;i<=100;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i) System.out.println(i);
		}
	}

}
