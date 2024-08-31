
public class App {

	public static void main(String[] args) {

		App app = new App();
		//--------------------------------------------------
		int value=7;
		System.out.println("1.value is: "+value);
		
		// changes will be in the local variable only
		//app.show(10);
		
		//changes will be in the instance variable only
		app.show(value);
		
		
		System.out.println("4.value is: "+value);
		//---------------------------------------------------
		System.out.println();
		
		Person person = new Person("Bob");
		System.out.println(person);
		System.out.println("1.person name is:"+person);
		app.show(person);
		System.out.println("4.person name is:"+person);

	}

	// Passing by value - Primitive dataType
	public void show(int value) {
		System.out.println("2.value is: " + value);

		value = 8;
		System.out.println("3.value is:" + value);

	}
	
	//Passing by Reference - Non-primitive dataType
	public void show(Person person) {
		System.out.println("2.person name is:"+person);
		
		//person.setName("Sue");
		
		person = new Person("Mike");
		person.setName("Sue");
		System.out.println("3.person name is:"+person);
		
	}

}
