package Test4;

import javax.swing.JOptionPane;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number; //����
		int digit1; //��1λ��
		int digit2; //��2λ��
		int digit3; //��3λ��
		int digit4; //��4λ��
		int decryptedNumber;//���ܺ��ԭ��
		
		//�������ģ����浽����number��
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter a four digit number:"));
		
		//����
		//��д���룬�ȷ��������еĸ�λ���֣�Ȼ���4λ���е�ÿһλ�����н�������
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
