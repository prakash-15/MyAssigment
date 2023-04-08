package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_HmeAssmnt1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		// Launch the URL
		driver.get("https://en-gb.facebook.com/");
		// maximize the window
		driver.manage().window().maximize();
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prakash");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Singh");
		WebElement Ele = driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@name='reg_email__']"));
		Ele.sendKeys("9620889880");
		
		WebElement Ele1 = driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@id='password_step_input']"));
		Ele1.sendKeys("qwerty@123");
		
		Select option= new Select(driver.findElement(By.id("day")));
		option.selectByIndex(4);
		
		Select option1= new Select(driver.findElement(By.name("birthday_month")));
		option1.selectByVisibleText("Jul");
		
		Select option2= new Select(driver.findElement(By.id("year")));
		option2.selectByValue("1989");
		
		WebElement radio = driver.findElement(By.xpath("//input[@name='sex']"));
		radio.click();
		
		
		// close the window
				driver.close();
	}

}
