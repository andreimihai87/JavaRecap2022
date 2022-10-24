package amd.caveofprogramming.section22.l254;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App1 {

	public static void main(String[] args) {

		String pathStr = "D:\\Java\\workspace\\JavaRecap2022\\src\\amd\\caveofprogramming\\section22\\l254\\test.bin";

		Person p1 = new Person("Andrei", 1);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathStr))) {
			oos.writeObject(p1);
		} catch (FileNotFoundException e) {
			System.err.println("Cannot create file " + pathStr);
		} catch (IOException e) {
			System.err.println("Cannot write file " + pathStr);
		}

		System.out.println("Completed!");
	}

}
