import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("This is First Line");
			bw.newLine();
			bw.write("this is Second Line");
			bw.newLine();
			bw.write("This is Last Line");
			
		} catch (IOException e) {
			System.out.println("Unable to Read File : "+file.toString());
		}

	}

}
