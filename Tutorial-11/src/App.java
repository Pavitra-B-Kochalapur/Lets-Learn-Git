class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: "+name);
	}
	
	int calculateYearsToREtirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}





public class App {
	public static void main(String[] args) {
      Person person1 = new Person();
      person1.name = "Jeo";
      person1.age = 25;
      
      person1.speak();
      
      int years = person1.calculateYearsToREtirement();
      System.out.println("years till retirement: " + years);
      
      int age = person1.getAge();
      System.out.println("Age is: "+ age);
      
      String name = person1.getName();
      System.out.println("Name is: "+ name);
	}
}
