package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameandAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		// Launch the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		// maximize the window
		driver.manage().window().maximize();
		
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	Alert text = driver.switchTo().alert();
	text.sendKeys("Prakash C");
	text.accept();
String text2 = driver.findElement(By.id("demo")).getText();
System.out.println(text2);
	
	
		
		

	}

}
