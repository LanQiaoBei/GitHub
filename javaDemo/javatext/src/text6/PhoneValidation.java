package text6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneValidation {
	public static void main(String[] args) throws IOException {
		boolean contiGo=true;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		//定义手机号码的正则表达式
		String regex="(13\\d|15[036-9]|18[689])\\d{8}";
		String phoneNumber;
		while(contiGo) {
			System.out.println("请输入手机号码");
			phoneNumber=buf.readLine();
			boolean match=phoneNumber.matches(regex);
			if(match) {
				System.out.println(phoneNumber+"是合法的手机号码");
				break;
			} else
				System.out.println(phoneNumber+"不是合法的手机号码");
		}
	}
}
