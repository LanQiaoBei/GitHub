package testbook1;

import java.text.DecimalFormat;

public class Ex5_2_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1,c2;
		c1 = new Circle(10);
		Point p = new Point(9,8);
		c2 = new Circle(10,p);
		c2.setRadius(40);
		
		DecimalFormat df = new DecimalFormat("###,##0.00"); 
		System.out.println("c1面积 ="+c1.getArea()+"\tc2面积="+c2.getArea());
		System.out.println("c1 周长  = "+df.format(c1.getCircumference())+"\tc2周长="+df.format(c2.getCircumference()));
		

	}

}
