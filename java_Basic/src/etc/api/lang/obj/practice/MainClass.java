package etc.api.lang.obj.practice;

public class MainClass {

	public static void main(String[] args) {
		
		Person park = new Person("김김김", 30);
		Person hong = new Person("홍홍홍", 40);
		
		String str = new String("hello");
		System.out.println(str);
		
		System.out.println(park);
		System.out.println(hong);
		
		if(hong.equals(park)) {
			System.out.println("이름과 나이가 같아요");
		}else {
			System.out.println("이름이 다르고, 나이가 다르고, 둘다 다를수도");
		}
		
//		hong = null;
//		park = null;
		
		Person kim = new Person("이이이", 100);
		
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("복사된 개체 정보: " + clonePerson);
			System.out.println("kim주소: " + kim.hashCode());
			System.out.println("복제주소: " + clonePerson.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	
	}

}
