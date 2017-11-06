public class Digui {
	public static void diGui(int n) {
		if(n>0) diGui(n-1);
		System.out.print(n);
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			System.out.print(i);
		System.out.println();
		diGui(9);
	}
}