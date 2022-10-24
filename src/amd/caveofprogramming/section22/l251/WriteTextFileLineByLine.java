package amd.caveofprogramming.section22.l251;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileLineByLine {

	public static void main(String[] args) throws IOException {

		String fileLocation = "D:\\Java\\workspace\\JavaRecap2022\\src\\amd\\caveofprogramming\\section22\\l251\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileLocation))) {

			bw.write("apple");
			bw.newLine();
			bw.write("orange");
			bw.newLine();
			bw.write("banana");

		} catch (IOException e) {
			System.out.println("An error occurred: " + fileLocation);
		}

		System.out.println("File was writed!");

	}

}
