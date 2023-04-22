package week4.day3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNG_CreateNewOpportunity {

	@Test
		public  void CreateNewOpportunity () throws InterruptedException, IOException {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			ChromeDriver driver=new ChromeDriver(opt);
			// maximize the window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			// Launch the URL
			driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			driver.findElement(By.id("password")).sendKeys("Leaf@123");
			driver.findElement(By.id("Login")).click();
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
			Thread.sleep(3000);
			WebElement Elm = driver.findElement(By.xpath("//span[text()='Opportunities']/parent::a"));
			driver.executeScript("arguments[0].click()", Elm);
			driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
			WebElement opp = driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']//input)[3]"));
			opp.sendKeys("Salesforce Automation by Prakash C");
			opp.getText();
			
			driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='19']")).click();
			driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
			driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
			String OppFnl = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
				if(OppFnl.equals("Salesforce Automation by Prakash C")) {
					System.out.println("Opportunity Name has been verified");
				}else {
					System.out.println("Opportunity Name is Wrong");
				}
			Thread.sleep(3000);
			driver.close();
			
			
			
			
			
			
			
			
			
	}

}
