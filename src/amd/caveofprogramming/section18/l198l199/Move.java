package amd.caveofprogramming.section18.l198l199;

public enum Move {

	ROCK(0, "Rock"), PAPER(1, "Paper"), SCISSORS(2, "Scissors");

	int id;
	String name;
	Move beats;

	Move(int id, String name) {
		this.id = id;
		this.name = name;
	}

	static {
		ROCK.beats = SCISSORS;
		PAPER.beats = ROCK;
		SCISSORS.beats = PAPER;
	}

	boolean beats(Move move) {
		return this.beats == move;
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
