package peach1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=1;
		System.out.print("第10天有"+sum+"\t");
		for(int i=0;i<9;i++) {
			sum=2*(sum+1);
			System.out.print("第"+(9-i)+"天有"+sum+"\t");
		}
		
	}

}
