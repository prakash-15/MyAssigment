package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();

driver.get("https://login.salesforce.com/");

driver.manage().window().maximize();

driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

/*driver.findElement(By.id("password")).sendKeys("Leaf@123");*/


WebElement Password = driver.findElement(By.id("password"));
Password.sendKeys("Leaf@123");

driver.findElement(By.id("Login")).click();



	}

}
