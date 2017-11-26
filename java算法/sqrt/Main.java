package sqrt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100000;i++) {
			if(Math.sqrt(i+100)%1==0 && Math.sqrt(i+100+168)%1==0) 
				System.out.println(i);
		}
	}

}
