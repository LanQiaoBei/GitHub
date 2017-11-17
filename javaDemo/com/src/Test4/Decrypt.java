package Test4;

import javax.swing.JOptionPane;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number; //密文
		int digit1; //第1位数
		int digit2; //第2位数
		int digit3; //第3位数
		int digit4; //第4位数
		int decryptedNumber;//解密后的原文
		
		//输入密文，保存到变量number中
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter a four digit number:"));
		
		//解密
		//编写代码，先分离密文中的各位数字，然后对4位数中的每一位数进行解密运算
		digit1 = number / 1000 - 7;
		digit2 = number / 100 % 10 - 7;
		digit3 = number / 10 % 10 - 7;
		digit4 = number % 10 - 7;
		
		if(digit1 < 0 )
		{
			digit1 += 10;
		}
		if(digit2 < 0 )
		{
			digit2 += 10;
		}
		if(digit3 < 0 )
		{
			digit3 += 10;
		}
		if(digit4 < 0 )
		{
			digit4 += 10;
		}
		decryptedNumber = digit3 *1000 + digit4 *100 + digit1 *10 + digit2;
		System.out.println(decryptedNumber);
		
	}
	

}
