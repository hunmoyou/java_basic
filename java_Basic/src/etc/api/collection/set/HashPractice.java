package etc.api.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashPractice {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("벤치");
		set.add("데드");
		set.add("스쿼트");
		set.add("렛풀다운");
		Collections.addAll(set, "레그프레스", "행잉레이즈");
		System.out.println(set);
		
		System.out.println("set의 크기: " + set.size());
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("===================");
		
		for(String s:set) {
			System.out.println(s);
		}
		
		set.remove("행잉레이즈");
		System.out.println(set);
		
		List<String> changeList = new ArrayList<>(set);
		System.out.println(changeList);
		
		set.clear();
		System.out.println(set);
		
		
		
		
		
		
		
	}
	
}
