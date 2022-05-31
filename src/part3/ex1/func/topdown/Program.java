package part3.ex1.func.topdown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import part3.ex5.abst.ui.Exam;

public class Program {
	public static void main(String[] args) throws IOException {
		
		Exam exam = new Exam();
		
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
					Exam.input(exam);
					
					break;
				case 2:
					Exam.print(exam);
					break;
				case 3:
					Exam.load(exam);
					break;
				case 4:
					Exam.save(exam);
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
