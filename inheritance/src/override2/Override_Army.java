package override2;

public class Override_Army extends Override_Util{

	public Override_Army(String name) {
		super(name);
	}
	public void attack() {
		super.attack();
		System.out.println(super.getName() + ">>지상공격!!");
	}
	
	public void tank() {
		System.out.println(super.getName() + ">>탱크공격!!");
	}

	
}
