package object;

class BungeoppangMold{
	
	String color = "";
	String ingredient = "";
	String bungeoppang = "";
	
}

public class Bungeoppang {
	
	public static void main(String[] args) {
		
		BungeoppangMold bung1 = new BungeoppangMold();
		BungeoppangMold bung2 = new BungeoppangMold();
		BungeoppangMold bung3 = new BungeoppangMold();
		BungeoppangMold bung4 = new BungeoppangMold();
		
		bung1.color = "베이직";
		bung1.ingredient = "팥";
		bung1.bungeoppang = "팥붕어빵";
		
		bung2.color = "빨강";
		bung2.ingredient = "피자소스";
		bung2.bungeoppang = "피자붕어빵";
		
		bung3.color = "보라색";
		bung3.ingredient = "자색고구마";
		bung3.bungeoppang = "고구마붕어빵";
		
		bung4.color = "노란색";
		bung4.ingredient = "슈크림";
		bung4.bungeoppang = "슈크림붕어빵";
	
		
		System.out.println(bung1.bungeoppang); 
		System.out.println(bung2.bungeoppang); 
		System.out.println(bung3.bungeoppang); 
		System.out.println(bung4.bungeoppang); 
	}

}
