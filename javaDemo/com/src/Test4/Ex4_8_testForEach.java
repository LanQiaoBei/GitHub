package Test4;

public class Ex4_8_testForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int []a = {13,25,78,12};
		
		for(int i: a) {
			sum += i;
		}
		System.out.println(sum);

	}

}
