package lambdaTest;

public class LambdaTest {

	public static void main(String[] args) {
		//람다식 방법1)
		LambdaInter lam1 = (number) -> number % 10 == 0;
		System.out.println(lam1.checkMultipleOf10(10));
		
		//람다식 방법2)
		LambdaInter lam2 = (number) -> {System.out.println("10의 배수 검사"); return number % 10 == 0;};
		System.out.println(lam2.checkMultipleOf10(99));
		
	}
}
