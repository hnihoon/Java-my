package overload;

public class Overload_this1 {

	public Overload_this1(String msg) {
		System.out.println(msg);
	}
	
	public Overload_this1() {
		//Overload_super1(String msg) 호출한다.
		this("Hi");
	}
	
	public Overload_this1(int num) {
		this("user");
		System.out.println(num);
	}
}
