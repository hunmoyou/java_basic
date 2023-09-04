package etc.exception.basic;

public class FinallyExample {

	public static void main(String[] args) {

		String[] pets = {"피카츄", "파이리", "꼬부기"};

		for(int i = 0; i<=pets.length; i++) {
			try {
				System.out.println(pets[i] + "키우고 싶다~");
			}catch(Exception e) {
				System.out.println("포켓몬의 정보가 없습니다.");
			}finally {
				//finally 블록에는 예외 발생 여부와 상관 없이
				//항상 실행하고 싶은 문장을 작성합니다.
				//객체를 반납하거나 메모리에서 해체할 때 (close()) finally를 주로 사용합니다.
				System.out.println("무조건 실행되는 문장이어요..");
				System.out.println("-----------------------------");
			}
		}	
	}
}
