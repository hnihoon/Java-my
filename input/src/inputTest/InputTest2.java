package inputTest;

import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		//지금까지 학습했던 내용들만 가지고 작성해주세요!!
		//두 정수를 입력받은 뒤 덧셈 결과를 출력
		//단, next()만 사용한다.
		
		Scanner scint1 = new Scanner(System.in);
		Scanner scint2 = new Scanner(System.in);
		
		String num1 = scint1.next();
		String num2 = scint2.next();
		
		System.out.print(Integer.parseInt(num1)+Integer.parseInt(num2));
		
	}

}
