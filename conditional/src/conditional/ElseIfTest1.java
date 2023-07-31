package conditional;

public class ElseIfTest1 {

	public static void main(String[] args) {
			
		int point = 92;
		
		/*
		 * point가 90점 초과, 100점 이하 -> A
		 * point가 80점 초과, 90점 이하 -> B
		 * point가 70점 초과, 80점 이하 -> C
		 * 나머지는 F
		 */
			
		if(90 < point && point <= 100) {   		//point가 90점 초과, 100점 이하
			System.out.println("A");
		} else if(80 < point && point <= 90) { //point가 80점 초과, 90점 이하
			System.out.println("B");
		}else if(70 < point && point <= 80) { //point가 70점 초과, 80점 이하
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		
		
	}

}
