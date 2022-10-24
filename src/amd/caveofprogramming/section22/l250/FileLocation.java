package amd.caveofprogramming.section22.l250;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLocation {

	public static void main(String[] args) {

		String fileLocation = "D:\\Java\\workspace\\JavaRecap2022\\src\\amd\\caveofprogramming\\section22\\l250\\test.txt";
		System.out.println(new File(fileLocation).exists());

		try (BufferedReader buffReader = new BufferedReader(new FileReader(fileLocation))) {
			String line = null;
			while ((line = buffReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + fileLocation);
		} catch (IOException e) {
			System.err.println("File handling error: " + fileLocation);
		}

	}

}
