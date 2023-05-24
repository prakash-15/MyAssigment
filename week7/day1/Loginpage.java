package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Baseclass_Exrepo;
import baseclass.Pom_Baseclass;

public class Loginpage extends Baseclass_Exrepo {
	
	
	public Loginpage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public Loginpage enterUserName(String Uname) throws IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(Uname);
			reportstatus("Username Enter sucussfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportstatus("Username Enter sucussfully","fail");
		}
		return this;
	}
	public Loginpage enterPassword(String Pwd) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(Pwd);
			reportstatus("Password Enter sucussfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportstatus("Password Enter sucussfully","fail");
		}
		return this;
	}
	
	public Loginpage clickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
}
}