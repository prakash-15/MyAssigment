package baseclass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Pom_SFAdminBaseclass {
	

	public ChromeDriver driver;


	
	@BeforeMethod
	public void Precheck()
	{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	driver  = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@AfterMethod
	public void Postcheck()
	{
	driver.close();
	}
	}


