package suanfa;

public class Fic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maths mymath=new maths();
		for(int i=1;i<=12;i++) {
			System.out.print(mymath.F(i)+" ");
		}
	}
}

class maths {
	public int F(int x) {
		if(x==1 ||x==2) return 1;
		return F(x-1)+F(x-2);
	}
}
