package interfaceTest;

public class Puppy implements Pet{

	@Override
	public void sitDown() {
		System.out.println("앉는다.");
	}

	@Override
	public void stop() {
		System.out.println("기다린다.");
	}

	@Override
	public void poop() {
		System.out.println("훈련시키면 지정한 위치에 싼다.");
	}

	@Override
	public void bbang() {
		System.out.println("눕는다.");
	}

	
}
