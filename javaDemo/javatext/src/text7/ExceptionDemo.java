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
			System.out.print("�������(����end����):");
			try {
				index=inputReader.readLine();
				if(index.equals("end"))
					break;
				position=Integer.parseInt(index);
				System.out.println("Ԫ�ص�ֵΪ:"+arr[position]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�����±�Խ��!");
			}catch(NumberFormatException e) {
				System.out.println("������һ������!");
			} catch(IOException e) {}
		}
		System.out.println("�������н���.");
	}
}


