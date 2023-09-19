package interfaceTest;

public class Cat implements Pet {

	@Override
	public void sitDown() {
		System.out.println("아무런 반응 없음");
	}

	@Override
	public void stop() {
		System.out.println("아무런 반응 없음");
	}

	@Override
	public void poop() {
		System.out.println("알아서 배변 처리함");
	}

	@Override
	public void bbang() {
		System.out.println("아무런 반응 없음");
	}

}
