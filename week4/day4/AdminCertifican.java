package week4.day4;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdminCertifican {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the URL
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Learn More']/parent::button")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> new1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(new1.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
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
		
		
	}

}
