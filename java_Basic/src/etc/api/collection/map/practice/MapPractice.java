package etc.api.collection.map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
	
	public static void main(String[] args) {
			
		
		Map<String, String> health = new HashMap<>();
		
		health.put("벤치", "100kg");
		health.put("데드", "200kg");
		health.put("스쿼트", "200kg");
		System.out.println(health);
		
	
		health.put("데드", "220");
		health.put("체지방률", "25");
		System.out.println(health);
		
		System.out.println(health.containsKey("데드"));
		
		String name = "벤치";
		if(health.containsKey(name)) {
			System.out.printf("%s의 종목을 가진 체육관은 %s입니다.\n", name, health.get(name));
		}else {
			System.out.println("그런 종목은 없습니다.");
		}
		
		System.out.println(health.size());
		
		Set<String> dum	= health.keySet();
		
		for(String d:dum) {
			System.out.println(d + " : " + health.get(d));
		}
		
		
		
		
	}
	
}
