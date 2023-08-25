package basic.constate;

import java.util.Scanner;

public class IfQuiz3 {

	public static void main(String[] args) {
		
		 /*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("결과");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max =0;
		int mid =0;
		int min =0;
		
		
		if(a>b && a>c) {max=a;
			if(b>c) {
				 mid=b; min=c;
			}else if(c>b) {
				 mid=c; min=b;
			}
		}if(b>a && b>c) {max=b;
			if(a>c) {
				 mid=a; min=c;
			}else if(c>a) {
				 mid=c; min=a;
			}
		}if(c>a && c>b) {
			if(b>a) {
				max=c; mid=b; min=a;
			}else if(a>b) {
				max=c; mid=a; min=b;
			}
		}
	
			
		System.out.printf("가장큰값 : %d , 가장 작은값: %d , 중간값 : %d",max,min,mid);
		sc.close();
	}

}
