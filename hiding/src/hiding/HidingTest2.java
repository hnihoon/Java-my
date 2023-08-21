package hiding;

class Student{
	// 은닉된 멤버변수 -> 현재 class 블록 안에서 접근 가능
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class HidingTest2 {

	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.setAge(20);
		stu.setName("Java학생");

		System.out.println(stu.getAge());
		System.out.println(stu.getName());
	}
}
