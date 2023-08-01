package loop;

public class ForTest2 {

	public static void main(String[] args) {
//		구구단 2단 작성해보기
		
		int two = 0; //합계
		
		for(int i = 1; i <= 9; i++) {
			two = 2 * i;
			System.out.println(two);
		}
		
		System.out.println("결과 : " + two);
	}

}
