package etc.api.lang.wrapper;

public class Practice {
	
	public static void main(String[] args) {
		int a = 100;
		boolean b = false;
		char c = 'A';
		double d = 3.14;
		
		Integer v1 = new Integer(a);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(d);
		
//		int i  = v1.intValue(); //이게 도대체 뭘까...
		
		Integer x1 = a;
		Boolean x2 = b;
		Character x3 = c;
		Double x4 = d;
		
		int i = x1;
		double d2 = x4;
		
		String s2 = "3.14"; 
		Integer.parseInt(s2); //예외
		
	}
}
