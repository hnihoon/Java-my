package inheritance;

public class Inheritance_Main1 {

	public static void main(String[] args) {
		Inheritance_Parent1 parent = new Inheritance_Parent1();
		System.out.println(parent.plue(10, 20));
		System.out.println(parent.minus(100, 50));
		
		System.out.println("-----------------------------------");
		
		Inheritance_Child1 child1 = new Inheritance_Child1();
		System.out.println(child1.plue(100, 50));
		System.out.println(child1.minus(100, 50));
		System.out.println(child1.times(10, 20));
		System.out.println(child1.divide(200, 100));
		
	}

}
