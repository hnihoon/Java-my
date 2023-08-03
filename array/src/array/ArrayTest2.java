package array;

public class ArrayTest2 {

	public static void main(String[] args) {

//		배열선언
		int[] kim;
		kim = new int[3];
		kim[0] = 75;
		kim[1] = 82;
		kim[2] = 91;
		
		int[] park = new int[3];
		park[0] = 88;
		park[1] = 64;
		park[2] = 50;
		
		int[] lee = new int [] {100,95, 85};
		
		int sumk = 0, sump= 0, suml = 0;
		
//		합계구하기
		
//		1. kim
		for(int i = 0; i<kim.length; i++) {
			sumk += kim[i];
		}
		System.out.println("kim의 총합 : " + sumk);
		
//		2. park
		for(int i = 0; i<park.length; i++) {
			sump += park[i];
		}
		System.out.println("park의 총합 : " + sump);

		
//		3. lee
		for(int i = 0; i<lee.length; i++) {
			suml += lee[i];
		}
		System.out.println("lee의 총합 : " + suml);

		System.out.println("-----------------");	
	
//		평균 구해보기
		System.out.println("kim의 평균 : " + sumk/kim.length);
		System.out.println("park의 평균 : " + sump/park.length);
		System.out.println("lee의 평균 : " + suml/lee.length);
		
	}

}
