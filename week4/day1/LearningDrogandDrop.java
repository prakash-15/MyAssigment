package week4.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class LearningDrogandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		// Launch the URL
		driver.get("https://jqueryui.com/draggable/");
		// maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		
		WebElement drgdrp = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drgdrp, 183, 0).perform();
		

		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement des = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		builder.dragAndDrop(src, des).perform();
		
	
		
		
		
		
		
		
		
	}

}
