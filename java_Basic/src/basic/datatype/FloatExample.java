package basic.datatype;

public class FloatExample {

	public static void main(String[] args) {
		
		/* ## 실수형

		- float
		    - 4byte의 실수형.
		    - 소수점 이하 7자리까지 표현이 가능.
		- double
		    - 8byte의 실수형
		    - 소수점 이하 15자리까지 표현이 가능.
		- 자바의 실수형 기본 데이터 타입은 double.
		실수 리터럴도 마찬가지로 double로 인식한다. */
		
		//실수 리터럴의 기본 데이터 타입은 double입니다.
		float f1 = 7.12345F;
		double d1 = 7.12345;
		
		/////////////////////////////////////
		
		float f2 = 1.234567891234F;
		double d2 = 1.234567891234;
		
		System.out.println(f2);
		System.out.println(d2);
		
		
	}

}
