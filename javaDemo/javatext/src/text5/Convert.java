package text5;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new D();//��������ָ���������
		c.n=3.1415926;//�޸ĵ��Ǹ������õı����صı���
		//c.w=300;//�������ò��ܲ���������������ĳ�Ա����
		//c.cry();//�������ò��ܲ���������������ĳ�Ա����
		c.m=186;
		c.f();
		c.g();//c��һ������������ʵ�ʵ��õ��������g()����
		
		D d = (D) c;//��cǿ��ת��Ϊ�������
		d.n = 555;
		d.f();
		d.g();
		d.cry();
		
	}
}

class C {
	int m;
	double n;
	
	void f() {
		System.out.println("������̳еķ���f()");
	}
	
	void g() {
		System.out.println("���,n="+n+"m="+m);
	}
}

class D extends C {
	int n = 12;
	int w;
	
	void g() {
		System.out.println("������д����g(),n="+n+"m="+m);
	}
	
	void cry() {
		System.out.println("���������ķ���");
	}
	
}
