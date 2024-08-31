import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Optional
 class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		
	}
	
}
public class App {

	public static void main(String[] args) throws Exception {
		
		File file = new File("test.txt");
		
		//try with resource block
		try(Temp temp = new Temp()){
			
		}
		
		//try with resource block
		//BufferedReader this syntax will close the file itself
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File : "+file.toString());
		} catch (IOException e) {
			System.out.println("Unable read File : "+file.toString());		}
		

	}

}
