
public class Resident extends PersonData implements UserGameRoom{

	private int ApartamentNumber;
	public Gamer player;
	
	public Resident() {
		player = new Gamer();
	}
	
	public int getApartamentNumber() {
		return ApartamentNumber;
	}

	public void setApartamentNumber(int apartamentNumber) {
		ApartamentNumber = apartamentNumber;
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
