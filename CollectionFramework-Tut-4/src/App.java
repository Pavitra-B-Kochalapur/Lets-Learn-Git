import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {
		
		//Maintains no order
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		
		//Maintains insertion order
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		
		//Maintains natural order
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		testMap(linkedHashMap);
	}
	
	public static void testMap(Map<Integer,String> map) {
		map.put(8,"Eight");
		map.put(5,"five");
		map.put(4,"four");
		map.put(2,"two");
		map.put(3,"three");
		
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ":"+value);
		}
		
	}

}
