package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SFBaseCalss {




		public ChromeDriver driver;		
		public ChromeOptions options;

		@BeforeMethod
		public void preConditions()
		{			

			
			options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
		
	    	driver = new ChromeDriver(options);			    	
	    	driver.get("https://login.salesforce.com");
	    	    		
				driver.manage().window().maximize();	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//add  implicitlyWait								
				
	   
	    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	    	
	    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
	    	
	
	    	driver.findElement(By.xpath("//input[@id='Login']")).click();
		}
		
		@AfterMethod
		public void postConditions()
		{
		
			driver.close();
	}

}

