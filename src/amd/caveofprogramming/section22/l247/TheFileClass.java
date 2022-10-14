package amd.caveofprogramming.section22.l247;

import java.io.File;
import java.io.IOException;

public class TheFileClass {

	public static void main(String[] args) throws IOException {

		File currentDirectory = new File(".");

		System.out.println(currentDirectory.getAbsolutePath());
		System.out.println(currentDirectory.getCanonicalPath());

		System.out.println(currentDirectory.getName());

		for (String file : currentDirectory.list()) {
			System.out.println(file);
		}

	}

}
