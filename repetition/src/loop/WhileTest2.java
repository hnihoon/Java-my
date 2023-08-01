package loop;

public class WhileTest2 {

	public static void main(String[] args) {

//		구구단 2단 작성해보기
		
		int two = 0; //합계
		
		int i = 1;
		while(i <= 9) {
			two = 2 * i;
			System.out.println(two);
			i++;
		}
		
		System.out.println("결과 : " + two);
	}

}
