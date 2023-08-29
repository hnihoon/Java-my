package override2;

public class Override_AirForce extends Override_Util{

	public Override_AirForce(String name) {
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(this.getName() + ">>이륙!!");
		System.out.println(this.getName() + ">>공중포격!!");
	}
	
	public void bombing() {
		System.out.println(this.getName() + ">>핵미사일투하!!");
	}
	
}
