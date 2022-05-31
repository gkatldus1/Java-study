package part3.ex5.abst.ui;

import java.util.Scanner;

import part3.ex5.abst.entity.Exam;
import part3.ex5.abst.entity.NewlecExam;

public class NewlecExamConsole extends ExamConsole {

	public NewlecExamConsole(Exam exam) {
		super(exam);
		// TODO Auto-generated constructor stub
	}
	public NewlecExamConsole() {
		
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("컴퓨터 : ");
		int com = scan.nextInt();
		scan.close();
		
		NewlecExam exam = (NewlecExam)getExam();
		exam.setCom(com);
		
		
		
	}
	@Override
	protected void onPrint() {
		// TODO Auto-generated method stub
		NewlecExam exam = (NewlecExam)getExam();
		System.out.println("computer : " + exam.getCom());
	}

	
	

} 
