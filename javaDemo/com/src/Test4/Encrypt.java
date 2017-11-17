package Test4;

import javax.swing.JOptionPane;

public class Encrypt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number; //用户输入的4位数
		int []digit; //第一位数
		//int []digit2; //第二位数
		//int []digit3; //第三位数
		//int []digit4;  //第四位数
		// int c;
		int encryptedNumber; //加密后的数字
		
		digit = new int[4];
		
		//输入一个4位数，保存在变量number中
		String inputNumber = JOptionPane.showInputDialog("Enter a four digit number:");
		number = Integer.parseInt(inputNumber);
		
		//加密
		//编写代码，对4位数中的每一位数按照问题描述中的放松进行加密运算
		for(int i = 0; i<inputNumber.length(); i++) {
			digit[i] = Integer.parseInt((inputNumber.substring(i, i+1)));
			digit[i] = (digit[i]+7)%10;
		}
		//编写代码，交换第1个数字和第3个数字、第2个数字和第4个数字，生成加密后的数字
		//c = digit[0];digit[0]=digit[2];digit[2]=c;
		//c = digit[1];digit[1]=digit[3];digit[3]=c;
		
		encryptedNumber = Integer.parseInt((Integer.toString(digit[2])+Integer.toString(digit[3])+Integer.toString(digit[0])+Integer.toString(digit[1])));
		
		//编写代码。用消息对话框显示加密后的结果
		JOptionPane.showMessageDialog(null, number+"加密之后是:"+encryptedNumber,"密文",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

	
}
