package variable_scope;


class Calc {
	int plus(int x, int y) {
		return x+y;
	}
	
	int minus(int x, int y) {
		return x-y;
	}
	
	int times(int x, int y) {
		return x*y;
	}
	
	int divide(int x, int y) {
		int result = 0;
		if(y != 0) {
			result = x/y;
		}
		return result;
	}
}

public class Variable_Regional {

	public static void main(String[] args) {
		Calc cal = new Calc();
		
		 System.out.println("10 + 5 = " + cal.plus(10, 5));
		 System.out.println("10 - 5 = " + cal.minus(10, 5));
		 System.out.println("10 * 5 = " + cal.times(10, 5));
		 System.out.println("10 / 5 = " + cal.divide(10, 5));

	}

}
