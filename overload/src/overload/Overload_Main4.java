package overload;

public class Overload_Main4 {

	public static void main(String[] args) {
		Overload_this2 osu1 = new Overload_this2(1);
		System.out.println(osu1.toString());
		
		Overload_this2 osu2 = new Overload_this2(2, "테스트 게시물");
		System.out.println(osu1.toString());
		
		Overload_this2 osu3 = new Overload_this2(3, "두 번재 게시물 ", "자바학생");
		System.out.println(osu1.toString());
	}

}
