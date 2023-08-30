package oop.this_super.health;

public class MainClass {

	public static void main(String[] args) {
		HealthMan h1 = new HealthMan();
		h1.name = "유훈모";
		System.out.println("h1의 주소값: " + h1);
		h1.healthInfo();
		
		System.out.println("---------------------");
		
		HealthMan h2 = new HealthMan("Ronnie Colman");
		h2.healthInfo();
		
		System.out.println("------------------------");
		
		HealthMan h3 = new HealthMan("유훈모", 500);
		h3.healthInfo();
		
		System.out.println("------------------------");

	}

}
