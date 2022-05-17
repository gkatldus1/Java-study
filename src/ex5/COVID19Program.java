package ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class COVID19Program {

	public static void main(String[] args) throws IOException {
		
		//데이터 갯수 얻기 
		int count = 0;
		{
			//갯수를 얻기 위한 코드 
			File srcFile = new File("res/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			fscan.nextLine();
			while(fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
			}
		}
		
		System.out.println(count);
		
		
		//데이터 로드 
		String[] cities = new String[count];
		String[] dates = new String[count];
		int[] confirmeds = new int[count];
		
		{
			File srcFile = new File("res/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			
			fscan.nextLine();
			String line="";
			
			String[] temp;
			for(int i=0; i<count; i++) {
				line = fscan.nextLine();
				temp = line.split(",");
				cities[i] = temp[0];
				dates[i] = temp[1];
				confirmeds[i] = Integer.parseInt(temp[2]);
			}
			fscan.close();
			srcFis.close();
		}
		
//		System.out.println("시군명 확진시기 확진자수 ");
//		for(int i=0; i<count; i++) {
//			System.out.printf("%s %s %d", cities[i], dates[i], confirmeds[i]);
//			System.out.println();
//		}
		
		//춘천 지역만 출력 
		System.out.println("시군명 확진시기 확진자수 ");
		for(int i=0; i<count; i++) {
			if(cities[i].equals("춘천")) {
				System.out.printf("%s %s %d", cities[i], dates[i], confirmeds[i]);
				System.out.println();
			}
		}
		
		
	}

}
