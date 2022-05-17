package ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		File image = new File("res/Green and White Leaves Travel Collection YouTube Channel Art.png");
		FileInputStream fis = new FileInputStream(image);
		FileOutputStream fos = new FileOutputStream("res/1-copy.png");
		int data;
		
		while(fis.read()!=-1) {
			data = fis.read();
			fos.write(data);
		}
		
		
		fis.close();
		fos.close();

	}

}
