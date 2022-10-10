package amd.caveofprogramming.section19.l211;

public class Person {

	public void setName(String name) throws Exception {

		if (name == null) {
			throw new Exception("Name must not be null!");
		}
		System.out.println("The name is " + name);
	}

}
