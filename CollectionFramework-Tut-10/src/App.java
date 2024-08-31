import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> animals = new LinkedList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Monkey");
		animals.add("Tiger");
		
		//"Old" way of iterating through lists (except that generic
		//didn't exist pre Java 5). This way is still an integral part
		//of Java; it allows you to remove items from the list
		//and also supports the "for each" syntax behind the scenes.
		
		Iterator<String> it = animals.iterator();
		
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);

			if (value.equals("cat")) {
				it.remove();
			}
		}

		System.out.println();
		
		/*
		 * If you want to add items to a list while iterating through 
		 * it, get a ListIterator using the. listIterator() method.
		 * ListIterator also has a previous() method , allowing you to
		 * "rewind" the iterator so that you can add items before 
		 * the current item.
		 */
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		//The following won't work; you need an iterator.
		// Throws ConcurrentModificationException
		//animals.remove(2);
	}
	
}
