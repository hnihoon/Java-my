package inputTest;

import java.util.Scanner;

public class InputTest3 {

	public static void main(String[] args) {
//		세 정수를 한 번에 입력받고, 곱의 결과를 출력
		int fistNumber = 0, middleNuber = 0, lastNumber = 0, result = 0;
		Scanner sc = new Scanner(System.in);
		String message = "세 정수를 입력해주세요.";
		
		System.out.println(message);
		
		fistNumber = Integer.parseInt(sc.next());
		middleNuber = Integer.parseInt(sc.next());
		lastNumber = Integer.parseInt(sc.next());
		
		result = fistNumber * middleNuber * lastNumber;
		
		System.out.printf("%d * %d * %d = %d",fistNumber, middleNuber, lastNumber,result);
		
	}

}
