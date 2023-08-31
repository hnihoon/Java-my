package overload;

public class Overload_Main2 {

	public static void main(String[] args) {
		OverloadTest2 test2 = new OverloadTest2();
		System.out.println(test2.toString());
		
		OverloadTest2 test3 = new OverloadTest2(20);
		System.out.println(test3.toString());
		
		OverloadTest2 test4 = new OverloadTest2("학생");
		System.out.println(test4.toString());
		
		OverloadTest2 test5 = new OverloadTest2("선생님", 30);
		System.out.println(test5.toString());
	}

}
