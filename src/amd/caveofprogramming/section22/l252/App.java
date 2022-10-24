package amd.caveofprogramming.section22.l252;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	private String name;
	private int id;

	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}

public class App {

	public static void main(String[] args) {

		Person p1 = new Person("Andrei", 1);

		String stringPath = "test.bin";

		try (ObjectOutputStream objectOutputS = new ObjectOutputStream(new FileOutputStream(stringPath))) {
			objectOutputS.writeObject(p1);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot create file " + stringPath);
		} catch (IOException e) {
			System.out.println("Cannot write file " + stringPath);
		}

		System.out.println("Completed! " + stringPath + " created!");

	}

}
