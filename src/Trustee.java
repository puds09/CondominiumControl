
public class Trustee extends PersonData implements Authenticable, UserGameRoom{

	private int ApartamentNumber;
	public Authenticator authenticator; //to verify if this Person can enter into MachineRoom 
											//(remember to set the password after initializing)
	public Gamer player; 
	public EngineRoom engineRoom;
	
	public Trustee() {
		authenticator = new Authenticator();
		player = new Gamer();
		engineRoom = new EngineRoom();
	}
	
	public int getApartamentNumber() {
		return ApartamentNumber;
	}

	public void setApartamentNumber(int apartamentNumber) {
		ApartamentNumber = apartamentNumber;
	}

	@Override
	public void setPassword(int password) {
		authenticator.setPassword(password);
	}

	@Override
	public boolean verifyPassword(int password) {
		return authenticator.verifyPassword(password);
	}

	@Override
	public String openDoor() {
		return player.openDoor();
	}

	@Override
	public String crowededGameRoom() {
		return player.crowededGameRoom();
	}

	@Override
	public String turnOnTv() {
		player.turnOnTv();
		return null;
	}
	

}
