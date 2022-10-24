package amd.caveofprogramming.section22.l259;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		String fileLocation = "D:\\Java\\workspace\\JavaRecap2022\\bin\\amd\\caveofprogramming\\section22\\l258\\App.class";

		try (DataInputStream dis = new DataInputStream(new FileInputStream(fileLocation))) {

			int magicNumber = dis.readInt();
			System.out.printf("%x ", magicNumber);
			
			int minorVersion = dis.readUnsignedShort();
			int majorVersion = dis.readUnsignedShort();
			
			System.out.println(majorVersion + ", " + minorVersion);

		} catch (FileNotFoundException e) {
			System.err.println("Cannot read file " + fileLocation);
		} catch (IOException e) {
			System.err.println("Cannot open file " + fileLocation);
		}

		System.out.println();
		System.out.println("File read!");
		
	}

}
