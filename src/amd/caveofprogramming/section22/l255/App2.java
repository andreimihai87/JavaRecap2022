package amd.caveofprogramming.section22.l255;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

public class App2 {

	public static void main(String[] args) {

		String pathStr = "D:\\Java\\workspace\\JavaRecap2022\\src\\amd\\caveofprogramming\\section22\\l254\\test.bin";

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathStr))) {

			Person p1 = (Person) ois.readObject();
			System.out.println(p1);

		} catch (FileNotFoundException e) {
			System.err.println("Cannot open file " + pathStr);
		} catch (InvalidClassException e) {
			System.out.println("Invalid class version in " + pathStr);
		} catch (IOException e) {
			System.out.println("Cannot read file " + pathStr);
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found for object in file " + pathStr);
		}

	}

}
