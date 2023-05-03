package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_SFAdminBaseclass;

public class SF_Ceftification extends Pom_SFAdminBaseclass {
	
	public SF_Ceftification(ChromeDriver driver) {
		this.driver=driver;
	}
	public SF_Adminpage Admincerti() {
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		return new SF_Adminpage(driver);
	}
}
