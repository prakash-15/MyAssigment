package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Pom_SFAdminBaseclass;

public class SF_Adminpage extends Pom_SFAdminBaseclass {
	public SF_Adminpage(ChromeDriver driver) {
		this.driver=driver;
}
	
	public SF_Adminpage AdmincertList() {
		
String text = driver.findElement(By.xpath("(//div[text()='Administrator'])[2]")).getText();
		
		if (text.equals("Administrator")) {
			System.out.println("We are in "+text+ "Page");
		}
		else
		{
			System.out.println("We are not in administrator page");
		}
    	
		List<WebElement> certList = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		
		int size = certList.size();
		
		for (WebElement ele : certList) {
			String certName = ele.getText();
			System.out.println(certName);
		}
		
		
		return this;
	}
	
}