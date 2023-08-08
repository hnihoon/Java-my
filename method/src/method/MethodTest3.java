package method;

public class MethodTest3 {
	
	public static void main(String[] args) {
		
								plus(10 , 20);
		
																		minus(20 , 10);
	}
	
	public static void plus(int x , int y) {
		System.out.println("plus : " + (x + y));
	}
	
	public static void minus(int x , int y) {
		int result = x - y;
		System.out.println("minus : " + result);
	}
	
}
