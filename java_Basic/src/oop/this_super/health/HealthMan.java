package oop.this_super.health;

public class HealthMan {

	String name;
	int bench;
	int dead;
	int squat;
	int height;
	int weight;
	double skele; //골격근량
	double fatm; //체지방량
	int bmr; //기초대사량
	double fat; //체지방률
	
	HealthMan(){
		System.out.println("HealthMan의 기본 생성자 호출!");
		bench = 100;
		dead = 100;
		squat = 100;
		height = 180;
		weight = 80;
		skele = 35.5;
		fatm = 15.5;
		bmr = 2300;
		fat = 15.3;	
	}
	
	HealthMan(String name){
		this();
		System.out.println("HealthMan의 2번 생성자 호출!");
		this.name = name;
	}
	
	 HealthMan(String name, int bench) {
		this(name);
		System.out.println("HealthMan의 3번 생성자 호출");
		this.fatm = bench;	
	}
	 
	 void work(HealthMan target) {
		 System.out.println("target: " + target);
		 System.out.println("this: " + this);
		 if(this == target) {
			 System.out.println("3대 500 이상입니다.");
			 return;
		 }
	 }
	
	void healthInfo() {
		System.out.println("*** 3대 측정 && 인바디 ***");
		System.out.println("# 이름: " + name);
		System.out.println("# 벤치프레스: " + bench);
		System.out.println("# 데드리프트: " + dead);
		System.out.println("# 스쿼트: " + squat);
		System.out.println("# 키: " + height);
		System.out.println("# 몸무게: " + weight);
		System.out.println("# 골격근량: " + skele);
		System.out.println("# 체지방률: " + fatm);
		System.out.println("# 기초대사량: " + bmr);
		System.out.println("# 체지방률: " + fat);
		System.out.println("이 메서드를 호출한 객체의 이름은: "+this.name);
	}
}
