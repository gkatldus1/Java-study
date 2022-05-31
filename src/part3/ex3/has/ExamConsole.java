package part3.ex3.has;

import java.util.Scanner;

public class ExamConsole {

	private Exam exam;
	
	public ExamConsole() {
//		this.exam = new Exam();
		//composition has a 관계 
		
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
		//association has a 관계 
	}
	
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│             성적입력              │");
		System.out.println("└─────────────────────────────────┘");
		System.out.printf("kor : ");
		
		int kor = scan.nextInt();
		System.out.printf("eng : ");
		int eng = scan.nextInt();
		System.out.printf("math");
		int math = scan.nextInt();
		
		this.exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		scan.close();
	}
	
	public void print() {
		int total = this.exam.total();
		double avg = this.exam.avg();
		
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│             성적출력              │");
		System.out.println("└─────────────────────────────────┘");
		System.out.println("kor :" + this.exam.getKor());
		System.out.println("eng : " + exam.getEng());
		System.out.println("math : " + exam.getMath());
		System.out.println("total : " + total);
		System.out.println("avg : " + avg);
		
	}
}
