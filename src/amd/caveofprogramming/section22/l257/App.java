package amd.caveofprogramming.section22.l257;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String fileName = "writingBytes.txt";
		File file = new File(fileName);

		// 4 bytes
		int value = 1;
		// 8 bytes
		double dValue = 10.2;
		// 2 bytes
		byte[] myBytes = new byte[2];
		myBytes[0] = 2;
		myBytes[1] = 3;

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
			dos.writeInt(value);
			dos.writeDouble(dValue);
			dos.write(myBytes);
		} catch (FileNotFoundException e) {
			System.err.println("Cannot create file " + file.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Cannot write file " + file.getAbsolutePath());
		}

		System.out.println("File writen " + file.getAbsolutePath());
		System.out.println("File length in bytes: " + file.length());

	}

}
