package text5;

public class Super2 {
	public static void main(String[] args) {
		Doctor d = new Doctor("wang",1,"wu");
		Specialist s = new Specialist();
	}
}

class Doctor {
	String name;
	int ID;
	String address;
	
	public Doctor(String name1,int ID1,String address1) {
		name = name1;
		ID = ID1;
		address = address1;
		
		System.out.println("Ãû×Ö:"+name);
		System.out.println("±àºÅ"+ID);
		System.out.println("µØÖ·"+address);
	}
	
	public Doctor() {
		
	}
}

class Specialist extends Doctor {
	public Specialist(String name1,int ID1,String address1) {
		super(name1,ID1,address1);
	}
	
	public Specialist() {
		super();
		name="10";
		//System.out.println("name:"+name);
	}
}
