package jishu1;

public class Main {
	public static boolean isjishu(int x) {
		if(x%2!=0) return true;
	return false;
}
	public static boolean fun(char c) {
		if(c>='0' && c<='7') {
			return true;
		} else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int count=0;
		for(int i=0;i<100000000;i++) {
			s=""+i;
			boolean flag=true;
			char[] c=s.toCharArray();
			for(int j=0;j<c.length;j++) {
				if(!fun(c[j])) {
					flag=false;
					break;
					}
				}
			if(flag && isjishu(i)) {
					count++;
					}
			/*s="";*/
			}
		System.out.println("共有"+count+"个奇数");
		}
	}
