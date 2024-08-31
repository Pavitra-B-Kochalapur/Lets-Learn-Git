import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return id +":"+ name;
	}
	
	
}
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String S1, String S2) {
		int len1 = S1.length();
		int len2 = S2.length();
		
		if(len1 > len2) {
			return 1;
		}
		else if(len1 < len2) {
			return -1;
		}
			
		return 0;
	}
	
}

class AlphabaticalOrderComparator implements Comparator<String>{

	@Override
	public int compare(String S1, String S2) {
		return S1.compareTo(S2);
	}
	
}
class ReverseAlphabaticalOrderComparator implements Comparator<String>{

	@Override
	public int compare(String S1, String S2) {
		return -S1.compareTo(S2);
	}
	
}

public class App {
	public static void main(String[] args) {
		
		////Sorting Strings////
		List<String> animals = new ArrayList<String>();
		
		animals.add("dog");
		animals.add("monkey");
		animals.add("cat");
		animals.add("mongoose");
		animals.add("ant");
		
		//Collections.sort(animals,new StringLengthComparator());
		Collections.sort(animals,new ReverseAlphabaticalOrderComparator());
		for(String animal : animals) {
			System.out.println(animal);
		}

		System.out.println("\n");
		////Sorting Integers////
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(100);
		numbers.add(50);
		numbers.add(200);
		numbers.add(70);
		numbers.add(10);
		
		Collections.sort(numbers,new Comparator<Integer>(){

			@Override
			public int compare(Integer n1, Integer n2) {
				return -n1.compareTo(n2);
			}
			
		});
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("\n");
		
		////Sorting arbitrary(Objects)
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1,"bob"));
		people.add(new Person(2,"mike"));
		people.add(new Person(3,"sue"));
		people.add(new Person(4,"joe"));
		
		System.out.println("\nSorting in order of ID");
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getId() > p2.getId()) {
					return 1;
				}
				else if(p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}
			
		});
		
		for(Person person : people) {
			System.out.println(person);
		}
		
		System.out.println("\nSorting in order of Name");
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		for(Person person : people) {
			System.out.println(person);
		}
		

	}

}
