import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		/*
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//output the prompt
		System.out.println("Enter Integer Value: ");
		
		//wait for the user to enter something
		int value = input.nextInt();
		
		//Tell them what they entered
		System.out.println("You entered: " + value);
		*/
		Scanner scanner = new Scanner(System .in);
		
		int value = 0;
		do {
			System.out.println("Enter Integer Value: ");
			 value = scanner.nextInt();
			
		}
		while(value != 5);
			System.out.println("Got 5!");
		
	}

}
