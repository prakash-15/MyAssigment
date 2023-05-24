package marathon2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateIndividuals extends SalesforceBaseclass {
/*
 * "Test Steps:
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Individuals from App Launcher
4. Click on the Dropdown icon in the Individuals tab
5. Click on New Individual
6. Enter the Last Name as 'Kumar'
7.Click save and verify Individuals Name"

 */
	@BeforeTest
	public void setData() {
		FileName="Createindivi";
}

	
	@Test(dataProvider="Createindivi")
	public  void createIndivi(String lname) throws InterruptedException {
		
	driver.findElement(By.xpath("//div[text()='New']")).click();
//	driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
//	WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
//	driver.executeScript("arguments[0].click();", clk);
	driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(lname);
	driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	//verify Individuals Name
	System.out.println(message);
	if (message.contains(lname)) {
		System.out.println(" Individuals Singh is created successfully");
	}
	else {
		System.out.println("Individuals Singh is not created ");
	}
}
}