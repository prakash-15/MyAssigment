package week5.day1;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_CreateNewOpportunity extends SF_CreateNewOpp_Basesclass {
	
	@DataProvider (name="SFopp")
	public String[][] SFopp(){
		String[][] SFopp = new String[3][1];
		SFopp[0][0] = "Salesforce Automation by Prakash C";
		
		SFopp[1][0] = "Salesforce Automation by Nigath";
		
		SFopp[2][0] = "Salesforce Automation by Dev Singh";
			
		return SFopp;
}

	@Test(dataProvider="SFopp")
		public  void testNG_SalesForce1(String SFopp ) throws InterruptedException, IOException {
		

			
			WebElement opp = driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']//input)[3]"));
			opp.sendKeys(SFopp);
			opp.getText();			
			driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='29']")).click();
			driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
			driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
//			String OppFnl = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
//				if(OppFnl.equals("Salesforce Automation by Prakash C")) {
//					System.out.println("Opportunity Name has been verified");
//				}else {
//					System.out.println("Opportunity Name is Wrong");
//				}
//			Thread.sleep(3000);
//			driver.close();
			
			
			
			
			
			
			
			
			
	}


}
