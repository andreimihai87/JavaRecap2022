package amd.caveofprogramming.section22.l256;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App1 {

	public static void main(String[] args) {

		String pathStr = "D:\\Java\\workspace\\JavaRecap2022\\src\\amd\\caveofprogramming\\section22\\l256\\test.bin";

		Person p1 = new Person("Andrei", 1);
		Person p2 = new Person("Mihai", 2);
		Person p3 = new Person("Joe", 3);

		Person[] persons = { p1, p2, p3 };

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathStr))) {
			oos.writeObject(persons);
		} catch (FileNotFoundException e) {
			System.err.println("Cannot create file " + pathStr);
		} catch (IOException e) {
			System.err.println("Cannot write file " + pathStr);
		}

		System.out.println("Completed!");
	}

}
