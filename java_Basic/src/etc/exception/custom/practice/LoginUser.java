package etc.exception.custom.practice;

public class LoginUser {
	
	String userAccount;
	String userPassword;
	
	public LoginUser(String userAccount, String userPassword) {
		super();
		this.userAccount = userAccount;
		this.userPassword = userPassword;		
	}
	
	public String loginValidate(String inputAccount, String inputPassword)
			throws LoginValidateException{
		if(userAccount.equals(inputAccount)) {
			if(userPassword.equals(inputPassword)) {
				return "성공";
			}else {
				throw new LoginValidateException("비번 입력다시해요");
			}
		}else {
			throw new LoginValidateException("회원가입 먼저");
		}
	}
}
