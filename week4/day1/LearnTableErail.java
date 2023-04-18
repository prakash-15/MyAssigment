package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTableErail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Launch the URL
		driver.get("https://erail.in/");
		
		WebElement Elm = driver.findElement(By.id("txtStationFrom"));
		Elm.clear();
		Elm.sendKeys("MS",Keys.ENTER);
		
		WebElement Elm1 = driver.findElement(By.id("txtStationTo"));
		Elm1.clear();
		Elm1.sendKeys("CO",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(3000);
		 List<WebElement> WebEl = driver.findElements(By.xpath("//*[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		 int Size= WebEl.size();
		 Thread.sleep(3000);
		 for (int i = 2; i<=Size; i++) {
			 
			 String text1 = driver.findElement(By.xpath("//*[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			 System.out.println(text1);
		}
	}

}
