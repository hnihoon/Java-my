package operatorTest;

import java.util.Scanner;

public class OperTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		boolean truefalse = false, same = false;
		
		String message = "두 정수를 입력하세요.", result = null;
		
		System.out.println(message);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		truefalse = num1 > num2;
		same = num1 == num2;
		
		result = truefalse ? "둘 중 큰값은 : " + num1 : same ? "두 수는 같습니다." : "둘 중 큰값은 : " + num2;
		
		System.out.println(result);
		
		
	}

}
