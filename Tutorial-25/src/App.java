import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}

public class App {
	public static void main(String[] args) {
		
		////Before Java5 ////
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("Banana");
		list.add("mango");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		////Modern Style////
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("cow");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		////There can be more than one type arguments///
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		////Java7 Style////
		ArrayList<Animal> SomeList = new ArrayList<>();
		
	}

}
