package marathon;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_case_002 extends Marbaseclass {

	@BeforeTest
	public void setData() {
		
		FileName="OppName";
	}
	
	
	@Test(dataProvider="Passdata")
		public 	void passinput(String name,String amont) throws InterruptedException {
			
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
			Thread.sleep(3000);
			WebElement el = driver.findElement(By.xpath("//span[text()='View All Key Deals']/parent::a"));
			driver.executeScript("arguments[0].click()", el);
			driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
			WebElement oppName = driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']//input)[3]"));
			oppName.sendKeys(name);
			
			driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox__form-element ')])[3]")).click();
			driver.findElement(By.xpath("//span[text()='New Customer']")).click();
			Thread.sleep(3000);
			WebElement ele2 = driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox__form-element ')])[4]"));
			driver.executeScript("arguments[0].click()", ele2);
		    driver.findElement(By.xpath("(//span[text()='Partner Referral'])[1]")).click();
			
		    WebElement elm1 = driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));
			elm1.sendKeys(amont);
			
			driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
			
			driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("04/29/2023");
			
			driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input-value')])[1]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
			Thread.sleep(2000);
			WebElement ele3 = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]"));
			driver.executeScript("arguments[0].click()", ele3);
			
			driver.findElement(By.xpath("//span[text()='REST API']")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			
			//driver.findElement(By.xpath("//*[name()='svg' and @data-key='error']")).click();
			
			WebElement opp = driver.findElement(By.xpath("//div[@class='toastContent slds-notify__content']"));
			
			String text = opp.getText();
			System.out.println(text);
			
			if (opp.isDisplayed()) {
				
				System.out.println("Opportunity Created successfully");
			}
			else
			{
				System.out.println("opportunity is not created");
				}
			
			
	}
}
