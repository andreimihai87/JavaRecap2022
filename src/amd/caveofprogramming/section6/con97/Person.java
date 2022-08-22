package amd.caveofprogramming.section6.con97;

public class Person {

	private String name;
	private int height;
	
	public Person() {
		name = "?";
		height = 0;
		System.out.println("Created a person!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
