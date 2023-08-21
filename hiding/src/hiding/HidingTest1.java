package hiding;

class User{
	public String name = "사용자";
	private int age = 20; 
}

public class HidingTest1 {

	public static void main(String[] args) {
		// User 클래스에 생성자가 없으므로 기본 생성자를 제공
		User user = new User();

		// public 이므로 접근 가능
		System.out.println(user.name);
		
		// private 이므로 접근 불가능
//		System.out.println(user.age);
	}
}
