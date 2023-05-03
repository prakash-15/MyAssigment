package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_SFAdminBaseclass;

public class SF_Login extends Pom_SFAdminBaseclass{

	public SF_Login(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public SF_Login EnterUserName() {
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		return this;
	}
	public SF_Login EnterPassword() {
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		return this;
	}
	
	public SF_home ClickLoginbutton() {
		driver.findElement(By.id("Login")).click();
		return new SF_home(driver);
}
	
	
}
