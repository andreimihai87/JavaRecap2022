package amd.caveofprogramming.section20.l220;

public class FloatingPointTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		float floatValue = 20.70f;
		double doubleValue = 20.755;
		
		System.out.printf("float  has %d bytes \n", Float.BYTES);
		System.out.printf("double has %d bytes \n", Double.BYTES);
		
		float f = 1.23456789123456789f;
		double d = 1.23456789123456789;
		
		System.out.printf("%.20f \n", f);
		System.out.printf("%.20f \n", d);
		
	}

}
