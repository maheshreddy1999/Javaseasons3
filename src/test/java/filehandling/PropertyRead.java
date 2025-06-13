package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("config.properties");

		Properties pr=new Properties();
		
		pr.load(fis1);
		
		System.out.println(pr.getProperty("browser"));
	}

}
