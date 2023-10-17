package arrayListTest;

public class User_Main {

	public static void main(String[] args) {
		
		UserField userField = new UserField();
		User user = new User();
		
		user.setId("hgd1234");
		user.setPassword("1234");
		user.setName("홍길동");
		user.setPhoneNumber("01012345678");
		
		if(userField.checkId(user.getId()) == null) {
			userField.join(user);
			System.out.println("회원가입 성공!!");
		}
		
		if(userField.login("hgd1234", "1234")) {
			System.out.println("로그인 성공!!");
		} else {
			System.out.println("로그인 실패..");
		}
		
		
		System.out.println(user);
	}
}
