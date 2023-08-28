package override;

class Hello3{
	public Hello3(String str) {
		System.out.println(str);
	}
	
	// 해결방법 (1)
	public Hello3() {
		
	}
}
	
class Korean3 extends Hello3{
	//해결방법 (2)
	Korean3(String str){
		super(str);
	}
}

public class Override_constructor {

	public static void main(String[] args) {

	}

}
