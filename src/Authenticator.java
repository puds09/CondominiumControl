
public class  Authenticator implements Authenticable{

	protected int password;
	
	
	@Override
	public void setPassword(int password) {
		this.password = password;
		
	}
	
	@Override
	public boolean verifyPassword(int password) {
		if(this.password == password) {
			return true;
		}else {
			return false;
		}
	}




}
