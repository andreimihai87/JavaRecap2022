package amd.caveofprogramming.section18.l194;

public enum Fruit {
	
	APPLE("green"), ORANGE("orange"), BANANA("yellow");
	
	private String color;
	
	Fruit(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + color + ")";
	}

}
