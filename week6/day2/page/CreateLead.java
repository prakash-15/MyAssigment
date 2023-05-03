package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_Baseclass;

public class CreateLead extends Pom_Baseclass {
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLead EnteCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	
	public CreateLead EnteFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	public CreateLead EnteLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public CreateLead EntephoneNumber(String PhNo) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhNo);
		return this;
	}
	
	public Verify clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new Verify(driver);
	}
	
	
}
