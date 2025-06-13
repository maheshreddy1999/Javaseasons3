package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	
	public static void main(String[] args) throws IOException {
		
		File f1=new File(System.getProperty("user.dir")+"\\Mar19th.txt");
		
		System.out.println(f1.createNewFile());
	
		System.out.println("end ");
	}

}
