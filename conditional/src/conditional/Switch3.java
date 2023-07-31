package conditional;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();
		
		switch(ranking) {
		case 1:
		case 2:
		case 3:
			System.out.println("매달 획득!!");
			break;
		default:
			System.out.println("매달 획득 실패");
			break;
			
		}
	}
	

}
