package oop.obj_arr.Practice;

import java.util.Scanner;

public class HealthMain {
	
	public static void main(String[] args) {
		
		Health[] healths = new Health[100];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<healths.length; i++) {
			System.out.println("*** 삼대 운동 입력 프로그램 ***");
			System.out.println("'그만'을 외치면 종료됩니다.");
			
			System.out.print("이름: ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			System.out.print("벤치프레스: ");
			int bench = sc.nextInt();
			System.out.print("데드리프트: ");
			int dead = sc.nextInt();
			System.out.print("스쿼트: ");
			int squat = sc.nextInt();
			
			healths[i] = new Health(name, bench, dead, squat);
			
			System.out.println("*** 입력완료 ***\n");			
		}
		
		for(Health h:healths) {
			if(h == null) break;
			h.healthInfo();
			System.out.println("---------------------------");
		}
		sc.close();
		
	}
}
