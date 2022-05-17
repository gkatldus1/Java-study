package ex4;

public class Homework {

	public static void main(String[] args) {
		
		for(int y=0; y<11; y++) {			
			for(int x=0; x<11; x++) {
				if((y>=x && y<=-x+10) || (y>=-x+10 &&y<=x)) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
