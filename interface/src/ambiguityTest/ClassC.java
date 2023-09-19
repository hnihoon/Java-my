package ambiguityTest;

public class ClassC implements InterA, InterB{

	@Override
	public void printDate() {
		// TODO Auto-generated method stub
		InterA.super.printDate();
	}
	
}
