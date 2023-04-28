package marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Marbaseclass {

	public static RemoteWebDriver driver;
	public  String FileName;

	@BeforeMethod
	@Parameters({"Browser","URL","Username","Password"})
	public void Precheck(String Browser,String url1,String uname,String pwd){
		
		
if (Browser.equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions(); 
	        options.addArguments("--disable-notifications");
	        
	         driver = new ChromeDriver(options);
	         
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			EdgeOptions options = new EdgeOptions(); 
	        options.addArguments("--disable-notifications");
	        
	         driver = new EdgeDriver(options);
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the URL
		driver.get(url1);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
	}
	
	
	
	@DataProvider(name="Passdata")
	public String[][] excelinput() throws IOException
	{
		String[][] Passdata = exceldata.Passdata(FileName);
		return Passdata;
		
	}
	
	
	
	@AfterMethod
	public void Postcheck()
	{
	//driver.close();
	}
	}