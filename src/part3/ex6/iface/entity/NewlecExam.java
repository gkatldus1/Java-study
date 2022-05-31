package part3.ex6.iface.entity;

import java.util.Scanner;

import part3.ex6.iface.ui.ConsoleListener;

public class NewlecExam extends Exam {
	private int com;
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public NewlecExam() {
		this(0,0,0,0);
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
		// TODO Auto-generated constructor stub
	}
	
	public int total() {
//		return this.getKor() + this.getEng() + this.getMath() + com;
		return super.total() + com;
	}

	@Override
	public double avg() {
		// TODO Auto-generated method stub
		return total() / 4.0;
	}

	public void onPrint(Exam exam) {
		
	}
	
//	public class AA implements ConsoleListener {
//		@Override
//		public void onPrint(Exam exam) {
////			NewlecExam nexam = (NewlecExam)exam;
//			System.out.println("컴퓨터: " + NewlecExam.this.com);
//			
//		}
//
//		@Override
//		public void onInput(Exam exam) {
////			NewlecExam nexam = (NewlecExam) exam;
//			Scanner scan = new Scanner(System.in);
//			System.out.print("컴퓨터 >");
//			com = scan.nextInt();
////			nexam.setCom(com);
//		}
//	}
	
	
	
	
	
	
	
}
