package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.sukgu.Shadow;

public class ArchitectCertification {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ntf = new ChromeOptions();
		ntf.addArguments("--disable-notifications");
		ChromeDriver driver  = new ChromeDriver(ntf);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		WebElement lm = driver.findElement(By.xpath("//span[text()='Learn More']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(lm));
		until.click();
		Set<String> LearnMore = driver.getWindowHandles();
		List<String> LearnMoreList = new ArrayList<String>(LearnMore);
		driver.switchTo().window(LearnMoreList.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow sh = new Shadow(driver);
		sh.findElementByXPath("//span[text()='Learning']").click();
		Thread.sleep(2000);
		WebElement mouseHover = sh.findElementByXPath("//span[text()='Learning on Trailhead']");
		Thread.sleep(3000);
		Actions LearningTrail = new Actions(driver);
		LearningTrail.moveToElement(mouseHover).perform();
		Thread.sleep(2000);
		WebElement salesforcecerti = sh.findElementByXPath("//a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click()", salesforcecerti);
		driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();
		String text = driver.findElement(By.xpath("//div[@class='credentialBanner-card_description']")).getText();
		System.out.println(text);
		System.out.println("****************************");
		List<WebElement> listcer1 = driver.findElements(By.xpath("//div[contains(@class,'credentials-card_title')]"));
		List<String>lc = new ArrayList<String>();
			int size1 = lc.size();
			for (int i = 0; i < size1; i++) {
				String cl = listcer1.get(i).getText();	
				lc.add(cl);
			}
			System.out.println("The  list of Certificates: "+"\n"+lc);
			driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		List<WebElement> lc2 = driver.findElements(By.xpath("//div[contains(@class,'credentials-card_title')]"));
		List<String>listcer2 = new ArrayList<String>();
			int size2 = lc2.size();
			for (int i = 0; i < size2; i++) {
				String certList = lc2.get(i).getText();	
				listcer2.add(certList);
			}
			System.out.println("The  list of Certificates: "+"\n"+listcer2);
		
				}

	}


