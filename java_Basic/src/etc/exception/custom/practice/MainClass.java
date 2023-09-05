package etc.exception.custom.practice;

public class MainClass {
	
	public static void main(String[] args) {
		
		LoginUser user = new LoginUser("qwer1111", "qwer1234");
		
		String result;
		
		try {
			result = user.loginValidate("qwer1111", "qwer1234");
			System.out.println(result);
		} catch (LoginValidateException e) {
			e.printStackTrace();
		}
		
	}
}
