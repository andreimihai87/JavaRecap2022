package amd.caveofprogramming.section11.game;

public class GameItem {
	
	private int id;
	private String name;
	
	// @formatter:off
	private int[][] comparison = {
			//				rock 	 paper	 scissors
			/* rock */		{ 0 , 	  -1,		 1 },
			/* paper */		{ 1 ,  	   0, 		-1 },
			/* scissors */	{-1 , 	   1, 		 0 }
	};
	// @formatter:on

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
	
	/** Compare to GameItems */
	public int compareTo(GameItem otherItem) {
		return comparison[id][otherItem.id];
	}

	@Override
	public String toString() {
		return "GameItem [id=" + id + ", name=" + name + "]";
	}

}
