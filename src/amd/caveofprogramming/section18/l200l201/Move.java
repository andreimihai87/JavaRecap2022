package amd.caveofprogramming.section18.l200l201;

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

}
