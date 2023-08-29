package oop.Constructor;

import java.util.Scanner;

public class WeightProgramMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 너의 3대를 말해줘 ***");
		System.out.println("데드리프트: ");
		int lift = sc.nextInt();
		System.out.println("스쿼트: ");
		int squ = sc.nextInt();
		System.out.println("벤치프레스: ");
		int press = sc.nextInt();
		
		WeightProgram health = new WeightProgram(lift, squ, press);
		health.info();
		System.out.printf("3대: %dkg",lift+squ+press);
		sc.close();
	}

}
