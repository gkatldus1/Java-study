package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex4_GradeRangeProgram {

	public static void main(String[] args) throws IOException {
		File copyPath = new File("res/ex4");
		if(!copyPath.exists())
			copyPath.mkdir();
		
		FileOutputStream copyFos = new FileOutputStream("res/ex4/data-grade-range.txt");
		PrintStream fout = new PrintStream(copyFos);
		
		File srcFile = new File("res/ex4/data-grade.txt");
		
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		
		String read = "";
		
		lalal:
		while(fscan.hasNext()) {
			read = fscan.next();
			
			switch(read) {
			
			case "A+":
				fout.print("95~100");
				break;
			case "A":
				fout.print("90~94");
				break;
			case "B+":
				fout.print("85~89");
				break;
			case "B":
				fout.print("80~84");
				break;
			case "C+":
				fout.print("75~79");
				break;
			case "C":
				fout.print("70~74");
				break;
			case "D+":
				fout.print("65~69");
				break;
			case "D":
				fout.print("60~64");
				break;
			case "F":
				fout.print("0~59");
				break;
			default:
				fout.print("치명적인 데이터 손상으로 종료하겠습니다.");
				break lalal;
	
			}
			
//			if(read.equals("값이 잘못되었습니다."))	fout.print("범위를 벗어난 성적");
//			
//			else if(read.equals("A+"))	fout.print("95~100");
//			
//			else if(read.equals("A"))	fout.print("90~94");
//			
//			else if(read.equals("B+"))	fout.print("85~89");
//			
//			else if(read.equals("B"))	fout.print("80~84");
//			
//			else if(read.equals("C+"))	fout.print("75~79");
//			
//			else if(read.equals("C"))	fout.print("70~74");
//			
//			else if(read.equals("D+"))	fout.print("65~69");
//			
//			else if(read.equals("D"))	fout.print("60~64");
//			
//			else	fout.print("0~59");
			
			if(fscan.hasNext())	fout.print(", ");
				
		}
		
		라벨:while(true){
		    System.out.println("test");
		    break 라벨;
		}


		
		fscan.close();
		srcFis.close();
		
		fout.close();
		copyFos.close();

	}

}
