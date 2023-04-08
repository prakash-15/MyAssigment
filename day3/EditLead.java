package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
		
		//Open the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Credentials
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Prakash");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Singh");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-firstName')]/a"));
		String name=fname.getText();
		System.out.println(name);
		Thread.sleep(3000);
		fname.click();
		
		String Title=driver.getTitle();
		//System.out.println(Title);
		System.out.println(Title);
		//Verify title
		if(Title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("The title is verified ");
		}else
		{
			System.out.println("The title not verified ");
		}
		
		//Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement companyname=driver.findElement(By.id("updateLeadForm_companyName"));
		
		companyname.clear();
		companyname.sendKeys("IBM TECHNOLOGY");
		
		//Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
	/*	//Check updated name
		WebElement Update_CompanyName=driver.findElement(By.linkText("Bosch (11504)"));
		String update_company= Update_CompanyName.getText();
		
		System.out.println(update_company);
		*/
		
		Thread.sleep(1000);
		driver.close();
	}

}
