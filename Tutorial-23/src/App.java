
public class App {
	public static void main(String[] args) {

		byte byteValue = 12;
		short shortValue = 123;
		int intValue = 1234;
		
		float floatValue = 8765.3f;
		double doubleValue = 2.234;
		
		System.out.println(Byte.MAX_VALUE);
		intValue = byteValue;
		System.out.println(intValue);
		
		byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		 floatValue = (float)doubleValue;
		 System.out.println(floatValue);
		 
		 intValue = (int)floatValue;
		 System.out.println(intValue);
		 
		 //it won't work as we expect to!
		 //128 is too big for byte
		 byteValue = (byte)128;
		 System.out.println(byteValue);
	}
}
