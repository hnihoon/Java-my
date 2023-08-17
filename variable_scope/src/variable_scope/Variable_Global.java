package variable_scope;

class HelloWorld{
	//전역변수(멤버변수) -> 변수 유효성 범위는 클래스 내부 전체
	String message;
	
	void sayHello() {
		System.out.println(message);
	}
	
	void setEng() {
		message = "Hello Java";
	}
	
	void setKor() {
		message = "안녕하세요 자바";
	}
	
}
public class Variable_Global {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		
//		메스드 호출
		hello.setEng();
		hello.sayHello();
		
		hello.setKor();
		hello.sayHello();
		
		//////////////////////////////////////
		hello.sayHello();
	}

}
