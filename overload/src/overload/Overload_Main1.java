package overload;

public class Overload_Main1 {

	public static void main(String[] args) {
		OverloadTest1 over = new OverloadTest1();
		
		over.setProperty(19);
		System.out.println(over.toString());
		
		over.setProperty("개발자");
		System.out.println(over.toString());
		
		over.setProperty(20, "자영업자");
		System.out.println(over.toString());
		
		over.setProperty("교수", 30);
		System.out.println(over.toString());
		
	}
}
