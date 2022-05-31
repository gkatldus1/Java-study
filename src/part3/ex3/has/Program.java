package part3.ex3.has;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		
		Exam exam = new Exam(1,2,3);
		ExamConsole console = new ExamConsole(); 
		console.setExam(exam);
		 while(true) {
			int menu = inputMenu();
			/*
			 * 1. 성적 입력 
			 * 2. 성적 출력 
			 * 3. 성적 읽어오기 
			 * 4. 성적 저장 
			 * 5. 종료 
			 * */
			
			switch(menu) {
				case 1:
					console.input();
					
					break;
				case 2:
					console.print();
					break;
				case 3:
					exam.load();
					break;
				case 4:
					exam.save();
					break;
				case 5:
					exitProgram();
					break;
					
			}
		}
		
		
	}
	
	
	
	public static int inputMenu() {
		int menu;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("┌─────────────────────────────────┐");
			System.out.println("│             Main Menu           │");
			System.out.println("└─────────────────────────────────┘");
			System.out.println("1. inputScore");
			System.out.println("2. printScore");
			System.out.println("3. readScore");
			System.out.println("4. saveScore");
			System.out.println("5. exit");
			System.out.print(">");
			
			menu = scan.nextInt();
					
			
		} while(menu > 5);
		
		scan.close();
		return menu;
	}
	
	
	public static void exitProgram() {
		System.out.println("Bye~~");
		System.exit(0);
	}
	
	
}
