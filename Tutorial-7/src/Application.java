import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter some text here: ");
		
		String text = scanner.nextLine();
		
		switch(text)
		{
		case "start" :
			System.out.println("Machine started..");
			break;
			
		case "stop" :
			System.out.println("Machine stopped");
			break;
			
			default :
				System.out.println("Command not recognized");
		}
		

	}

}
