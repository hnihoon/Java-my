package interfaceTest;

public interface Pet {

	//인터페이스는 상수와 추상 메서드만 존재한다
	//인터페이스는 추상 메서드만 사용할 수 있기에 abstract 생략가능!!
	//인터페이스는 상수 변수만 사용 할 수 있기에 final static 생략가능!!
	
	final static int eyes = 2;
	int nose = 1;  //final static 생략된 상태
	
	
	void sitDown();
	void stop();
	void poop();
	void bbang();
}
