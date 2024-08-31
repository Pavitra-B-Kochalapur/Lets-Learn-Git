
interface Executable{
	 int execute(int a , int b);
}

interface StringExecutable{
	int execute(String a);
}
class Runner{
	public void run(Executable e) {
		System.out.println("Executting code block ...");
		int value = e.execute(10 , 12);
		System.out.println("Return value : " + value);
	}
	
	public void run(StringExecutable e) {
		System.out.println("Executting code block ...");
		int value = e.execute("Hello");
		System.out.println("Return value : " + value);
	}
}

// () -> System.out.println(Hello there);
public class App {

	public static void main(String[] args) {
		
		int c= 100;
		//Mustn't do this ; c = 8;
		
		int d = 77;
		
		Runner runner = new Runner();
		runner.run(new Executable(){

			@Override
			public int execute(int a , int b) {
				System.out.println("Hello there.");
				//can do this in methods of anonymous classes int d =8;
				return a + d + c;
				
			}
			
		});
		
		System.out.println("====================");
		
		runner.run((a,b) -> {
			System.out.println("Hello there");
			//can't do this; no new scope int d =99;
			return a + b + c;
		});
	}
}
