class Machine{
	private String name;
	private int code;
	
	public Machine() {
		this("Arnie",0); // Constructor call, it should be in 1st line of constructor
		System.out.println("constructor Running..");
	}
	public Machine(String name) {
		this(name,0);
		System.out.println("Second constructor running");
		this.name = name;
	}
	public Machine(String name,int code) {
		System.out.println("Third constructor Running");
		this.name = name;
		this.code = code;
	}

}

public class App {
public static void main(String[] args) {
	//Machine machine1 = new Machine();
	//Machine machine2 = new Machine("Bertie");
	Machine machine3 = new Machine("Chalky",1);
}
}
