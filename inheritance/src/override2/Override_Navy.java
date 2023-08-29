package override2;

public class Override_Navy extends Override_Util{

	public Override_Navy(String name) {
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(super.getName() + ">>어뢰공격!!");
		System.out.println(super.getName() + ">>지상상륙!!");
	}
	
	public void nucleus() {
		System.out.println(this.getName() + ">>핵미사일발사!!");
	}

}
