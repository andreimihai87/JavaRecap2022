package amd.caveofprogramming.section9;

public class Cat {
	
	private String name;
	public static final String FOOD = "Cat food";
	private static int count = 0;
	private int id = 0;

	public Cat(String name) {
		this.name = name;
		count++;
		id = count;
	}

	public static int getCount() {
		return count;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Cat id: %d, name: %s", id, name);
	}

}
