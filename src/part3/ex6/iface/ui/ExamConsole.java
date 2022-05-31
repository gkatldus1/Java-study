package part3.ex6.iface.ui;

import java.util.Scanner;

import part3.ex6.iface.entity.Exam;



public class ExamConsole {

	
	private ConsoleListener listener;
	
	public void setListener(ConsoleListener listener) {
		this.listener = listener;
	}
	
	private Exam exam;
	
	public ExamConsole() {
//		this.exam = new Exam();
		//composition has a 관계 
	}
	
	public ExamConsole(Exam exam) {
		this.exam = exam;
		//association
		
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
		//association has a 관계 
	}
	
	public Exam getExam() {
		return exam;
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
		System.out.printf("math : ");
		int math = scan.nextInt();
		
		this.exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		if(listener != null)
			listener.onInput(exam);
		
//		scan.close();
	}
	
	
	//protected abstract void onPrint();
	
	
	public void print(BannerPrinter bannerPrinter) {

		if(bannerPrinter !=null)
			bannerPrinter.print();
		else {
			
			System.out.println("┌─────────────────────────────────┐");
			System.out.println("│             성적출력              │");
			System.out.println("└─────────────────────────────────┘");
		}
		System.out.println("kor :" + this.exam.getKor());
		System.out.println("eng : " + exam.getEng());
		System.out.println("math : " + exam.getMath());

		if(listener != null)
			listener.onPrint(exam);
		
		int total = this.exam.total();
		double avg = this.exam.avg();
		System.out.println("total : " + total);
		System.out.println("avg : " + avg);
		
	}
}
