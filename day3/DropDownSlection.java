package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSlection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				ChromeDriver driver=new ChromeDriver();
				// Launch the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				// maximize the window
				driver.manage().window().maximize();
				
				//Implicit Wait
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

				driver.findElement(By.id("username")).sendKeys("DemoCsr");

				/*driver.findElement(By.id("password")).sendKeys("Leaf@123");*/


				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
		        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("STG INFO TECH");
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PRAKASH");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SINGH");
				
				
				Select option= new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
				option.selectByIndex(4);
				
				
				Select option1= new Select(driver.findElement(By.name("marketingCampaignId")));
				option1.selectByVisibleText("Automobile");
				
				
				Select option2= new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
				option2.selectByValue("OWN_CCORP");
				
				driver.findElement(By.name("submitButton")).click();
	}
	

}
