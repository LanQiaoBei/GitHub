package text5;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal a = new Animal();禁止实例化抽象类
		Cat2 tom = new Cat2();
		tom.eat();
		tom.run();
	}
}

abstract class Animal {
	String eyeColor;
	String furColor;
	int age;
	
	public Animal() {
		age = 0;
	}
	
	abstract void eat();
	
	abstract void run();
}

class Cat2 extends Animal {
	void run() {
		System.out.println("猫扑");
	}
	
	void eat() {
		System.out.println("吃老鼠");
	}
}