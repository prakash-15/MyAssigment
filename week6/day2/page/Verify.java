package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_Baseclass;

public class Verify extends Pom_Baseclass {
	
	public Verify(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public Verify Verfiylead() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		
		return this;

}
}
