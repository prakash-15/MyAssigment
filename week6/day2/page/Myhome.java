package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_Baseclass;

public class Myhome extends Pom_Baseclass {

	public Myhome(ChromeDriver driver) {
		this.driver=driver;
	}
	
public Mylead clickLeadButton() {
		
	driver.findElement(By.linkText("Leads")).click();
		
		return new Mylead(driver);
		
	
}
}