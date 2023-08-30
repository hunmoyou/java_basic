package oop.inherit.health;

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
		
		
	}
}
