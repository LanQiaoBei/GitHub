package sum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fz=1.0f,fm=1.0f,temp,sum=0.0f;
		for(int i=1;i<=20;i++) {
			temp=fm;
			fm=fz;
			fz=fz+temp;
			System.out.println((int)fz+"/"+(int)fm);
			sum=sum+fz/fm;
		}
		System.out.println(sum);
	}

}
