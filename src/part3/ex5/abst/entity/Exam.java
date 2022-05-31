package part3.ex5.abst.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public abstract class Exam {
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


	
	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int total() {
		return kor + eng + math;
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
	

	
	public void save() throws IOException {
		File file = new File("res/data.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		
		ps.printf("%d, %d, %d\n", this.kor, this.eng, this.math);
		
		ps.close();
		fos.close();
	}


	public abstract double avg();
	
	
}
