package text7;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Bank ba=new Bank(50);
		try {
			ba.withdrawal(100);
			System.out.println("ȡ��ɹ�!");
		} catch (InsufficientFundsException e) {
			System.out.println(e.toString());
			System.out.println(e.excepMessage());
		}
	}
}

class Bank {
	double balance;
	Bank(double balance) {
		this.balance=balance;
	}
	
	public void withdrawal(double dAmount) throws InsufficientFundsException {
		if(balance<dAmount)
			throw new InsufficientFundsException(this,dAmount);
		balance=balance-dAmount;
	}
	public void showBalance() {
		System.out.println("The balance is"+(int)balance);
	}
}

class InsufficientFundsException extends Exception {
	private Bank excepbank;
	private double excepAmount;
	InsufficientFundsException(Bank ba,double dAmount) {
		super("ȡ���쳣!");
		excepbank=ba;
		excepAmount=dAmount;
	}
	
	public String excepMessage() {
		String str="���д����:"+excepbank.balance+"\n"+"Ҫȡ��Ǯ��:"+excepAmount;
		return str;
		
	}
}
