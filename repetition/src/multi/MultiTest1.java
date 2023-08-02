package multi;

public class MultiTest1 {

	public static void main(String[] args) {

		int point = 97;

//		97점 이상 				: A+
//		94점 이상 97점 미만	: A
//		90점 이상 97점 미만	: A-
		
		if(point >= 90) {
			if(point >= 97) {
				System.out.println("A+등급 입니다.");
			} else if(point >=94 && point <= 96) {
				System.out.println("A등급 입니다.");
			} else if(point >=90 && point <= 93){
				System.out.println("A-등급 입니다.");
			}
		} else if(point <= 80) {
			System.out.println("B등급 입니다.");
		} 	else if(point <= 70) {
			System.out.println("C등급 입니다.");
		} 	else if(point <= 60) {
			System.out.println("D등급 입니다.");
		} 	else {
			System.out.println("F등급 입니다.");
		}
	
	}

}
