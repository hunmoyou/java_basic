package etc.api.lang.stringbuilder.practice;

public class StrbuilderExample {
	
	public static void main(String[] args) {
		String str = "hello";
		System.out.println("str주소값: " + str.hashCode());
		
		str = "hello world";
		System.out.println("str주소값: " + str.hashCode());
		
		str = "hello~!";
		System.out.println("str주소값: " + str.hashCode());
		System.out.println("==============================");
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		System.out.println("sb주소값: " + sb.hashCode());
		
		sb.append(" my world");
		System.out.println(sb);
		System.out.println("sb의 주소값:  "+ sb.hashCode());
		
		sb.insert(6, "haha");
		System.out.println(sb);
		
		sb.replace(5, 9, "zazaza");
		System.out.println(sb);
		
		sb.delete(0, sb.length()-2);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.indexOf(str);
		sb.length();
		System.out.println(sb.hashCode());
		
	}
}
