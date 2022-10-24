package amd.caveofprogramming.section22.l253;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
		System.out.println(p1);
		String stringPath = "test.bin";

		try (ObjectOutputStream objectOutputS = new ObjectOutputStream(new FileOutputStream(stringPath))) {
			objectOutputS.writeObject(p1);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot create file " + stringPath);
		} catch (IOException e) {
			System.out.println("Cannot write file " + stringPath);
		}

		System.out.println();
		System.out.println("Completed! " + stringPath + " created!");
		System.out.println();

		try (ObjectInputStream objectInputS = new ObjectInputStream(new FileInputStream(stringPath))) {

			Person p = (Person) objectInputS.readObject();
			System.out.println(p);

		} catch (FileNotFoundException e) {
			System.out.println("Cannot open file " + stringPath);
		} catch (IOException e) {
			System.out.println("Cannot read file " + stringPath);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found for object in file " + stringPath);
		}

	}

}
