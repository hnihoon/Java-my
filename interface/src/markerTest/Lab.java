package markerTest;

public class Lab {

	//Herbivore : 초식동물
	//Carnivore : 육식동물
	
	public void checkKind(Animal[] animals) {
		for(int i = 0; i < animals.length; i++){
			if(animals[i] instanceof Herbivore) {
				System.out.println("초식동물 입니다.");
			} else if(animals[i] instanceof Carnivore) {
					System.out.println("육식동물 입니다.");
			} else {
					System.out.println("잡식동물 입니다.");
			}
		}
	}
	public static void main(String[] args) {
		Lab lab = new Lab();
		Animal[] animals = {
									new Bear(),
									new Cow(),
									new Dog(),
									new Tiger()
		};
		
		lab.checkKind(animals);
	}
}
