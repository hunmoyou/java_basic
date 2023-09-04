package oop.inter.practice;

public interface Person extends King{
	
	int num = 7;
	
	void method();
	
	public static void staticMethod() {
		System.out.println("인터페이스는?");
	}
}
