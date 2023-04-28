package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SF_CreateNewOpp_Basesclass {
	public RemoteWebDriver driver;
	public ChromeOptions chrm;
	public EdgeOptions edg;
	
	@Parameters({"Browser","URL","Username","Password"})
	
	@BeforeMethod

	public void BeforeMethod(String Browser,String url,String uname,String pwd) throws InterruptedException{
		chrm =new ChromeOptions();
		edg = new EdgeOptions();
		chrm.addArguments("--disable-notifications");		
		if(Browser.equalsIgnoreCase("Chrome"))
		{		
			driver  = new ChromeDriver(chrm);
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver  = new EdgeDriver(edg);
		}


	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	Thread.sleep(3000);
	WebElement Opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
	driver.executeScript("arguments[0].click()", Opportunities);
	driver.findElement(By.xpath("//div[text()='New']")).click();
}

////@AfterMethod
////public void afterMethod() throws InterruptedException {
////Thread.sleep(2000);
////driver.close();
//	
//	}
}
