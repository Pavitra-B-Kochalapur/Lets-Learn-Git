import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding items
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		
		//Retrieving item
		System.out.println(numbers.get(0));
		
		System.out.println("\nIteration #1");
		//Indexed for loop iteration
		for(int i =0 ; i < numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		//Removing items
		numbers.remove(numbers.size()-1);
		
		//very slow
		numbers.remove(0);
		System.out.println("\nIteration #2");
		for(Integer values : numbers) {
			System.out.println(values);
		}
		
		//List interface.(ArrayList implements list)
		List<String> values = new ArrayList<String>();
	}
}
