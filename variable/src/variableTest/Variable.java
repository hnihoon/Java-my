package variableTest;

public class Variable {

	public static void main(String[] args) {
		
		int a = 10;
		float b = 10.9F;		//실수 맨 뒤에 F 를 넣어줌으로 float 타입인걸 알려줘야합니다.
		double c= 10.9;
		char d = 'A';			//char(문자형)은 ''(작은따옴표)안에 1개의 문자만 넣을 수 있습니다.
		String e = "ABC";		//String(문자열)은 ""(큰따옴표)안에 여러 문자를 넣을 수 있습니다.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
