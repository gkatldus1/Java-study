package zoom_study;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

   public static void main(String[] args) throws IOException {
      // 파일에서 읽어서 학기별 학생들 성적의 총점목록(int[] totals)과 평균목록(double[] avgs)을 구하시오.
      
      // 1.학생수, 학기수
      int termCount=0;
      int studentCount=0;
      {
         FileInputStream fis = new FileInputStream("res/data.txt");
            Scanner fscan = new Scanner(fis);

            String line = fscan.nextLine();
            String[] tokens = line.split(",");
            studentCount = Integer.parseInt(tokens[0]);
            termCount = Integer.parseInt(tokens[1]);

            fscan.close();
            fis.close();
      }
      
      // 2.파일을 로드하기->결과물      
      Exam[][] exams = new Exam[termCount][studentCount];
      
      {
      
         FileInputStream fis = new FileInputStream("res/data.txt");
            Scanner fscan = new Scanner(fis);

            fscan.nextLine(); // 학생수
            fscan.nextLine(); // 컬럼줄
            for(int j=0; j<termCount; j++)
            for(int i=0; i<studentCount; i++){                    
                    String line = fscan.nextLine();//데이터 로드                    
                    String[] tokens = line.split(",");
                    Exam exam = new Exam();
                    exam.id = Integer.parseInt(tokens[0]);
                    exam.name = tokens[1];
                    exam.kor = Integer.parseInt(tokens[2]);
                    exam.eng = Integer.parseInt(tokens[3]);
                    exam.math = Integer.parseInt(tokens[4]);
                    exams[j][i] = exam;
                }
            

            fscan.close();
            fis.close();
      }
      
      // 3.총점과 평균목록을 구하기
      int[][] totals = new int[termCount][studentCount];
        double[][] avgs = new double[termCount][studentCount];
        {
            // 반복문을 사용하지 않은 상태에서 이차 배열을 이용한 성적을 구하는 코드를 작성해보시오.

            for(int j=0; j<termCount; j++)
                for(int i=0; i<studentCount; i++){
                    totals[j][i] = kors[j][i] + engs[j][i] + maths[j][i];
                    avgs[j][i] = totals[j][i] / 3;
                }            
        }
   }

}