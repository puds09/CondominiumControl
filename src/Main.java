
public class Main {

	public static void main(String[] args) {

		//testing POLIMORFISM and PersonData class
		Trustee pessoa = new Trustee();
		pessoa.setPassword(222);

		pessoa.setAge(5);
		System.out.println(pessoa.getAge());
		pessoa.setApartamentNumber(10);
		System.out.println(pessoa.getApartamentNumber());
		//remember to set the password after initializing the InternSystem
		InternSystem si = new InternSystem();
		si.setSystemPassword(222);
		System.out.println(si.userValidation(pessoa));

		//testing the Gamer (game room) and the Static variable
		Trustee person = new Trustee();
		Resident morador = new Resident();
		System.out.println(morador.crowededGameRoom());
		System.out.println(morador.openDoor());
		System.out.println(morador.turnOnTv());
		System.out.println(person.crowededGameRoom());
		System.out.println(person.openDoor());
		
		//testing EngineRoom functions
		MachineOperator mo = new MachineOperator();
		mo.setPassword(222);
		Trustee sindc = new Trustee();
		sindc.setPassword(222);
		System.out.println(mo.engineRoom.energy(mo));
		System.out.println(sindc.engineRoom.energy(sindc));

		
	}

}
