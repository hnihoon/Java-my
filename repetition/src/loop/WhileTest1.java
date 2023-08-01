package loop;

public class WhileTest1 {

	public static void main(String[] args) {

//		1 ~ 100 까지 합하기
		
		int sum = 0;
		
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
	}

}
