package etc.api.lang.math.practice;

public class Example {
	 	
	public static void main(String[] args) {
		
		int i = (int) Math.ceil(1.1);
		System.out.println(i);
		
		double d = Math.floor(1.5);
		System.out.println(d);
		
		double d2 = Math.round(3.141592*100)*0.01;
		System.out.println(d2);
		
		double d3 = Math.pow(3.0, 4.0);
		System.out.println(d3);
		
		int max = Math.max(50, 100);
		System.out.println(max);
		
		int min = Math.min(40, 80);
		System.out.println(min);
		
		
	}
}
