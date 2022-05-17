package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		File copyFile = new File("res/data-result.txt");
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		
		Scanner fscan = new Scanner(srcFis);
		PrintStream fout = new PrintStream(copyFos);
		
		
		int sum = 0;
//		int i = 0;
//		
//		while(i < 5 &&fscan.hasNext()) {
//			
//			String x_;
//			x_ = fscan.next();
//			
//			
//			int x = Integer.parseInt(x_);
//			sum += x;
//			i++;
//			
//		}
		
		for(int i = 0; i<5 && fscan.hasNext(); i++) {
			String x_ = fscan.next();
			
			int x = Integer.parseInt(x_);
			sum += x;
		}
		
		
		
		
		
		
		
		
		
		
		fout.printf("sum is %d", sum);
		
		fscan.close();
		fout.close();
		srcFis.close();
		copyFos.close();
	}

}
