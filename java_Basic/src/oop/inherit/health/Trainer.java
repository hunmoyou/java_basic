package oop.inherit.health;

public class Trainer extends HealthMan{

	String trop; //수상경력
	
	@Override
	void healthInfo() {
		super.healthInfo();
		System.out.println("# 수상경력: " +trop );
	}

}
