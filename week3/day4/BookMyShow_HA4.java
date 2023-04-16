package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BookMyShow_HA4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		ChromeDriver driver=new ChromeDriver();
		// Launch the URL
		driver.get("https://in.bookmyshow.com/");
		// maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Ele = driver.findElement(By.xpath("//span[text()='Hyderabad']"));
		Ele.click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		if (url.equals("https://in.bookmyshow.com/explore/home/hyderabad")) 
		{
			System.out.println("It is Correct URL");
		}
		else {
			System.out.println("It is Not Correct URL");
		}
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='sc-jTzLTM sc-chbbiW hPUYXB']")).sendKeys("DASARA");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='sc-jhaWeW ChCae']")).click();
		
		
		
	}

}
