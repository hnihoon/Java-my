package constructor;

class Book{
	String subject;
	String content;
	
	Book(){
		System.out.println("생성자 실행됨");
		this.subject = "JAVA공부";
		this.content ="생성자공부";
	}
	
	void read() {
		System.out.println("read() 실행됨!!");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}

public class ConstructorTest1 {

	public static void main(String[] args) {
		Book book = new Book();
		
		book.read();
	}
}
