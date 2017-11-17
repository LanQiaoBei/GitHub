package Test4;
import java.util.Scanner;
public class XiTi4_2_arraySort1{
	private static Scanner sc;

	public static void main(String[] args) {
		
		int []array=new int[3];
		sc = new Scanner(System.in);
		System.out.println("please enter 3 numbers");
		
		for (int i=0;i<array.length; i++) {
				array[i]=sc.nextInt();
		}
		
		for (int j=0; j<array.length-1; j++) {
			for (int k=j+1; k<array.length; k++) {
				if (array[j] > array[k]) {
					int temp=array[j];
					array[j]=array[k];
					array[k]=temp;
				}
			}
		}

		for (int l=0;l<array.length ;l++ ) {
			System.out.print(array[l]+" ");
		}

	}
}