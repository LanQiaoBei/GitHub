public class DiguiSum{
	 public static void addSum() {
	 	int sum=0;
		for(int i=0; i<10;i++) {
			sum+=i;
		}
		System.out.println(sum);
}

	public static void addSumDigui(int begin,int end) {
		int sum=0;
		if(begin>end)
		addSumDigui(begin+1,end);
		sum=sum+begin;
		System.out.println(sum);		

	}
	public static void main(String[] args) {
		addSum();
		addSumDigui(0,9);
		}
		
}