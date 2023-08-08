package two_dimensions_array;

public class TwoArrayTest2 {

	public static void main(String[] args) {

//		성적표에 대한 2차 배열 생성
		int[][] grade = new int[3][3];
		
//		kim의 과목별 점수
		grade[0][0] = 75;
		grade[0][1] = 82;
		grade[0][2] = 91; 
		
//		park의 과목별 점수
		grade[1][0] = 88;
		grade[1][1] = 64;
		grade[1][2] = 50;
		
//		lee의 과목별 점수
		grade[2][0] = 100;
		grade[2][1] = 100;
		grade[2][2] = 90;
		
		for(int i = 0; i<grade.length; i++) {  //행 시작
			int sum = 0;
			int avg = 0;
			
			for(int j = 0; j<grade[i].length; j++) {  //열 시작
				sum += grade[i][j];
			} //열 끝
			
			avg = sum / grade[i].length;
			
			System.out.println("총점 : " + sum + ", 평균 : " + avg);
			
		} //행 끝
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
