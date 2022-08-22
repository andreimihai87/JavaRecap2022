package amd.caveofprogramming.section7;

public class RandomWord {

	private String[] words = { "tale", "time", "future", "sister", "sweet", "family", "blacksmith", "gentleman" };
	private String word;

	public RandomWord() {
		word = words[0];
	}

	public String toString() {
		return word;
	}

}
