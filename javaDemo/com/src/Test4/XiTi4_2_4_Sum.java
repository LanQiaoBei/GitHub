package Test4;

public class XiTi4_2_4_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		System.out.print("1~100素数之和为:");
		for(int i = 2; i <= 100; i++)
		{
			boolean isprime = true;
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0) {
					isprime = false;
					break;
				}
				
		
			}
			if(isprime) sum += i;
		}
		System.out.println(sum);

	}

}
