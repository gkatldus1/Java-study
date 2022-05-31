package part3.ex6.iface;

import java.io.IOException;
import java.util.Scanner;

import part3.ex6.iface.entity.Exam;
import part3.ex6.iface.entity.NewlecExam;
import part3.ex6.iface.ui.BannerPrinter;
import part3.ex6.iface.ui.ConsoleListener;
import part3.ex6.iface.ui.ExamConsole;


public class Program {
	public static void main(String[] args) throws IOException {
		
		NewlecExam exam = new NewlecExam();
		ExamConsole console = new ExamConsole();
		console.setExam(exam);
		
//		class AA implements ConsoleListener {
//			@Override
//			public void onPrint(Exam exam1) {
////				NewlecExam nexam = (NewlecExam)exam;
//				System.out.println("컴퓨터: " + exam.getCom());
//				
//			}
//
//			@Override
//			public void onInput(Exam exam1) {
////				NewlecExam nexam = (NewlecExam) exam;
//				Scanner scan = new Scanner(System.in);
//				System.out.print("컴퓨터 >");
//				int com = scan.nextInt();
//				exam.setCom(com);
//			}
//		}
		
//		NewlecExam.AA aa = exam.new AA();


		
		console.setListener(new ConsoleListener() {
			@Override
			public void onPrint(Exam exam1) {
//				NewlecExam nexam = (NewlecExam)exam;
				System.out.println("컴퓨터: " + exam.getCom());
				
			}

			@Override
			public void onInput(Exam exam1) {
//				NewlecExam nexam = (NewlecExam) exam;
				Scanner scan = new Scanner(System.in);
				System.out.print("컴퓨터 >");
				int com = scan.nextInt();
				exam.setCom(com);
			}
		});
		console.input();
		console.print(new BannerPrinter() {

			@Override
			public void print() {
				System.out.println("─────────────────────────────────");
				System.out.println("   Newlec Academy 성적 출력        ");
				System.out.println("─────────────────────────────────");
				
			}
			
		});
		
	}
	
}
