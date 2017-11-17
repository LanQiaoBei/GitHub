package text5;

public class Generics {
	public static void main(String[] args) {
		Chorous<Singer,MusicalInstruments> model=new Chorous<Singer,MusicalInstruments>();
		model.makeChorus(new Singer(),new MusicalInstruments());
	}

}

class Chorous<E,F> {
	void makeChorus(E person,F yueqi) {
		yueqi.toString();
		person.toString();
	}
}

class Singer {
	public String toString() {
		System.out.println("好一朵美丽的茉莉花");
		return "";
	}
	
}

class MusicalInstruments {
	public String toString() {
		System.out.println("|3 34 61 |5 56 5-|");
		return "";
	}
	
}