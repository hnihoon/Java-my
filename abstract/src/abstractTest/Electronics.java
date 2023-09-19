package abstractTest;

public  abstract class Electronics {

// 일반 메소드 : {} 가 있음
//	public void on() {
//		
//	}
	
//	public void off()) {
//		
//	}
	
// 추상 메소드 : {} 가 없음, 
// -> 미완성된 메서드로 상속받는 자식 클래스에서 완성해야 함
	abstract public void on();
	abstract public void off();
	
}
