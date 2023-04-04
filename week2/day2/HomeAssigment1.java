package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssigment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initiate the ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		// Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// maximize the window
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoCsr");

		/*driver.findElement(By.id("password")).sendKeys("Leaf@123");*/


		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TATA GROUP");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PRAKASH");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("singh.prakash154@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9843447673");
		
		driver.findElement(By.name("submitButton")).click();
		
		
		// close the window
				driver.close();
	

		
		
	}

}
