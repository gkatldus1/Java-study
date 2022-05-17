package ex6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		GangwonCovid19Status status;
		status = new GangwonCovid19Status();
		status.city = "춘천";
		status.date = "2022-08-12";
		status.confirmed = 2;
		
		System.out.println(status.city);
		
		int count = 0;
		{
			File srcFile = new File("res/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			fscan.nextLine();
			while(fscan.hasNextLine()) {
				fscan.nextLine();
				count++;
			}
			fscan.close();
			srcFis.close();
		}
		
		GangwonCovid19Status[] statusList = new GangwonCovid19Status[count];
		
		{
			File srcFile = new File("res/covid19.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner fscan = new Scanner(srcFis, "UTF-8");
			
			
			fscan.nextLine();
			String[] temp;
			String line;
			for(int i=0; i<count; i++) {
				line = fscan.nextLine();
				temp = line.split(",");
				statusList[i] = new GangwonCovid19Status();
				statusList[i].city = temp[0];
				statusList[i].date = temp[1];
				statusList[i].confirmed = Integer.parseInt(temp[2]);
			}
			fscan.close();
			srcFis.close();
		}
		
		System.out.println("시군명 확진시기 확진자수 ");
		for(int i=0; i<count; i++) {
			if(statusList[i].city.equals("춘천")) {
				System.out.printf("%s %s %d", statusList[i].city, statusList[i].date, statusList[i].confirmed);
				System.out.println();
			}
		}
		
		
		
		
		
	}

}
