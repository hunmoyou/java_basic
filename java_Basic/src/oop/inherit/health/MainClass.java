package oop.inherit.health;

public class MainClass {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.name = "유훈모";
		m1.bench = 100;
		m1.dead = 120;
		m1.squat = 110;
		m1.height = 181;
		m1.weight = 82;
		m1.skele = 38.2;
		m1.fatm = 18.5;
		m1.bmr = 2350;
		m1.fat = 20.2;
		m1.healthInfo();

		System.out.println("-----------------------");
		
		Trainer t1 = new Trainer();
		t1.name = "Ronnie Colman";
		t1.bench = 330;
		t1.dead = 350;
		t1.squat = 350;
		t1.height = 180;
		t1.weight = 130;
		t1.skele = 55.3;
		t1.fatm = 20.2;
		t1.bmr = 3000;
		t1.fat = 12.2;
		t1.healthInfo();
		
	}

}
