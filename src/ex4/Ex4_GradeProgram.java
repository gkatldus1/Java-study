package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex4_GradeProgram {

	public static void main(String[] args) throws IOException {
		File copyPath = new File("res/ex4");
		if(!copyPath.exists())
			copyPath.mkdir();
		
		FileOutputStream copyFos = new FileOutputStream("res/ex4/data-grade.txt");
		PrintStream fout = new PrintStream(copyFos);
		
		File srcFile = new File("res/data.txt");
		
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		String read;
		int grade;
		while(fscan.hasNext()) {
			read = fscan.next();
			grade = Integer.parseInt(read);
			
			if(grade>100 || grade < 0)
				fout.print("값이 잘못되었습니다.");
			
			if(95<=grade && grade<=100 ) fout.print("A+ ");
			
			else if(90<=grade && grade<=94) fout.print("A ");
			
			else if(85<=grade && grade<=89) fout.print("B+ ");
			
			else if(80<=grade && grade<=84) fout.print("B ");
			
			else if(75<=grade && grade<=79) fout.print("C+ ");
			
			else if(70<=grade && grade<=74) fout.print("C+ ");
			
			else if(65<=grade && grade<=69) fout.print("D+ ");
			
			else if(60<=grade && grade<=64) fout.print("D ");
			
			else fout.print("F ");
				
		}
		
		
		fscan.close();
		srcFis.close();
		
		fout.close();
		copyFos.close();
	}

}
