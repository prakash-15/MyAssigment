package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_Baseclass;

public class Mylead extends Pom_Baseclass {
	
	public Mylead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLead clickCreateLeafButton() {
		
		driver.findElement(By.linkText("Create Lead")).click();
			
			return new CreateLead(driver);
			
		
	}

}
