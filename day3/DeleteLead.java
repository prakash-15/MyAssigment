package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver=new ChromeDriver();
				// Launch the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				// maximize the window
				driver.manage().window().maximize();
				
				//Implicit Wait
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

				driver.findElement(By.id("username")).sendKeys("DemoCsr");

				/*driver.findElement(By.id("password")).sendKeys("Leaf@123");*/


				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9843447673");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//a[text()='11699']")).click();
				

				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				
				
				
				
				
	}

}
