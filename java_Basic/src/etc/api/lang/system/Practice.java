package etc.api.lang.system;

public class Practice {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int total =0;
		for(int i=0; i<=2000000000; i++) {
			total += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("실행 소요시간: " + (end-start)*0.001 +"초");
		
		System.out.println(System.getProperties());
		System.out.println(System.getenv());
	}
}
