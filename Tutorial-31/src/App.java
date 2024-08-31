
public class App {

	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
		cam1.run();
		System.out.println(cam1.getId());
		
		Car  car1 = new Car();
		car1.setId(6);
		car1.dostuff();

	}

}
