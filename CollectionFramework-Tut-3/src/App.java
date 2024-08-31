import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(6, "Hello");
		map.put(6, "six");
		map.put(4, "four");
		map.put(5, "five");
		map.put(8, "eight");
		map.put(9, "nine");
		
		
		//We can't have duplicate keys we can have duplicate values
		String text = map.get(6);
		System.out.println(text);
		
		map.replace(5, "Hii..");
		//map.remove(5);
		
		for(Map.Entry<Integer, String> entry : map.entrySet() ) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ":"+value);
		}
		
		
	}

}
