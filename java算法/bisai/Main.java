package bisai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] n= {'a','b','c'};
		char[] m= {'x','y','z'};
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(n[i]=='a' && m[j]=='x') {
					continue;
				} else if(n[i]=='a' && m[j]=='y') {
					continue;
				} else if((n[i]=='c' && m[j]=='x')||(n[i]=='c' && m[j]=='z')) {
					continue;
				} else if((n[i]=='b' && m[j]=='z')||(n[i]=='b'&&m[j]=='y')) {
					continue;
				} else {
					System.out.println(n[i]+" vs "+m[j]);
				}
			}
		}
	}

}
