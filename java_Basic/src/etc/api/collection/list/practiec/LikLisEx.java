package etc.api.collection.list.practiec;

import java.util.LinkedList;
import java.util.List;

public class LikLisEx {
	
	public static void main(String[] args) {
		 
		LinkedList<String> list = new LinkedList<>();
		
		list.add("삼대");
		list.add("벤치");
		System.out.println(list);
		
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list);
		
		list.add("스쿼트");
		System.out.println(list);
		
		 list.push("벤치");
		 System.out.println(list);
		 
		 System.out.println("---------------");
		 
		 System.out.println(list.pop());
		 System.out.println(list);
		 
		 System.out.println(list.peek());
		 System.out.println(list);
		 
		 list.offer("a");
		 list.offer("c");
		 list.offer("f");
		 System.out.println(list);
		 
		 System.out.println(list.poll());
		 System.out.println(list);
		 
		 
		
	}

}
