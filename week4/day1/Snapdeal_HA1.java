package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal_HA1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the URL
		driver.get("https://www.snapdeal.com/");
		WebElement Elm = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(Elm).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String text1 = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		String Low = driver.findElement(By.xpath("//span[@class='from-price-text']")).getText();
		String r1 = Low.replaceAll("Rs. ","");
		int LowPrice=Integer.parseInt(r1);
		
		String high = driver.findElement(By.xpath("//span[@class='to-price-text']")).getText();
		String r2 = high.replaceAll("Rs. ","");
		int HighPrice=Integer.parseInt(r2);
		
		if (LowPrice < HighPrice) {
			
			System.out.println("The Price is Low to High");
		}
		else
		{
			System.out.println("The Price not in Low to High");
		}
		
		
		
		WebElement Ele = driver.findElement(By.name("fromVal"));
		Ele.clear();
		Ele.sendKeys("500");
		Thread.sleep(3000);
		WebElement Ele1 = driver.findElement(By.name("toVal"));
		Ele1.clear();
		Ele1.sendKeys("1200");
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		Thread.sleep(5000);
		WebElement web = driver.findElement(By.xpath("(//li[@class='search-li'])[1]"));
		driver.executeScript("arguments[0].click()", web);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='filter-color-tile MultiColor ']")).click();
		Thread.sleep(3000);
		String filters = driver.findElement(By.xpath("(//div[@class='filters'])[1]")).getText();
		if(filters.contains("Price: ") && filters.contains(" Multi Color")) {
			
			System.out.println(" All Filler Applied");
		}
		
		else {
			System.out.println(" All Filler Not Applied");
		}
		
		
		WebElement Elm1 = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(Elm1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		Thread.sleep(3000);
		String text3 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The Product Price is RS: "+text2);
		System.out.println("The Product Discount is : "+text3);

		File src =driver.getScreenshotAs(OutputType.FILE);
		
		File dst=new File("./snaps/shoe.png");
		
		FileUtils.copyFile(src, dst);
		
	}
	
}
