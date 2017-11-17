package text5;

public class Covert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxRate taxRate = new TaxRate();
		Manager2 manager = new Manager2();
		taxRate.findTaxRate(manager);
	}
}

class TaxRate {
	void findTaxRate(Employee2 e) {
		System.out.println("444");
		
	}
	
}

class Employee2 {
}

class Manager2 extends Employee2 {
	
}