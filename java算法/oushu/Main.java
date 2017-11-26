package oushu;

public class Main {
	public static boolean issushu(int x) {
		if(x==0||x==1) return false;
		for(int i=2;i<=Math.sqrt(x);i++){
			if(x%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i=i+2) {
			for(int j=0;j<i/2;j++) {
				if(issushu(j) && issushu(i-j)) {
					System.out.println(i+"="+j+"+"+(i-j));
				}
			}
		}
	}

}
