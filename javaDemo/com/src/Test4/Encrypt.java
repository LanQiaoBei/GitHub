package Test4;

import javax.swing.JOptionPane;

public class Encrypt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number; //�û������4λ��
		int []digit; //��һλ��
		//int []digit2; //�ڶ�λ��
		//int []digit3; //����λ��
		//int []digit4;  //����λ��
		// int c;
		int encryptedNumber; //���ܺ������
		
		digit = new int[4];
		
		//����һ��4λ���������ڱ���number��
		String inputNumber = JOptionPane.showInputDialog("Enter a four digit number:");
		number = Integer.parseInt(inputNumber);
		
		//����
		//��д���룬��4λ���е�ÿһλ���������������еķ��ɽ��м�������
		for(int i = 0; i<inputNumber.length(); i++) {
			digit[i] = Integer.parseInt((inputNumber.substring(i, i+1)));
			digit[i] = (digit[i]+7)%10;
		}
		//��д���룬������1�����ֺ͵�3�����֡���2�����ֺ͵�4�����֣����ɼ��ܺ������
		//c = digit[0];digit[0]=digit[2];digit[2]=c;
		//c = digit[1];digit[1]=digit[3];digit[3]=c;
		
		encryptedNumber = Integer.parseInt((Integer.toString(digit[2])+Integer.toString(digit[3])+Integer.toString(digit[0])+Integer.toString(digit[1])));
		
		//��д���롣����Ϣ�Ի�����ʾ���ܺ�Ľ��
		JOptionPane.showMessageDialog(null, number+"����֮����:"+encryptedNumber,"����",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

	
}
