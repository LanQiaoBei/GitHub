package xulie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fm=1.0f,fz=1.0f,temp,sum=0f;
		for(int i=0;i<20;i++) {
			temp=fm;
			fm=fz;
			fz=fz+temp;
			System.out.print((int)fz+"/"+(int)fm+" ");
			sum=sum+fz/fm;
		}
		System.out.println(sum);
	}

}
