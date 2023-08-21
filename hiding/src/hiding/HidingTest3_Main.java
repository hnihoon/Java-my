package hiding;

public class HidingTest3_Main {

	public static void main(String[] args) {
		HidingTest3 t3 = new HidingTest3("자바학생", 20);
		
		String name = t3.getName();
		System.out.println("이름 : " + name);
				
		System.out.println("나이 : " + t3.getAge());
	}

}
