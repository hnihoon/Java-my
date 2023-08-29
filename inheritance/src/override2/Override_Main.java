package override2;

public class Override_Main {

	public static void main(String[] args) {
		Override_Army am = new Override_Army("육군");
		Override_Navy navy = new Override_Navy("해군");
		Override_AirForce air = new Override_AirForce("공군");
		
		am.attack();
		am.tank();
		
		navy.attack();
		navy.nucleus();
		
		air.attack();
		air.bombing();
		
	}

}
