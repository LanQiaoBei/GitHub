package Test4;

public class XiTi4_2_2_ChengFaShangSanJiao {
	public static void main(String args[]) {
		int s = 0;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++)
			{
				s = i * j;
				System.out.print( j + "*" + i + "=" + s + "\t");
				if(j == i) System.out.println("\n");
	
			}
		}
		
	}

}
