package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa_HA2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the URL
		driver.get("https://www.nykaa.com/");
		WebElement Elm = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(Elm).perform();
		
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris")) {
			
			System.out.println("It contails L'Oreal Paris");
		}
			
		else
		{
			System.out.println("It not contails L'Oreal Paris");
			
		}
		
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=' css-1nozswx'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='css-1do4irw'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Concern']/parent::div")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']/ancestor::label")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div[@class='css-19j3ean']")).getText();
		if(text.contains("Shampoo"))
		{
			System.out.println("Filter is applied with Shampoo"); 
		}
		else {
			System.out.println("Filter is not applied with Shampoo"); 
		}
		
		driver.findElement(By.xpath("//img[@class='css-11gn9r6']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> new1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(new1.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='180ml'])/parent::button")).click();
		Thread.sleep(3000);
		String text1 = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		System.out.println("Shampoo Price is: "+text1); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=' css-13zjqg6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		String text2 = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		System.out.println("The Grand Total is: "+text2);
		driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]")).click();
		driver.findElement(By.xpath("(//img[@class='css-16z7tzi ek8d9s80'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='css-1b232xc ehes2bo3']//img)[2]")).click();
		String youPay = driver.findElement(By.xpath("(//div[@class='css-vlqrtx e1d9ugpt3']/p)[3]")).getText();
		System.out.println(youPay);
			if(youPay.equals(text2)) {
				System.out.println("The grand total is the same");
			}else {
				System.out.println("Grand total value has changed");
			}
			driver.quit();
		
	}

}
