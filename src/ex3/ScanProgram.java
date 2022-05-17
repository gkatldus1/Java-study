package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScanProgram {

	public static void main(String[] args) throws IOException {
		File srcFile  = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		
		Scanner fscan = new Scanner(srcFis);
		
		String word = fscan.next();
		int num = Integer.parseInt(word);
		
		System.out.println(num + 3);
		
		word = fscan.next();
		System.out.println(word);
		
		fscan.close();
		srcFis.close();
	}

}
