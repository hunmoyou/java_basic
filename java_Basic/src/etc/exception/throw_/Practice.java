package etc.exception.throw_;

import etc.api.lang.obj.MainClass;

public class Practice {

	static int numnum(int z) throws Exception {

		if(z <= 0) {
			throw new Exception();
		}

		int total = 0;
		for(int i=0; i<=z; i++) {
			total += i;
		}

		return total;


	}

	public static void main(String[] args) {
		 try {
			System.out.println(numnum(500));
			System.out.println(numnum(500));
		} catch (Exception e) {
			System.out.println("양수만 주세용");
		}finally {
			System.out.println("throws");
		}
	}

}
