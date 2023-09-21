package lambdaTest;

public class PrintNameTest {

	public static void printFullName(PrintName printName) {
		//전달받은 람다식 사용
		System.out.println(printName.getName("홍", "길동"));
	}
	
	public static void main(String[] args) {
		//람다식을 매개변수로 전달해서 사용
		printFullName((i , f) -> i + f);
		
		
	}

}
