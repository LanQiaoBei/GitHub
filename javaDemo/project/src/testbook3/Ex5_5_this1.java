package testbook3;

public class Ex5_5_this1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat garfield = new Cat("黄",12);
		garfield.grow();
		garfield.grow();

	}

}

class Cat {
	String furColor;
	int height;
	
	public Cat(String color) {
		this.furColor = color;//通过this访问成员变量,this可以省略
		this.cry();//通过this调用成员方法，这里this可以省略
	}
	
	public Cat(String color,int height) {
		this(color);//通过this调用其他构造方法	
		this.height = height;//通过this引用成员变量，this可以省略
	}
	
	public void cry() {
		System.out.println("我是一只"+this.furColor+"颜色的猫");
		
	}
	
	public void grow() {
		this.height++;
		System.out.println("我长高了，身高为"+this.height);//this可以省略
	}
	
}
