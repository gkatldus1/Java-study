package ex1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program {

	public static void main(String[] args) throws IOException {
		//변수선언 
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 40;
		kor2 = 40;
		kor3 = 50;
		
		total = kor1 + kor2 + kor3;
		avg = total / 3;
		
		File file = new File("/Users/hamsiyeon/Desktop/newLectureCourse/Workspace/JavaProject/data.txt");

		FileOutputStream fos = new FileOutputStream(file);//파일 출력 버퍼
		
		
		PrintStream fout = new PrintStream(fos);//응용버퍼
		
		System.out.print("성적 출력가나다\n");
		System.out.print("kor1: ");
		System.out.println(kor1);
		System.out.printf("kor1: %d\n", kor1);
		System.out.printf("kor2: %d\n", kor2);
		System.out.printf("kor3: %d\n", kor3);
		System.out.print(21);
		System.out.printf("avg: %f\n", avg);
		String defaultEncoding = System.getProperty("file.encoding");
		System.out.println(defaultEncoding);
		
		fout.close();
		fos.close();
		
		System.out.println("작업종료");
	}

}
