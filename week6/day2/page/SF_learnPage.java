package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import baseclass.Pom_SFAdminBaseclass;
import io.github.sukgu.Shadow;

public class SF_learnPage extends Pom_SFAdminBaseclass {
	public SF_learnPage(ChromeDriver driver) {
		this.driver=driver;
	}
		public SF_Ceftification Learnpage() {
			Shadow indom = new Shadow(driver);
			indom.setImplicitWait(20);
	    	WebElement learning = indom.findElementByXPath("//span[text()='Learning']");
	    	learning.click();
	    	indom.setImplicitWait(20);
	    	WebElement trailHaed = indom.findElementByXPath("//span[text()='Learning on Trailhead']");
	    	Actions builder = new Actions(driver);
			builder.moveToElement(trailHaed).perform();
			indom.setImplicitWait(20);
			WebElement salesforcecerti = indom.findElementByXPath("//a[text()='Salesforce Certification']");
			driver.executeScript("arguments[0].click()", salesforcecerti);
			return new SF_Ceftification(driver);
		}
}
