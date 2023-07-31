package castingTest;

public class CastingTest3 {

	public static void main(String[] args) {
		System.out.println("1" + 3);			// "13"	  문자
		System.out.println("1" + 9 + 5);		// "195" 	  문자
		
		System.out.println("========================================");
		
		System.out.println(Integer.parseInt("1") + 3);	// 4
//		문자열을 정수로 바꿔주는 클래스인 Integer를 이용해서 문자 "1"을 숫자 1로 변환해줍니다.
//		보다 자세한 내용은 나중에 알아보도록 하고 이번에는 문자열을 자료형으로 바꾸어주는 
//		클래스가 있다는 정도만 알고 넘어가도록 하죠!! 
		
		System.out.println(Double.parseDouble("3.9")+ 9);
//		*문자열을 실수로 바꿔주는 클래스는 Double.parseDouble() 입니다.
		

		
		}
}
