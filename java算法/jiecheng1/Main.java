package jiecheng1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0;
		long f=1;
		for(int i=1;i<=20;i++) {
			f=f*i;
			sum=sum+f;
		}
		System.out.println(sum);
	}

}
