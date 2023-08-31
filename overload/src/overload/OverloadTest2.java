package overload;

public class OverloadTest2 {

	private String job;
	private int age;
	
	public OverloadTest2() {
		
	}
	
	public OverloadTest2(int age) {
		this.age = age;
	}
	
	public OverloadTest2(String job) {
		this.job = job;
	}
	
	public OverloadTest2(String job, int age) {
		this.job = job;
		this.age = age;
	}

	@Override
	public String toString() {
		return "OverloadTest2 [job=" + job + ", age=" + age + "]";
	}
	
}
