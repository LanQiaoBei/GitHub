package text6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneValidation {
	public static void main(String[] args) throws IOException {
		boolean contiGo=true;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		//�����ֻ������������ʽ
		String regex="(13\\d|15[036-9]|18[689])\\d{8}";
		String phoneNumber;
		while(contiGo) {
			System.out.println("�������ֻ�����");
			phoneNumber=buf.readLine();
			boolean match=phoneNumber.matches(regex);
			if(match) {
				System.out.println(phoneNumber+"�ǺϷ����ֻ�����");
				break;
			} else
				System.out.println(phoneNumber+"���ǺϷ����ֻ�����");
		}
	}
}
