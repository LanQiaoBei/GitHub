package text7;

public class ExceptionTest2 {
	public static void main(String[] args) {
		int i=0;
		String str[]= {"One","Two","Three"};
		try {
			while(i<=3) {
				System.out.println(str[i]);
				i++;
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界异常!");
		}finally {
			System.out.println("finally i="+i);
		}
		System.out.println("程序正常结束");
	}

}
