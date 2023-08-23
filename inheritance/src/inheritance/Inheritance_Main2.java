package inheritance;

public class Inheritance_Main2 {

	public static void main(String[] args) {
		
		Inheritance_Child2_2 child2 = new Inheritance_Child2_2();
		child2.setNum(1);
		child2.setTitle("첫 번째 자료 입니다.");
		child2.setFileName("java.pdf");
		System.out.println(child2.toString());
		
		System.out.println("-------------------------------------");
		
		Inheritance_Child2_1 child1 = new Inheritance_Child2_1();
		child1.setNum(1);
		child1.setTitle("첫 번째 질문입니다.");
		child1.setAnswer("첫 번째 답변입니다.");
		System.out.println(child1.toString());
	}

}
