package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_SFAdminBaseclass;

public class SF_NewwindowConfirm extends Pom_SFAdminBaseclass {
	
	public SF_NewwindowConfirm(ChromeDriver driver) {
		this.driver=driver;
	}
		
		public SF_learnPage confirmWindow() {
			driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			return new SF_learnPage(driver);
		}
	}


