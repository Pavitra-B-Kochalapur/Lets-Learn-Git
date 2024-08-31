class Machine{
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("Camera started");
	}
	public void snap() {
		System.out.println("Photo clicked");
	}
	
}
public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//UpCasting
		Machine machine2 = camera1;
		machine2.start();
		//error : machine2.snap();
		
		//DownCasting
		Machine machine3 = camera1;
		Camera camera2 = (Camera)machine3;
		System.out.println("---------------------");
		camera2.start();
		camera2.snap();
		
		//Doesn't work, run time error
		Machine machine4 = new Machine();
		//Camera camera3 = (Camera)machine4;
		//camera3.start();
		//camera3.snap();
	}

}
