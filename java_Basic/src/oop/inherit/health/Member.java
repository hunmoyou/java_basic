package oop.inherit.health;

public class Member extends HealthMan{
	
	String ticket; //회원권 
	
	@Override
	void healthInfo() {
		super.healthInfo();
		System.out.println("# 회원권: " + ticket);
	}
}
