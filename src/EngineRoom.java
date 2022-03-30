
//Referenced at the constructor of MachineOperator and Trustee classes.
public class EngineRoom {

	//only Authenticable can use this function
	public String energy(Authenticable person) {
		InternSystem si = new InternSystem();
		si.setSystemPassword(222);

		if(si.userValidation(person)) {
			return "the energy was just turned on";	
		}else {
			return "you can not be here";
		}
//		try {
//			InternSystem si = new InternSystem();
//			si.setSystemPassword(222);
//
//			if(si.userValidation(person)) {
//				return "the energy was just turned on";	
//			}
//		}catch(InvalidClassException nexc) {
//			return "you are not MachineOperator or Trustee";
//		}
		
	}

	public String openRoof(Authenticable auth, boolean open ) {
		if(open == true) {
			return "Roof opened";
		}else {
			return "Roof closed";			
		}
	}
}
