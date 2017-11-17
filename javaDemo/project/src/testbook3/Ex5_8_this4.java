package testbook3;

public class Ex5_8_this4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annimal a = new Annimal(10,20);
		System.out.println("新生小动物");
		System.out.println("年龄="+a.age+"\t体重="+a.weight+"克\t身高="+a.height+"cm");

	}
}

class Annimal {
	int age;
	String furColor;
	String eyeColor;
	String name;
	float weight;
	float height;
	
	public Annimal(float height) {
		this.age = 1;
		this.height = height;
	}
	
	public Annimal(String name) {
		this.age = 1;
		this.name = name;
	}
	
	public Annimal(float height,float weight) {
		this(height);//使用this调用其他构造方法
		this.weight = weight;
	}
	
}
