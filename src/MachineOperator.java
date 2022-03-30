
public class MachineOperator extends PersonData implements Authenticable{

	private Authenticator authenticator; //to verify if this Person can enter into MachineRoom
												//(remember to set the password after initializing)

	public EngineRoom engineRoom;
	
	public MachineOperator() {
		authenticator = new Authenticator();
		engineRoom = new EngineRoom();
	}
	
	@Override
	public void setPassword(int password) {
		authenticator.setPassword(password);
	}

	@Override
	public boolean verifyPassword(int password) {
		return authenticator.verifyPassword(password);
	}
}
