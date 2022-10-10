package amd.caveofprogramming.section20.l222;

public class App {

	public static void main(String[] args) {

		int intValue = 10;
		long longValue = intValue;

		System.out.println(longValue);

		long longValue2 = 123456789123L;
		System.out.println(longValue2);
		
		int intValue2 = (int) longValue2;
		System.out.println(intValue2);
		
		int intValue3 = 23;
		byte byteValue3 = (byte) intValue3;
		System.out.println(byteValue3);
		
	}

}
