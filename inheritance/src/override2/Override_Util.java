package override2;

public class Override_Util {
	
	private String name;
	
	//파라미터가 있는 생성자를 정의
	public Override_Util(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//자식 클래스에서 재정의한다.
	public void attack() {
		System.out.println(this.name + ">>공격준비");
	}
}
