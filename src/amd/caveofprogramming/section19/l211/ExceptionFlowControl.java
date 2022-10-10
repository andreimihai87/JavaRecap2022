package amd.caveofprogramming.section19.l211;

public class ExceptionFlowControl {

	public static void main(String[] args) throws Exception {

		Person person1 = new Person();

		try {
			person1.setName("Eva");
			System.out.println("Still in try block!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			System.out.println("This text from finally is always executed.");
		}

		System.out.println("Program completed!");

	}

}
