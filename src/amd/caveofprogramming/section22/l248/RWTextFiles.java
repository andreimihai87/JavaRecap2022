package amd.caveofprogramming.section22.l248;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RWTextFiles {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("test.txt");

		String text = "Hello Andrei!";

		Files.write(path, text.getBytes());
		
		String retrivedText = Files.readString(path);
		
		System.out.println(retrivedText);

	}

}
