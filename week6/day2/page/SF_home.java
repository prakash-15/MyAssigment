package page;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_SFAdminBaseclass;

public class SF_home extends Pom_SFAdminBaseclass {
	
	public SF_home(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
public SF_NewwindowConfirm Myhomeclikmore() throws InterruptedException {
		
	driver.findElement(By.xpath("//span[text()='Learn More']/parent::button")).click();
	Thread.sleep(3000);
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> new1 = new ArrayList<String>(windowHandles);
	driver.switchTo().window(new1.get(1));
		
		return new SF_NewwindowConfirm(driver);
	}
}
