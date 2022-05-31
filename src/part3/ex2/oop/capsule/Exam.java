package part3.ex2.oop.capsule;

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
	
	public Exam() {
		this(1,1,1);
	}
	
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}





	public void load() throws IOException {
		File file = new File("res/data.txt"); 
		FileInputStream fis = new FileInputStream(file);
		Scanner scan = new Scanner(fis);
		
//		exam.kor = scan.nextInt();
//		exam.eng = scan.nextInt();
//		exam.math = scan.nextInt();
		
		String[] tmps = scan.nextLine().split(",");
		
		this.kor = Integer.parseInt(tmps[0]);
		this.eng = Integer.parseInt(tmps[1]);
		this.math = Integer.parseInt(tmps[2]);
		
		scan.close();
		fis.close();
		
		
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│             성적입력              │");
		System.out.println("└─────────────────────────────────┘");
		System.out.printf("kor : ");
		
		this.kor = scan.nextInt();
		System.out.printf("eng : ");
		this.eng = scan.nextInt();
		System.out.printf("math");
		this.math = scan.nextInt();
		
		scan.close();
	}
	
	public void print() {
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│             성적출력              │");
		System.out.println("└─────────────────────────────────┘");
		int total = this.kor + this.eng + this.math;
		float avg = total/(float)3;
		System.out.println("kor :" + this.kor);
		System.out.println("eng : " + this.eng);
		System.out.println("math : " + this.math);
		System.out.println("total : " + total);
		System.out.println("avg : " + avg);
		
	}
	
	public void save() throws IOException {
		File file = new File("res/data.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		
		ps.printf("%d, %d, %d\n", this.kor, this.eng, this.math);
		
		ps.close();
		fos.close();
	}
	
	
}
