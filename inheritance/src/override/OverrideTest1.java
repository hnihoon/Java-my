package override;


class Hello{
	public void say() {
		System.out.println("Hello");
	}
}

class English extends Hello{
	
}

class Korean extends Hello{
	public void say() {
		System.out.println("안녕하세요");
	}
}

public class OverrideTest1 {

	public static void main(String[] args) {
		English eng = new English();
		//자식클래스에 구현된 메서드가 없기 때문에 부모 클래스에 정의된 메서드 호출
		eng.say();
		
		Korean kor = new Korean();
		// 자식 클래스가 부모와 같은 이름의 메서드를 정의하고 있기 때문에 
		// 부모 클래스에 정의되어 있는 say()메서드가 가려지게 된다.
		kor.say();
		
	}
}
