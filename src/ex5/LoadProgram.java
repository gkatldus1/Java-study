package ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LoadProgram {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//데이터 개수 알아보기, count 변수 사용
		int count = 0;
		
		{
			File data = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(data);
			Scanner fscan = new Scanner(srcFis);
			
			
			
			String temp;
			while(fscan.hasNext()) {
				count++;
				fscan.next();
			}
			fscan.close();
			srcFis.close();
		
		}
		
		//count의 값 크기이 배열 객체 생성하기, 참조명은 nums
		int[] nums = new int[count];
		
		
		// nums 배열에 res/data.txt의 데이터를 읽어서 로드한다.
		{
			File data = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(data);
			Scanner fscan = new Scanner(srcFis);
			
			
			
			String temp;
			for(int i=0; i<count; i++) {
				temp = fscan.next();
				nums[i] = Integer.parseInt(temp);
			}
		
			fscan.close();
			srcFis.close();
		}
		
		
		
		
		for(int i=0; i<count; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("---------------------------------------------");
		
		//배열에서 특정 데이터를 찾는 능력
		int index = 0;

		{
			//사용자에게서 검색하고 싶은 숫자를 입력 받는다.
			int num=0; 
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("검색할 숫자를 입력하세요: ");
				num = scan.nextInt();
				scan.close();
			}
			
			for(int i=0; i<count; i++) {
				if(nums[i] == num) {
					index = i;
					break;
				}
					
			}
		}
		
		System.out.printf("%d %d ",nums[index], index);
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		//배열에서 위치를 바꾸거나 값을 변경하기  
		
		//이전 상태의 출력
		for(int i=0; i<count; i++) {
			System.out.printf("%d ", nums[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		
		//nums 배열에서 첫번째 변수와 두 번째 변수의 값을 교환하시오   
//		int temp = 0;
//		temp = nums[0];
//		nums[0] = nums[1];
//		nums[1] = temp;
		int temp = 0;
		for(int j=0; j<count-1; j++)
			for(int i=0; i<count-1-j; i++) {
				
				if(nums[i] > nums[i+1]) {
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
				Thread.sleep(1000/4);
				
				for(int k=0; k<100; k++) {
					System.out.println();
				}
				
				for(int k=0; k<count; k++) {
					if((k == i)||(k == i + 1))
						System.out.printf("[%d] ", nums[k]);
					else
						System.out.printf("%d ", nums[k]);
				}
				
			}
		
		
		
		
		for(int j=0; j<100; j++) {
			System.out.println();
		}
		System.out.println("------------------<최종결과>---------------------");
		//이후 상태의 출력  
		for(int i=0; i<count; i++)
			System.out.printf("%d ", nums[i]);
		
		
		System.out.println("---------------------------------------");
		float center = 0;
		//정렬(중앙값, 평균)
		if(count%2==0) {
			int div = count/2;
			center = (nums[div-1] + nums[div])/2;
		}
		else {
			int inde = (count/2);
			center = nums[inde];
		}
		System.out.printf("중앙값: %f ",center);
		
		
		
		
	}

}
