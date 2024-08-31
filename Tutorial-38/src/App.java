
public class App {

	public static void main(String[] args) {
		//E.G : Factorial of 4 (4! = 4*3*2*1)
		System.out.println(factorial(4));
	}
	
	public static int factorial(int value) {
		//System.out.println(value);
		
		if(value == 1) {
			return 1;
		}
		else
		return factorial(value - 1) * value;
	}

}
