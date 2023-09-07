package etc.api.collection.list.practiec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LisDele {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> gym = new ArrayList<>();
		Collections.addAll(gym, "슈워제네거", "로니콜먼", "박승현", "레이니", "이동현", "박태원");
		System.out.println("등록된 회원: " + gym);
		System.out.println("삭제할 회원을 입력하세요: ");
		String name = sc.next();
		while(true) {
			if(gym.contains(name)) {
				gym.remove(name);
				System.out.println("삭제 후 회원 목록: " + gym);
				break;
			}else {
				System.out.println("목록에 없는 회원입니다.");			
				break;
			}
		}
		sc.close();

	}

}
