package amd.caveofprogramming.section22.l258;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		new App().run();
	}
	
	public void run() {
		String fileName = "writeReadBytes.bin";
		
		writeFile(fileName);
		readFile(fileName);
	}
	
	public void readFile(String fileName) {
		
		System.out.println("Read file...");
		
		File file = new File(fileName);

		try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {

			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			
			byte[] bytes = dis.readAllBytes();

			System.out.println(bytes[0]);
			System.out.println(bytes[1]);
			
		} catch (FileNotFoundException e) {
			System.err.println("Cannot open file " + file.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Cannot read file " + file.getAbsolutePath());
		}

		System.out.println("File read " + file.getAbsolutePath());
		System.out.println("File length in bytes: " + file.length());
	}
	
	public void writeFile(String fileName) {
		
		System.out.println("Write file...");
		
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

		System.out.println("File written " + file.getAbsolutePath());
		System.out.println("File length in bytes: " + file.length());
		System.out.println();
		
	}

}
