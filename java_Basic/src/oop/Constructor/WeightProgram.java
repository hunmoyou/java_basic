package oop.Constructor;

public class WeightProgram {

	int deadlift;
	int squat;
	int benchpress;
	
	WeightProgram(int pDeadlift, int pSquat, int pBenchpress){
		deadlift = pDeadlift;
		squat = pSquat;
		benchpress = pBenchpress;			
	}
	void info() {
		System.out.println("데드리프트: "+deadlift+"kg");
		System.out.println("스쿼트: "+squat+"kg");
		System.out.println("벤치프레스: "+benchpress+"kg");
	}

}
