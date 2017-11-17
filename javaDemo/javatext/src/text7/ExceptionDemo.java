package text7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
	public static void mian(String[] args) {
		int arr[]= {100,200,300,400,500,600};
		String index;
		int position;
		BufferedReader inputReader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("输入序号(输入end结束):");
			try {
				index=inputReader.readLine();
				if(index.equals("end"))
					break;
				position=Integer.parseInt(index);
				System.out.println("元素的值为:"+arr[position]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("数组下标越界!");
			}catch(NumberFormatException e) {
				System.out.println("请输入一个整数!");
			} catch(IOException e) {}
		}
		System.out.println("程序运行结束.");
	}
}


