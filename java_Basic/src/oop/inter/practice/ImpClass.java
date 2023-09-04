package oop.inter.practice;

public class ImpClass implements Person, Person2{

	@Override
	public void kingMethod() {
		System.out.println("Inter의 추상 메서드 구현!");
	}

	@Override
	public void method2() {
		System.out.println("Inter2의 추상 메서드 구현!");
	}

	@Override
	public void method() {
		System.out.println("king의 추상 메서드 구현!");
	}
	
	public void method3() {
		System.out.println("ImpClass의 메서드 구현");
	}
	
	
	
}
