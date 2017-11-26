package yanghuisanjiao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		int[][] arr=new int[10][10];
		for(int i=0;i<10;i++) arr[i][1]=1;arr[1][1]=1;
		for(int i=1;i<10;i++) {
			for(j=1;j<=i;j++) {
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
