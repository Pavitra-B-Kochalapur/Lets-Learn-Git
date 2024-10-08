import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * ArrayList manages arrays internally
		 * [0][1][2][3]......
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * LinkedList consists of elements where each element
		 * has a reference to the previous and next elements
		 * [0]->[1]->[2].....
		 *    <-   <-
		 */
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList",arrayList);
		doTimings("LinkedList", linkedList);

	}

	private static void doTimings(String type,List<Integer> list) {
		for(int i =0; i <1E5;i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		//Add items at the end of list
		  for(int i=0; i<1E5;i++) {
			list.add(i);
			
		}
		 
		//Add items elsewhere in list
		/*for(int i=0; i<1E5;i++) {
			list.add(0,i);
		}
		*/
		long end = System.currentTimeMillis();
				
	}
}
