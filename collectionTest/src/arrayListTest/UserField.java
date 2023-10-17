package arrayListTest;

import java.util.ArrayList;

public class UserField {
		private final static int KEY = 3; //상수는 대문자로 표기

		ArrayList<User> users = new ArrayList<User>(); 
		
		//아이디 중복검사
		public User checkId(String id) {
			User temp = null;
			for(User user : users) {
				if(user.getId().equals(id)) {
					temp = user;
				}
			}
			return temp;
		}
		
		//회원가입 메소드(암호화)
		public void join(User user) {
			//기존 패스워드를 get으로 가져온 후 encrypt 메소드를 통해 암호화 작업 후 set을 통해 userPassword에 저장
			user.setPassword(encrypt(user.getPassword())); 
			users.add(user);
		}
		
		//로그인 메소드(암호화)
		public boolean login(String id, String password) {
			User user = checkId(id);
			if(user != null) {
				if(user.getPassword().equals(encrypt(password))) { //저장된 패스워드와 암호화된 패스워드를 비교
					return true;
				}
			}
			return false;
		}
		
		public String encrypt(String password) { //기존 패스워드를 파라미터로 가져옴
			String encryptedPassword=""; //암호화된 패스워드를 담아줄 변수
			
			for(int i=0; i<password.length(); i++) { //기존 패스워드만큼 길이만큼 반복
				encryptedPassword += (char)(password.charAt(i) + KEY);
			}
			return encryptedPassword;
		}
		
}
