package part3.ex1.func.topdown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public static void load(Exam exam) throws IOException {
		File file = new File("res/data.txt"); 
		FileInputStream fis = new FileInputStream(file);
		Scanner scan = new Scanner(fis);
		
//		exam.kor = scan.nextInt();
//		exam.eng = scan.nextInt();
//		exam.math = scan.nextInt();
		
		String[] tmps = scan.nextLine().split(",");
		
		exam.kor = Integer.parseInt(tmps[0]);
		exam.eng = Integer.parseInt(tmps[1]);
		exam.math = Integer.parseInt(tmps[2]);
		
		scan.close();
		fis.close();
		
		
	}
	
	public static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│             성적입력              │");
		System.out.println("└─────────────────────────────────┘");
		System.out.printf("kor : ");
		
		exam.kor = scan.nextInt();
		System.out.printf("eng : ");
		exam.eng = scan.nextInt();
		System.out.printf("math");
		exam.math = scan.nextInt();
		
		scan.close();
	}
	
	public static void print(Exam exam) {
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│             성적출력              │");
		System.out.println("└─────────────────────────────────┘");
		int total = exam.kor + exam.eng + exam.math;
		float avg = total/(float)3;
		System.out.println("kor :" + exam.kor);
		System.out.println("eng : " + exam.eng);
		System.out.println("math : " + exam.math);
		System.out.println("total : " + total);
		System.out.println("avg : " + avg);
		
	}
	
	public static void save(Exam exam) throws IOException {
		File file = new File("res/data.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		
		ps.printf("%d, %d, %d\n", exam.kor, exam.eng, exam.math);
		
		ps.close();
		fos.close();
	}
	
	
}
