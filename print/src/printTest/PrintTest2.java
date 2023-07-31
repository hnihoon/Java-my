package printTest;

public class PrintTest2 {

	public static void main(String[] args) {
		
//		컴파일러의 해석방향
//		위에서 아래로, 좌에서 우로

//		출력 메소드 = 오류 구체화
//			print() : 마지막에 자동으로 줄바꿈이 되지 않고 아래의 문장과 이어서 출력됨
//			println() : 마지막 자동으로 줄바꿈이 됨
//			printf() : 나중에 알아보기
	
//		출력 메소드의 목적
//			전달받은 데이터 및 전달할 데이터 검사, 오류발생 지점 구체화 및 검사
			
//===============================================================
			
//			제어문자
//			반드시 따옴표 안에서 작성한다.
			
			/*
			 * \n : new line, 줄바꿈
			 * \t : tab, 위 아래 줄 간격 맞춰 띄기
			 * \" : "표현
			 * \' : '표현
			 * \\: \표현
			 * 
			 */
			
			System.out.println("20살");	//Ctrl + Alt + 화살표 ↑ , ↓  = 복사
			System.out.print("\"KDH\"");	
										//Ctrl + D = 한줄 삭제
			System.out.println();		//여기를 Ctrl + D 해보세요!!
			
	}
}
