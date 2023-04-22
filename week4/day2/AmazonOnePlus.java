package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AmazonOnePlus {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the URL
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("(//div[text()='oneplus 9 pro']/parent::div)[1]")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The Price of Mobile is :"+text);
		
		String text1 = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("The Number of customer rating provided is : "+text1);
		
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> obj1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(obj1.get(1));
		Thread.sleep(3000);
		
		//snapshot
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File des= new File("./snaps/screenshot.png");
		FileUtils.copyFile(src1, des);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		WebElement findElement3 = driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']"));
		String text3 = findElement3.getText();
		System.out.println(text3);
		if(text.equals(text3))
		{
			System.out.println("The sub total is verified and matched");
		}
		else
		{
			System.out.println("The sub total is verified and un-matched");
		}
		
		driver.quit();
		
		

	}

}
