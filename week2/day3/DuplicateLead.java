package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
					driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[3]")).click();
					
					driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']")).sendKeys("singh.prakash154@gmail.com");
					driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
					Thread.sleep(3000);
					WebElement fname = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-firstName')]/a"));
					String name=fname.getText();
					System.out.println(name);
					fname.click();
					driver.findElement(By.linkText("Duplicate Lead")).click();
					
					String Title = driver.getTitle();
					System.out.println(Title);
					
					if(Title.contains("Duplicate Lead"))
					{
						System.out.println("The title is verified and it is correct.");
					}else
					{
						System.out.println("The title is verified and it is not correct");
					}
					
					driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
				
					
					driver.close();	
	}

}
