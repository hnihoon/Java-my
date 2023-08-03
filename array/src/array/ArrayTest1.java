package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		
//		배열의 선언방법
		
		int[] a = new int[] {1,2,3};		//1
		
		int[] b = {1,2,3};						//2
		
		int[] c = new int[3];				//3
		
		
		int[] grade = new int[] {100,100,90,85,95};
		
//		System.out.println(grade[0]);
//		System.out.println(grade[1]);
//		System.out.println(grade[2]);
		
//		for(int i = 0; i < 3; i++) {
//		System.out.println(grade[i]);
//	}

		System.out.println("배열의 크기 : " + grade.length);
		
		for(int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}
		
	}

}
