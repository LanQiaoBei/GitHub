package Test4;

public class XiTi4_2_3_SuShuJiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("50以内奇数有:");
		for(int i = 1; i <= 50; i++) {
			if(i % 2 != 0) System.out.print( i + " ");
			}
		
		System.out.println("\n");
		System.out.print("50以内素数有:");
		for(int j = 2; j <= 50; j++)
		{
			boolean isPrime = true;
			for(int k = 2; k < j; k++) 
			{
				if(j % k == 0) { 
					isPrime =false;
					break;
				}
					
			}
			if(isPrime) System.out.print(j + " ");
			
		}

	}

}
