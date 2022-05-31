package part3.ex5.abst.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import part3.ex5.abst.entity.NewlecExam;
import part3.ex5.abst.ui.NewlecExamConsole;

public class Program {
	public static void main(String[] args) throws IOException {
		
		NewlecExam exam = new NewlecExam();
		NewlecExamConsole console = new NewlecExamConsole();
		console.setExam(exam);
		console.input();
		console.print();
//		console.on
		
	}
	
}
