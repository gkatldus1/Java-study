package part2.ex3.func.topdown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam {
	int kor;
	int eng;
	int math;
	
	public static Exam readExam() throws FileNotFoundException {
		File file = new File("res/data.txt"); 
		FileInputStream fis = new FileInputStream(file);
		Scanner scan = new Scanner(fis);
		
		Exam exam = new Exam();
		exam.kor = scan.nextInt();
		exam.eng = scan.nextInt();
		exam.math = scan.nextInt();
		
		return exam;
		
	}
	
	public static Exam inputExam() {
		Scanner scan = new Scanner(System.in);
		Exam exam = new Exam();
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│             성적입력              │");
		System.out.println("└─────────────────────────────────┘");
		System.out.printf("kor : ");
		exam.kor = scan.nextInt();
		System.out.printf("eng : ");
		exam.eng = scan.nextInt();
		System.out.printf("math");
		exam.math = scan.nextInt();
		return exam;
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
		fos.write(exam.kor);
		fos.write(exam.eng);
		fos.write(exam.math);
	}
	
	
}
