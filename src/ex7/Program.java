package ex7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		
		{
			int[] lottos = new int[3*6];
			{
				File srcFile = new File("res/ex7/lotto.data");
				FileInputStream srcFis = new FileInputStream(srcFile);
				Scanner fscan = new Scanner(srcFis, "UTF-8");
				
				
				for(int i=0; i< 18 && fscan.hasNext(); i++) {
					String temp = fscan.next();
					int num = Integer.parseInt(temp);
					lottos[i] = num;
				}
				
				fscan.close();
				srcFis.close();
				
				
			}
		}
		
		{
		
			int[][]lottos = new int[3][6];
			
			{
				File srcFile = new File("res/ex7/lotto.data");
				FileInputStream srcFis = new FileInputStream(srcFile);
				Scanner fscan = new Scanner(srcFis, "UTF-8");
				String temp;
				int num;
				
				for(int i=0; i<3; i++) 
					for(int j=0; j<6 && fscan.hasNext(); j++) {
						temp = fscan.next();
						num = Integer.parseInt(temp);
						lottos[i][j] = num;
					}
				
				fscan.close();
				srcFis.close();
				
				
				
			}
			
			int[] lotto = {3,4,5,6,7,8};
			lottos[2] = lotto;
			
			for(int i=0; i<3; i++) {
				System.out.printf("%d번: ", i+1);
				for(int j=0; j<6; j++) {
					System.out.printf("%d ", lottos[i][j]);
				}
				System.out.println();
			}
			//-------------------------------------------------------
			
			int[] temp;
			temp = lottos[0];
			lottos[0] = lottos[2];
			lottos[2] = temp;
			
			
			
			
			
			
			//-------------------------------------------------------
			
			System.out.println("바뀐 후의 배열---------------------------");
			for(int i=0; i<3; i++) {
				System.out.printf("%d번: ", i+1);
				for(int j=0; j<6; j++) {
					System.out.printf("%d ", lottos[i][j]);
				}
				System.out.println();
			}
			
			
			
			
		}
		

	}

}
