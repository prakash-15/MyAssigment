package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandlesfrom = driver.getWindowHandles();
		List<String> contactsFirst = new ArrayList<String>(windowHandlesfrom);
		driver.switchTo().window(contactsFirst.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-row   ']//table/tbody/tr/td/div/a[1]")).click();
//		cd.close();
		driver.switchTo().window(contactsFirst.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandlesTo = driver.getWindowHandles();
		List<String> contactsTo = new ArrayList<String>(windowHandlesTo);
		driver.switchTo().window(contactsTo.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-row    x-grid3-row-alt']//table/tbody/tr/td/div/a[1]")).click();
//		cd.close();
		driver.switchTo().window(contactsFirst.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert accept = driver.switchTo().alert();
		accept.accept();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
