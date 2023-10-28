package lambda;

import java.util.HashMap;

public class SteramTest {

	public static void main(String[] args) {
		HashMap<String, Integer> chinaTown = new HashMap<>();
		
		chinaTown.put("짜장면", 4500);
		chinaTown.put("짬뽕", 5000);
		chinaTown.put("탕수육", 15000);
		

//		forEach()
//		여러개를 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다.
//		forEach 메소드에는 Consumer 인터페이스 타입의 값을 전달해야 한다.
//		Consnumer는 함수형 인터페이스 이기 때문에 람다식을 사용할 수 있다.
		chinaTown.values().stream().forEach(v -> System.out.println(v)); //람다식
		chinaTown.values().forEach(v -> System.out.println(v)); //.stream() 생략가능
		
//		전달받은 매개변수를 그대로 메소드에 사용할 경우에는 참조형 문법을 사용할 수 있다.
//		소속::메소드명 --> 전달받은 값을 메소드의 매개변수로 바로 전달해준다.
//		String::toString --> 전달받은 값에 바로 toString 메소드를 사용해준다.
//		String::toUppperCase --> 전달받은 값을 바로 toUpperCase 메소드에 전달
		chinaTown.values().forEach(System.out::println); // 이런식으로도 활용가능(문법) 
		
	}

}
