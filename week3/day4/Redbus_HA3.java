package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_HA3 {
	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			ChromeDriver driver=new ChromeDriver();
			// Launch the URL
			driver.get("https://www.redbus.in/");
			// maximize the window
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//from City
			driver.findElement(By.xpath("//input[contains(@data-message,'Please enter a source city')]")).sendKeys("Chennai");
			driver.findElement(By.xpath("//li[@class='selected']")).click();
			//to City
			driver.findElement(By.xpath("//input[contains(@data-message,'Please enter a destination city')]")).sendKeys("Bengaluru");
			driver.findElement(By.xpath("//li[@class='selected']")).click();
			//Date
			driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
			driver.findElement(By.xpath("(//td[@class='wd day'])[1]")).click();
			driver.findElement(By.id("search_btn")).click();
			Thread.sleep(2000);
			String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
			System.out.println(text);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='close-primo']")).click();
			Thread.sleep(3000);
			WebElement WebEl = driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]"));
			driver.executeScript("arguments[0].click()", WebEl);
			
			String text1 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
			System.out.println(text1);
			
			
			Thread.sleep(3000);
			String title = driver.getTitle();
			System.out.println(title);
			
			
			
	}

}
