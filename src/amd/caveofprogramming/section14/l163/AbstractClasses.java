package amd.caveofprogramming.section14.l163;

public class AbstractClasses {

	public static void main(String[] args) {

		GameObject[] gameObjects = { new Player(), new Monster() };

		for (GameObject gameObject : gameObjects) {
			gameObject.describe();
		}

	}

}
