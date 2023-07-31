package inputTest;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		/*
		 * 초기값
		 * 정수 : 0
		 * 실수 : 0.0
		 * 문자 : ' '
		 * 문자열 : null 또는 " "
		 */
		Scanner sc = new Scanner(System.in);
//		String name; XX 초기값 선언을 해주셔야 합니다. 딱히 지정할 값이 없을경우 초기값으로 지정해주세요!!
		String name = null;
		String firstName = null;
		
//		System.out.print("이름 : ");
//		name = sc.next();
//		firstName = sc.next();
//		System.out.println(name + firstName +"개발자님 환영합니다.");
		
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.println(name + "개발자님 환영합니다.");
	}

}
