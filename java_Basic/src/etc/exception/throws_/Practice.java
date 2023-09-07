package etc.exception.throws_;

public class Practice {
	
	static String[] words = {"벤치프레스", "데드리프트", "스쿼트"};
	
	static void word(int idx)  {
		System.out.println(words[idx]);
	}
	
	public static void main(String[] args) {
		try {
			word(2);
		} catch (Exception e) {
			System.out.println("망해써요..");
			e.printStackTrace();
		}finally {
			System.out.println("난 무조건 나오는 메서드라구 하하");
		}
		
		
	}
	
}
