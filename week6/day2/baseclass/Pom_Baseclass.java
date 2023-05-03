package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.Excelintegration;





public class Pom_Baseclass {

	public  ChromeDriver driver;
	public  String fileName;

	
	@BeforeMethod
	public void Precheck()
	{
	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@DataProvider(name="fetchdata")
	public String[][] senddata() throws IOException
	{
		String[][] Passdata = Excelintegration.readData(fileName);
		return Passdata;
		
	}
	
	
	
	
	@AfterMethod
	public void Postcheck()
	{
//	driver.close();
	}
	}