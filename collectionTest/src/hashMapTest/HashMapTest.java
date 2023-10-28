package hashMapTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Object> userMap = new HashMap<>();
		
		//put : "키값" , "벨류값"
		userMap.put("id", "hgd");
		userMap.put("password", "1234");
		userMap.put("name", "홍길동");
		userMap.put("age", 20);
		
		System.out.println(userMap);
		
		//get : "키값"을 입력해주면 벨류값을 반환해줌
		System.out.println(userMap.get("id")); //hgd
		System.out.println(userMap.get("password")); //1234
		System.out.println(userMap.get("name")); //홍길동
		System.out.println(userMap.get("age")); //20
		
		//수정 : "키값"은 중복사용이 불가능하며, 이미 "키값"이 존재할 경우 "키값"과 연결된 "벨류값"이 수정됨
		userMap.put("name", "이순신");
		System.out.println(userMap.get("name")); //이순신
		
		//key값 value값 따로 사용도 가능 (잘 사용하지 않는 방법)
		userMap.keySet();
		userMap.values();
	}

}
