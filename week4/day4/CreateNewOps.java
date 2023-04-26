package week4.day4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class CreateNewOps extends SFBaseCalss {

	
		@Test(priority=-1,enabled=true,invocationCount=3)
		public void createOpportunity() throws InterruptedException {
		System.out.println("Create Opportunity");
	
		    	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		    	Thread.sleep(2000);
		 
		    	driver.findElement(By.xpath("//button[text()='View All']")).click();
		    	
		    	driver.findElement(By.xpath("//p[text()='Sales']")).click();//Click on sales 
		    		    		    	    	 
		     	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));	    	 
		    	WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Opportunities']"))));
		    	
		    	WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		    	
		    	driver.executeScript("arguments[0].click()", opportunities);
		    	
		    	driver.findElement(By.xpath("//div[@title='New']")).click();
		    	
		    	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Prakash C");
		    	
		    	
		    	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		    	
		    	DateFormat dateformat = new SimpleDateFormat("dd");
				Date date = new Date();
				
				String date1 = dateformat.format(date);
				System.out.println(date1);
				
				int  currentdate= Integer.parseInt(date1);
				
		    	driver.findElement(By.xpath("//span[text()='"+currentdate+"']")).click();
		    		    	
				driver.findElement(By.xpath("(//button[contains(@id,'combobox')])[1]")).click();						
				
		    	WebElement stage = driver.findElement(By.xpath("//span[@title='Needs Analysis']"));
		    	stage.click();
				
				driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

}
