package variableTest;

public class FormatTest {

	public static void main(String[] args) {
//		이름,나이, 몸무게 변수 선언
		String name = "KDH";
		int age = 30;
		double weight = 68.2;
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %d살\n", age);
		System.out.printf("몸무게 : %.1fkg", weight);
		
		
	}

}
