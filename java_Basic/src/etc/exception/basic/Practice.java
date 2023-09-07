package etc.exception.basic;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("너 삼대 몇이야?: ");
			int i = sc.nextInt();	
			System.out.printf("넌 네츄럴이야..... 왜냐면 삼대가 %d니까..",i );
			sc.close();
		} catch (Exception e) {
			System.out.println("인바디 입력이 잘못되었습니다.");
		}finally {
			System.out.println("회원권 결재 하시죠 고객님");
		}
		
		
		
	}
}
