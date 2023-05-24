package marathon2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceBaseclass {
	
	public RemoteWebDriver driver;
	public  String FileName;
	
	@BeforeMethod
	public void Precondi() throws InterruptedException{
		
	WebDriverManager.chromedriver().setup();

	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");

    driver = new ChromeDriver(option);

	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();

	WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
	driver.executeScript("arguments[0].scrollIntoView();", scroll);
	Thread.sleep(3000);
	WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
	driver.executeScript("arguments[0].click();", individual);
	
	}
	@DataProvider(name="Createindivi")
	public String[][] excelinput() throws IOException
	{
		String[][] Passdata = Excelindivi.Passdata(FileName);
		return Passdata;
		
	}
	
	@AfterMethod
	public void Postcheck()
	{
	//driver.close();
	}
}

