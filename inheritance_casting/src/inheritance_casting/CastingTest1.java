package inheritance_casting;

class Car{
	
	void engineStart() {
		System.out.println("열쇠로 시동");
	}
}

class SuperCar extends Car{
	@Override
	void engineStart() {
		System.out.println("음성으로 시동");
	}
	
void openRoof() {
	System.out.println("지붕 열림");
	}
}

public class CastingTest1 {

	public static void main(String[] args) {
		//강제형변환 : 에러(ClassCastException)
		//SuperCar brokenFerrari = (SuperCar)new Car();
		
		//up casting : 자식 타입으로 변환시 자식 타입의 고유의 값은 사용 불가능
		Car noOptionFerrari = new SuperCar();
		//noOptionFerrari.openRoof  :  불가능
		
		//down casting : 자식 타입으로 up casting한 변수는 다시 부모 타입으로 변환 가능 자식 고유값 사용 가능
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof(); // 가능
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////

		//객체간 타입 비교 instanceof
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
		System.out.println(matiz instanceof Car	); 							//true 
		System.out.println(matiz instanceof SuperCar);					//false
		System.out.println(ferrari instanceof Car	);							//true
		System.out.println(ferrari instanceof SuperCar	);					//true
		System.out.println(noOptionFerrari instanceof Car);				//true
		System.out.println(noOptionFerrari instanceof SuperCar);		//true
		System.out.println(fullOptionFerrari instanceof Car);				//true
		System.out.println(fullOptionFerrari instanceof SuperCar);		//true
		
	}
}
