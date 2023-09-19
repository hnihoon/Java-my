package ambiguityTest;

public interface InterA {

// void 앞에 아무것도 선언하지 않을 경우 인터페이스는 abstract가 생략되어 있음
//	void printDate() {
//		System.out.println("InterA");
//	}
	
//	default 가 붙을 경우 일반 메서드 처럼 사용가능
	default void printDate() {
		System.out.println("InterA");
	}
}
