import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {

		System.out.println("Writing Objects!!");

		Person[] people = { new Person(1, "sue"), new Person(2, "bob"), new Person(3, "mike") };
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

		try (FileOutputStream fs = new FileOutputStream("test.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs);) {

			os.writeObject(people);
			os.writeObject(peopleList);
			os.writeInt(peopleList.size());

			for (Person person : peopleList) {
				os.writeObject(person);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
