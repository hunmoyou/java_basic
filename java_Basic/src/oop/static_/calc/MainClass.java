package oop.static_.calc;

public class MainClass {
	
	public static void main(String[] args) {
		
		Practice p1 = Practice.getInstance();
		p1.method1();
		p1.method2();
		
		Practice p2 = Practice.getInstance();
		Practice p3 = Practice.getInstance();
		Practice p4 = Practice.getInstance();
		Practice p5 = Practice.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
			
			
	}
}
