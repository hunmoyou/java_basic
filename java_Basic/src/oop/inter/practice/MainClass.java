package oop.inter.practice;

public class MainClass {
	
	public static void main(String[] args) {
		 
		System.out.println("상수: " + Person.num);
		Person.staticMethod();
		
		ImpClass i1 = new ImpClass();
		i1.method();
		i1.method2();
		i1.method3();
		i1.kingMethod();
		
		System.out.println("==============");
		
		Person it1= new ImpClass();
		it1.method();
		it1.kingMethod();
		
		((ImpClass)it1).method2();
		System.out.println("-----------------");
		
		
		((Person2)it1).method2();
		
		Person2 it2 = new ImpClass();
		it2.method2();
		it2.kingMethod();
		
		((Person)it2).method();
		
		Person it3 = new ImpClass2();
		Person2 it4 = new ImpClass3();
		
		King[] persons = {it1,it2,it3,it4};
		
		
		
	}
}
