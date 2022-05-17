package ex4;

public class ForTestProgram {

	public static void main(String[] args) {
		
		System.out.println("----<<for 연습5>>-----");
		
		for(int i=0; i<10; i++) {
			for(int j=i+1; j>0; j--)
				System.out.print("*");
			System.out.println();
		}
		
		for(int y=0; y<11; y++) {
			for(int x=0; x<11; x++)
				if(y==x || y==(-x+10))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
			
		}
		
//		for(int y=0; y<11; y++) {
//			for(int x=0; x<11; x++) {
//				if(x<=5) {
//					if((x==y) && (y==-x+10))
//						System.out.print("*");
//				}
//				if(x>5) {
//					if(y==x && y== -x+10) {
//						System.out.print("*");
//					}
//				}
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		for(int i=0; i<5; i++){
		    for(int j=0; j<2+i*2; j++)
		        System.out.printf("*");

		    System.out.print(" ");
		}

		
		
		
		
		
//		for(int i=0; i<10; i++) {
//			for(int j=i; j>0; j--) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			for(int k=10-i; k>0; k--) {
//				System.out.print(" ");
//				
//				
//			}
//			System.out.println("*");
//		}
		
		
		
		
		
		System.out.println();
		
		
		System.out.println("----<<for 연습4>>-----");
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) 
				System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("----<<for 연습3>>-----");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d ", 10 - i);
		}
		
		System.out.println();
		
		
		for(int i=0, n=1; i<10; i++) {
			if((i+1) == 1 + (n - 1)*3) {
				System.out.printf("[%d] ", i + 1);
				n++;
			}
			else
				System.out.printf("%d ", i + 1);
		}
		
		System.out.println();

		
		System.out.println("----<<for 연습2>>-----");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d ", i + 1);
		}
		
		System.out.println();
		
			

		
		System.out.println();
		System.out.println("------<for연습1>>------");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("*");
			
		}
	}

}
