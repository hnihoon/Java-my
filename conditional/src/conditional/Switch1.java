package conditional;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();
		
		/*
		 * 1 금매달
		 * 2 은매달
		 * 3 동매달
		 * 다른 숫자는 "잘못 입력하셨습니다." 출력
		 */
		
		switch(ranking) {
		case 1:
			System.out.println("금매달 입니다.");
			break;
		case 2:
			System.out.println("은매달 입니다.");
			break;
		case 3:
			System.out.println("동매달 입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
			
		}
	}
	

}
