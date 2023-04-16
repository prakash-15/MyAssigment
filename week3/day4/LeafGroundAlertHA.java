package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundAlertHA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		// Launch the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		// maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("j_idt88:j_idt91")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String text1 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text1);
		
		
		driver.findElement(By.name("j_idt88:j_idt104")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("prakash");
		alert1.accept();
		
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text2);
		
		driver.findElement(By.name("j_idt88:j_idt93")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		String text3 = driver.findElement(By.id("result")).getText();
		System.out.println(text3);
		
		driver.findElement(By.name("j_idt88:j_idt95")).click();
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-secondary')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-danger')]")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'ui-button-secondary')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("j_idt88:j_idt100")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(@class,'ui-dialog-titlebar-close')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(@class,'i-button-outlined')])[2]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'maximize ')]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	
		
		
		
		
	}

}
