package Test4;

public class XiTi4_2_2_ChengFaJuXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				s = i * j;
				System.out.print(j + "*" + i + "=" + s + "\t");
				if(j == 9) System.out.println("\n");
				
			}
		}

	}

}
