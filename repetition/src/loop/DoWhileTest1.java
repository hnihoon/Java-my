package loop;

public class DoWhileTest1 {

	public static void main(String[] args) {

		//		1 ~ 100 까지 합하기

		int sum = 0;
		
		int i = 1;
		do {
			sum += i;
			i++;
		} while(i <=100);
		
		System.out.println(sum);
		
	}

}
