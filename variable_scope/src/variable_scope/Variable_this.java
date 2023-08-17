package variable_scope;


class Member{
	String name;
	int age;
	
	String getName() {
		return this.name;
	}
	
// 아래와 같은 경우 name이 한개 뿐 임으로 this를 생략해도 전역변수 name을 가르킨다
//	String getName() {
//		return name;
//	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return this.age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void say() {
		System.out.println(this.getName());
		System.out.println(getAge());
	}
}
public class Variable_this {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("학생");
		member.setAge(18);
		member.say();
	}

}
