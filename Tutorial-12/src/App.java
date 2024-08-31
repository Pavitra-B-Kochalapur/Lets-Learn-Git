class Robot{
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping "+height);
	}
	
	public void move(String direction,double distance) {
		System.out.println("Moving " + distance+"metres in direction "+direction);
	}
}

public class App {
public static void main(String[] args) {
	Robot sam = new Robot();
	sam.speak("Hii, I'm sam");
	sam.jump(7);
	sam.move("West", 12.3);
	//greeting is act like a Label, technically we called reference
	String greeting = "Hello there";
	sam.speak(greeting);
	//greeting is act like a Bucket, technically we called value
	int value = 16;
	sam.jump(value);
	
}
}
