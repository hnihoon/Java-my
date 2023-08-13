package object;

class Student{
	
	String name = "kim";
	int age = 20;
	
}

public class ObjectTest1 {
	
	public static void main(String[] args) {
	
//		객체의 선언
//		Student stu;
		
//		객체의 할당
//		stu = new Student();
		
//		객체의 생성
		Student stu = new Student();  	//stu의 name : kim   , age : 20
		Student stu2 = new Student();  	//stu2의 name : kim   , age : 20
		
		System.out.println(stu.name);
		System.out.println(stu.age);
		
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		
		System.out.println("===================================");
		
//		객체 안에 포함된 변수의 값을 다른 변수에 복사
		String studentName = stu.name;
		System.out.println(studentName);
		
		System.out.println("===================================");

		stu.name = "lee";
		System.out.println(stu.name);
		
		System.out.println("===================================");
		
		System.out.println(stu.name);
		System.out.println(stu2.name);
	
	}

}
