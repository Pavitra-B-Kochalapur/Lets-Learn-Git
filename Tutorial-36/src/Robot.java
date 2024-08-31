
public class Robot {
	private int id;
	
	public Robot(int id) {
		super();
		this.id = id;
	}
	//Non-static Inner Class(1.member Inner Class)
	public class Brain{
		public void working() {
			System.out.println("Robot id = " + id +" Brain is Working");
		}
	}
	//Static Inner Class
	public static class Battery{
		public void charge() {
			System.out.println("Robot is Charging!!");
		}
	}

	public void start() {
		System.out.println("Starting Robot ID = "+ id);
		Brain brain = new Brain();
		brain.working();
		final String name = "Robot";
		 class Temp{
			public void doSomeThing() {
				System.out.println("ID is:"+id);
				System.out.println("My Name is:"+name);
			}
		}
		 Temp temp = new Temp();
		 temp.doSomeThing();
	}

}
