
public class App {

	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String[] args) {
		int count = 15;
		System.out.println(n1 + " " + n2);
		printFibo(count - 2);
		System.out.println(count);

	}

	public static void printFibo(int count) {
       System.out.println(count);
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" " + n3);
			printFibo(count - 1);
			//System.out.println(count);
		}

	}

}
