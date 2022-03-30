
public class Gamer implements UserGameRoom {

	static boolean croweded = false;

	
	@Override
	public String openDoor() {
		if(croweded == false) {
			croweded = true;
			return "OK, your're a resident or the trustee, and the room is empty";
		}else {
			return "OK, your're a resident or the trustee, but the room is croweded";
			
		}
	}

	@Override
	public String crowededGameRoom() {
		if(croweded == true ) {
			return "The game room is CROWEDED";
			
		}else {
			return "The game room is not croweded, you can enter '.openDoor()' to enter";
		}
	}

	@Override
	public String turnOnTv() {
		return "You just turned on the TV";
	}

}
