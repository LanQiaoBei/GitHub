package Test4;

import javax.swing.JOptionPane;

public class JiaMi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int encryptedNumber;
		
		number =Integer.parseInt(JOptionPane.showInputDialog("Enter a four digit number:")) ;
		
		digit1 = (number / 1000 + 7) % 10;
		digit2 = (number / 100 % 10 + 7) % 10;
		digit3 = (number / 10 % 10 + 7) % 10;
		digit4 = (number % 10 + 7) % 10;
		
		encryptedNumber =digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2 ;
		
		System.out.println(encryptedNumber);

	}

}
