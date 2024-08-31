import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		
		//HashSet : maintaining no-order
		//Set<String> set1 = new HashSet<String>();
		
		//LinkedHashSet : maintaining insertion-order
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet : maintaining natural-order
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("Set1 is empty before adding items");
		}
		
		set1.add("dog");
		set1.add("cat");
		set1.add("snake");
		set1.add("ant");
		set1.add("monkey");
		
		if(set1.isEmpty()) {
			System.out.println("Set1 is empty after adding items");
		}
		
		//Adding duplicates elements does nothing
		set1.add("monkey");
		
		System.out.println(set1);
		
		///////Iteration//////
		for(String element : set1) {
			System.out.println(element);
		}
		
		if(set1.contains("elephant")) {
			System.out.println("Contains elephant");
		}
		
		if(set1.contains("ant")) {
			System.out.println("Contains ant");
		}
		
		//set2 contains some common elements with set1, and some new
		
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("elephant");
		set2.add("mouse");
		
		////Intersection////
		Set<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		////Difference////
		Set<String> difference = new HashSet<String>(set2);
		difference.removeAll(set1);
		System.out.println(difference);
	}

}
