import java.util.ArrayList;

class Machine{

	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	public void start() {
		System.out.println("Machine starting");
	}
	
}
class Camera{

	@Override
	public String toString() {
		return "I am a Camera";
	}
	
	public void snap() {
		System.out.println("Snapping!");
	}
	
	
}
public class App {
	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		//showList1(list1);
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		//showList2(list2);
		showList3(list2);
		
	}
	
	//Upper Bounded WildCard
	public static void showList1(ArrayList<? extends Machine >list) {
		for(Machine value : list) {
			System.out.println(value);
			value.start();
			
			//won't works here
			//value.snap();
			
		}
	}
	
	//Lower Bounded WildCard
	public static void showList2(ArrayList<? super Camera>list) {
		for(Object value : list) {
		System.out.println(value);
	
		}
	}
	
	//UnBounded WildCard
	public static void showList3(ArrayList<?>list) {
		for(Object value : list) {
			System.out.println(value);
		}
	}

}
