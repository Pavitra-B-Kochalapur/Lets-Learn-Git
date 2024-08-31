
public class App {

	
	public static void main(String[] args) {
		
		Animal animal = Animal.DOG;
		
		switch(animal) {
		case CAT:
			System.out.println("cat");
			break;
		case DOG:
			System.out.println("dog");
			break;
		case MOUSE:
			System.out.println("mouse");
			break;
		default:
			break;
		
		}
		System.out.println(Animal.DOG);
		System.out.println("Enum name as a String : "+Animal.DOG.name());
		System.out.println(Animal.DOG.getName());
		
		//we can use instanceof Animal = calss name here instead of Enum
		System.out.println(Animal.DOG instanceof Enum);
		
		System.out.println(Animal.DOG.getClass());
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2.ordinal());
		

	}

}
