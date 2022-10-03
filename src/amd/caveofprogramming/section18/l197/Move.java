package amd.caveofprogramming.section18.l197;

public enum Move {

	ROCK(0, "Rock"), PAPER(1, "Paper"), SCISSORS(2, "Scissors");

	int id;
	String name;
	
	Move(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// @formatter:off
	private int[][] comparison = {
			//				rock 	 paper	 scissors
			/* rock */		{ 0 , 	  -1,		 1 },
			/* paper */		{ 1 ,  	   0, 		-1 },
			/* scissors */	{-1 , 	   1, 		 0 }
	};
	// @formatter:on
	
	/** Compare to Move */
	public int compare(Move otherItem) {
		return comparison[id][otherItem.id];
	}

}
