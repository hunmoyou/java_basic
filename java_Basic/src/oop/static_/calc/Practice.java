package oop.static_.calc;

public class Practice {
	
	private Practice() {
		System.out.println("객체가 생성됨");
	}
	
	private static Practice p = new Practice();
	
	public static Practice getInstance() {
		return p;
	}
	
	public void method1() {
		System.out.println("여러군데에서 쓰이는 주용한 메서드");
	}
	
	public void method2() {
		System.out.println("난 주인공이어서 한번만");
	}
	
}
