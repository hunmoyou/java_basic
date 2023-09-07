package etc.api.collection.list.practiec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrListEx {
	
	public static void main(String[] args) {
		
		List<String> nick = new ArrayList<>();
		
		String str = "야옹이";
		
		nick.add(str);
		nick.add("멍멍멍");
		nick.add(new String("으르렁"));
		nick.add("왈왈왈");
		nick.add("ㅇㅇㅇ");
		System.out.println(nick);
		
		nick.add(1, "갱갱");
		System.out.println(nick);
		
		System.out.println(nick.get(3));
		
		System.out.println(nick.size());
		
		nick.set(0, "삐약아");
		System.out.println(nick);
		System.out.println(nick.get(0));
		
		nick.remove(0);
		System.out.println(nick);
		
		for(int i=0; i<nick.size(); i++) {
			System.out.println(nick.get(i));
		}
		
		System.out.println("-------------------------");
		
		for(String n:nick) {
			System.out.println(n);
		}
		
		System.out.println(nick.contains("ㅇㄹㄴㅇㅁㄹ"));
		
		nick.clear();
		System.out.println(nick);
		
		
		System.out.println(nick.isEmpty());
		
		List<Integer> score = new ArrayList<>();
		score.add(12);
		System.out.println(score);
		
		Collections.addAll(score, 13,14,80,16,50,100);
		System.out.println(score);
		
		System.out.println("100점은?" + Collections.frequency(score, 100));
		
		System.out.println("최대는: " + Collections.max(score));
		System.out.println("최소는: " + Collections.min(score));
		
		Collections.sort(score);
		System.out.println(score);
		
		
	}
}
