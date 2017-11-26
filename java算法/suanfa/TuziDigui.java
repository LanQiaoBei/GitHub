package suanfa;

public class TuziDigui {
	static int i;
	public static int  F(int x) {
		if(x==1 || x==2) return 1;
		return F(x-1)+F(x-2);
	}
	public static void main(String[] args) {
		for(i=1;i<13;i++) {
			System.out.println(i+"月兔子数为:"+F(i));
		}
	}
}
