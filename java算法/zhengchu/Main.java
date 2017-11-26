package zhengchu;

public class Main {
	public static boolean isSuShu(int x) {
		if(x==0 ||x==1) return false;
		for(int i=2;i<Math.sqrt(x);i++) {
			if(x%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		int n=0;
		int num=0;
		while(n<100) {
			if(isSuShu(num)) {
				arr[n]=num;
				n++;
				num++;
			} else {
				num++;
			}
		}
		
		/*for(int i: arr) {
			System.out.print(i);
		}*/
		
		String s="9";
		int index=0;
		while(s.length()<9) {
			if(new Integer(s).intValue()%arr[index]==0) {
				System.out.println(s+"%"+arr[index]+"=0");
			}
			if(index<100-1) {
				index++;
				} else {
					index=0;
					s=s+"9";
				}
			}
	}

}
