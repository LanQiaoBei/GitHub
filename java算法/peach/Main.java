package peach;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(f(i));
		}
	}
	public static int f(int x) {
		if(x==10) return 1;
		return 2*(f(x+1)+1);
		
	}

}
