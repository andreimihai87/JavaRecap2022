package amd.caveofprogramming.section24.l275andl280.hierarchy;

public class Creature {

	private String name;
	
	public Creature(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
