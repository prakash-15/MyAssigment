package marathon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_case_001 extends Marbaseclass {
	
	@BeforeTest
	public void setData() {
		FileName="sfqstn";
}
	
@Test(dataProvider="Passdata")
	public 	void passinput(String qstn,String ans) throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='slds-text-heading_small']")).click();
		Thread.sleep(3000);
		WebElement Ele = driver.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[2]"));
		driver.executeScript("arguments[0].click()", Ele);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		WebElement felm = driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']"));
		felm.sendKeys(qstn);
		Thread.sleep(2000);
		WebElement felm1 = driver.findElement(By.xpath("//div[contains(@class,'ql-editor ql-blank')]"));
		felm1.sendKeys(ans);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		String text = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]")).getText();
		System.out.println(text);
		
	

	}

}
