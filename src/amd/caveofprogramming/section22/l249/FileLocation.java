package amd.caveofprogramming.section22.l249;

import java.io.File;

public class FileLocation {

	public static void main(String[] args) {

		String fileLocation = "D:\\Java\\workspace\\JavaRecap2022\\src\\amd\\caveofprogramming\\section22\\l249\\test.txt";
		
		System.out.println(new File(fileLocation).exists());
		
	}

}
