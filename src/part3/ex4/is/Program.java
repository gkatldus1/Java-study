package part3.ex4.is;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		
		NewlecExam exam = new NewlecExam(1,1,1,1);
		int total = exam.total();
		double avg = exam.avg();
		System.out.println(total);
		System.out.println(avg);
	}
	
}
