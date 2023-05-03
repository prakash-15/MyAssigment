package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_Baseclass;

public class Login extends Pom_Baseclass {
	
	public Login(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public Login EnterUserName(String Uname) {
		driver.findElement(By.id("username")).sendKeys(Uname);
		return this;
	}
	public Login EnterPassword(String Pwd) {
		driver.findElement(By.id("password")).sendKeys(Pwd);
		return this;
	}
	
	public Home ClickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Home(driver);
}
}