package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_Baseclass;

public class Home extends Pom_Baseclass {
	
	public Home(ChromeDriver driver) {
		this.driver=driver;
	}

	public Myhome clickCRMLink() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new Myhome(driver);
	}
	
	
	
}
