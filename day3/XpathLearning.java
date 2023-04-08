package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		// Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// maximize the window
		driver.manage().window().maximize();
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//p[@class='top']/input[@id='username']")).sendKeys("DemoCsr");
		driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']')]")).click();
	
		
		// close the window
		//driver.close();

	}

}
