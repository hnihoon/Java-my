package override;

class Hello2{
	public void say() {
		System.out.println("Hello2");
	}
}

class Korean2 extends Hello2{
	public void say() {
		System.out.println("안녕하세요2");
	}
	
	public void sayHello2() {
		//super 키워드는 부모 클래스를 가르킨다
		super.say();
	 }
}



public class Override_Super {

	public static void main(String[] args) {
		Korean2 ko2 = new Korean2();
		ko2.say();
		ko2.sayHello2();
	}

}
