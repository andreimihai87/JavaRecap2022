package amd.caveofprogramming.section6.conp98;

public class Person {

	private String name;
	private int height;

	public Person() {
		this.name = "?";
		this.height = 0;
	}

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
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
