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

public class SFMIssingElem extends SFBaseCalss{

@Test(priority=0,invocationCount=2,dependsOnMethods="week4.day4.CreateNewOps.createOpportunity")
public void runCreateOpportunity() {
	
	System.out.println(" Excute create opportunity");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));	    	 
	WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"))));

	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();


	driver.findElement(By.xpath("//button[text()='View All']")).click();
	
 	
	driver.findElement(By.xpath("//p[text()='Sales']")).click();//Click on sales 
		    		    	    	     	 
	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));	    	 
	WebElement until1 = wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Opportunities']"))));
	
	WebElement opp = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
	
	driver.executeScript("arguments[0].click()", opp);
	
	driver.findElement(By.xpath("//div[@title='New']")).click();
	
	DateFormat dateformat = new SimpleDateFormat("dd");
	Date date = new Date();
	
	String date1 = dateformat.format(date);
	
	int  currdate= Integer.parseInt(date1);
	int tmrwdt=currdate+1;
	
	
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();    	
	driver.findElement(By.xpath("//span[text()='"+tmrwdt+"']")).click();
	
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
		    	
	
	String stmsg = driver.findElement(By.xpath("(//div[text()='Complete this field.'])[2]")).getText();
	
	String oppsmsg = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
	
	if (stmsg.equals("Complete this field.") && oppsmsg.equals("Complete this field.")) {
		
		System.out.println("error message displayed for Opportunity");
		
	}
	
	else
	{
		System.out.println("error message not displayed for Opportunity");
	}


	
}

}