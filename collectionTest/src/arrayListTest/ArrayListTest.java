package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		
//		<?>(제네릭) : 1. 임시로 타입을 선언하여 임시 타입으로 설계한다.
//						  2. 제네릭에 타입을 작성해주면 작성한 타입만 들어갈 수 있도록 제한해준다.
//						  3. 제네릭을 쓰면 따로 다운 캐스팅을 할 필요가 없다.
//						  4. 제네릭 생략시 기본 타입은 Object
//						  5. 제네릭은 클래스 타입으로 작성해야 합니다.

//		앞에 제네릭이 선언되어 있다면 뒤에서 생략 가능
		ArrayList<Integer> datas = new ArrayList<>(); 
		datas.add(10); //ArrayList에 값을 넣는 방법 .add();
		datas.add(30);
		datas.add(50);
		datas.add(20);
		datas.add(60);
		datas.add(40);
		
//		System.out.println(datas.size()); //ArrayList의 크기를 알 수 있는 함수 .size()  결과 : 6
//		System.out.println("==========================================");
//		
//		for (int i = 0; i<datas.size(); i++) {  //배열과 유사하게 활용이 가능하므로 반복문으로 값을 가져올 수 있습니다.
//			System.out.println(datas.get(i)); //get()함수로 접근 가능
//		}
//		System.out.println("==========================================");
//		
////		명칭 : 빠른for문, 향상된 for문, forEach 등등
////		ArrayList의 담긴 모든 값을 data 변수로 변환해서 출력하는 방법
//		for(int data : datas) {
//			System.out.println(data);
//		}
//		System.out.println("==========================================");
//		
////		System.out.println(datas.toString()); toString : 객체의 담긴 내용을 문자열 형식으로 출력해 줍니다.
//		System.out.println(datas); // toString() 생략가능
//		System.out.println("==========================================");
//		
//		//Collections : 여러 알고리즘을 담고있는 클래스
//		Collections.sort(datas);  //sort메서드 : 오름차순 정렬
//		System.out.println(datas);
//		System.out.println("==========================================");
//		
//		Collections.reverse(datas); //reverse메서드 : 값의 가운데를 기준으로 양 옆을 바꿔줍니다.
//		System.out.println(datas); //내림차순 형식으로 출력을 하고 싶다면 sort()로 오름차순 정렬 후 reverse로 바꿔서 활용 가능!
//		System.out.println("==========================================");
//		
//		Collections.shuffle(datas); //shuffle메서드 : 내용을 랜덤하게 출력 해줍니다.
//		System.out.println(datas);
//		System.out.println("==========================================");

		//문제1)
		//50뒤에 500을 삽입
		//단, 50이 있을 경우에만 삽입한다.
		if(datas.contains(50)) { //contains메서드 : ()안의 내용이 포함되어 있다면 true를 반환해줌
			datas.add(datas.indexOf(50) +1 , 500); //indexOf메서드 : 값이 몆번째 인덱스에 있는지 위치를 표시해 줍니다. 
																 //add에 위치를 지정해서 값을 넣어줄 수도 있음 그냥 넣으면 맨 뒤로 넣어줍니다.
			System.out.println(datas);
		}
		System.out.println("==========================================");
		
		//문제2)
		//20을 2으로 수정
		if(datas.contains(20)) {
			datas.set(datas.indexOf(20), 2); //set은 setter처럼 값을 바꿔주는 메소드 입니다.
			System.out.println(datas);
		}
		System.out.println("==========================================");
		
		//문제3)
		//인덱스로 40을 삭제
		if(datas.contains(40)) {
			datas.remove(datas.indexOf(40)); //remove는 내용을 삭제해주는 메소드 입니다.
			System.out.println(datas);
		}
		System.out.println("==========================================");
		
		//문제4)
		//값으로 60을 삭제
		if(datas.remove(Integer.valueOf(60))) { //remove는 boolean 값으로 반환해주기 때문에 조건식에도 활용 가능
			System.out.println(datas);
		}
		
		
		
		
		
	}
}
