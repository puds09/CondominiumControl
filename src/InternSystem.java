
public class InternSystem{
	//remember to set the password after initializing the InternSystem

	protected int SystemPassword;
	
	public void setSystemPassword(int systemPassword) {
		SystemPassword = systemPassword;
	}
	

	public boolean userValidation(Authenticable auth){
		return auth.verifyPassword(SystemPassword);
	}

}
