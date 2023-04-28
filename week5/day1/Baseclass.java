package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {
	
public RemoteWebDriver driver;


	
@BeforeMethod
@Parameters({"Browser","URL","Username","Password"})
public void Precheck(String Browser,String url1,String uname,String pwd){
	if(Browser.equalsIgnoreCase("chrome"))
	{		
		driver  = new ChromeDriver();
	}
	else if(Browser.equalsIgnoreCase("edge"))
	{
		driver  = new EdgeDriver();
	}


driver.manage().window().maximize();
driver.get(url1);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.id("username")).sendKeys(uname);
driver.findElement(By.id("password")).sendKeys(pwd);
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
}
@AfterMethod
public void Postcheck()
{
driver.close();
}
}
