package oop.Constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone(); 	
		basic.showSpec();
		
		System.out.println("------------------");
		
		Phone galaxy = new Phone("갤럭시 s23");
		galaxy.showSpec();
		
		
		System.out.println("---------------------");
		Phone iphone14 = new Phone("아이폰 14", "스페이스 그레이");
		iphone14.showSpec();
		
		
		

	}

}
