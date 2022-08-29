package amd.caveofprogramming.section11.rpc.game;

public class GameItem {
	
	private int id;
	private String name;
	
	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GameItem [id=" + id + ", name=" + name + "]";
	}

}
