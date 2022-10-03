package amd.caveofprogramming.section18.l195;

public class App {

	public static void main(String[] args) {

		Fruit fruit = Fruit.APPLE;

		switch (fruit) {
		case APPLE:
			System.out.println("it is an apple");
			break;
		case BANANA:
			System.out.println("it is a banana");
			break;
		case ORANGE:
			System.out.println("it is a orange");
			break;
		default:
			System.out.println("it is not a fruit");
			break;
		}

	}

}
