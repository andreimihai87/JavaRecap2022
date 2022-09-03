package amd.caveofprogramming.section14.l167;

public class Person implements IGreeter, ISpeaker {

	@Override
	public void speak() {
		System.out.println("I am a person.");
	}

	@Override
	public void greet() {
		System.out.println("Hi!");
	}

}
