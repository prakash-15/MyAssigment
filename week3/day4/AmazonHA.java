package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		// Launch the URL
		driver.get("https://www.amazon.in/");
		// maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),' for boys')]/parent::div")).click();
		
		String text2 =driver.findElement(By.xpath("//span[contains(text(),' for boys')]/parent::div")).getText();
		
		System.out.println(text2);
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@id='brandsRefinements']//li/span/a/div)[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@id='brandsRefinements']//li/span/a/div)[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        Thread.sleep(2000);
        String text3 = driver.findElement(By.xpath("(//h2[contains(@class,'a-spacing-none')]/a/span)[1]")).getText();
    	System.out.println(text3);
        Thread.sleep(5000);
    	  String text4 = driver.findElement(By.xpath("(//Span[@class='a-price-whole'])[1]")).getText();
      	System.out.println(text4);
      	String title = driver.getTitle();
      	System.out.println(title);
      	Thread.sleep(1000);
		driver.close();
		
	}

}
