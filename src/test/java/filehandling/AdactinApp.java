package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdactinApp {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		FileInputStream fis1=new FileInputStream("config.properties");

		Properties pr=new Properties();
		
		pr.load(fis1);
		
		String browserName=pr.getProperty("browser");
		
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();	
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(pr.getProperty("implicit"))));
		
		Thread.sleep(5000);

	}

}
