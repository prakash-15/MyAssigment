package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Nigath");
		driver.findElement(By.id("lastNameField")).sendKeys("Dev Singh");
		
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Laddu");
		driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("Sir");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("nigathsingh@gmail.com");
		Select state=new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).sendKeys("This The sample description");
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("This program is importent");
		
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title = driver.getTitle();
	System.out.println(title);
		
	driver.close();	
		
	}

}
