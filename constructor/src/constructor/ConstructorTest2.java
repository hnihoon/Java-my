package constructor;

class User {
	
	String name;
	int age;
	
	User(String name, int age){
		//생성자 파라미터를 사용하면 객체 생성과 동시에 파라미터값을 받아올 수 있음
		this.name = name;
		this.age = age;
	}
	
	void print() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class ConstructorTest2 {

	public static void main(String[] args) {
		
		User user = new User( "자바학생", 20);
		user.print();
	}
}
