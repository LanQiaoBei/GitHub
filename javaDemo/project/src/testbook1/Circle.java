package testbook1;

 public  class Circle {
	 private Point p;
	 private float radius = 0.0f;
	 
	 public Circle(float r) { //构造方法
		 radius = r;
		 
	 }
	 
	 public Circle(float r, Point p) { //构造方法
		 this.p = p;
		 radius = r;
	 }
	 
	 public void setRadius(float r) {
		 radius = 	r;
	 }
	 
	 public double getRadius() {
		 return radius;
	 }
	 
	 public double getArea() {
		 final float PI = 3.14f;
		 float area;
		 area = PI *radius * radius;
		 return area;
	 }
	 
	 public double getCircumference() {
		 float circumference;
		 final float PI = 3.14f;
		 circumference = 2 * PI * radius;
		 return circumference;
	 }
	 
	 

}
 
 
