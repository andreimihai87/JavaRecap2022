package amd.caveofprogramming.section20.l223;

public class App {

	public static void main(String[] args) {

		long lValue = 123456789123L;
		System.out.println(lValue);
		
		float fValue = 123.45F;
		System.out.println(fValue);
		
		byte bValue = (byte) 130;
		System.out.println(bValue & 0xFF);
		
		int iValue = 1_000_000;
		System.out.println(iValue);
		
		double dValue = 1.5E6;
		System.out.println(dValue);
		
	}

}
