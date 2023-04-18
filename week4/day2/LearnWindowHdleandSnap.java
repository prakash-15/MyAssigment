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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHdleandSnap {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the URL
		driver.get("https://www.irctc.co.in/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> WH=new ArrayList<String>(windowHandles);
		
		WebDriver window = driver.switchTo().window(WH.get(1));
		System.out.println(window);
		String title = driver.getTitle();
		System.out.println(title);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dst=new File("./snap/srnst1.png");
		
		FileUtils.copyFile(src, dst);
		
		driver.close();
		
		driver.switchTo().window(WH.get(0));
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.quit();
		

	}

}
