import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 4801633306273802062L;
	private transient int id;
	private String name;
	
	private static int count;
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	
	public Person() {
		System.out.println("Default Constructor");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Two-argument Constructor");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] count is:" + count;
	}
	
	

	

}
