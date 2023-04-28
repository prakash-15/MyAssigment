package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SFCreateOpps_StepDef {

	public ChromeDriver driver;

	@Given("Launch SalesForce Browser")
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@And("Enter the Username")
	public void username() {
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	}
	@And("Enter the Password")
	public void password() {
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	}
	@When("Click on Login button in the application")
	public void Click() {
		driver.findElement(By.id("Login")).click();
	}
	@And("Click on the toggle menu button")
	public void togglemenu() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
	}
	@And("Click on view All")
	public void viewAll() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@And("Click on Sales from App Launcher")
	public void sales() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
	}
	@And("Click on Opportunities")
	public void opportunities() {
		WebElement Op = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click()", Op);
	}
	@And("Click on New")
	public void newbutton() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	@And("Enter a name in Opportunity name text box as Salesforce Automation by Jahnavi and verify the text that is entered")
	public void Oppname() {
		WebElement oppName = driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']//input)[3]"));
		oppName.sendKeys("Salesforce Automation by Jahnavi");
		oppName.getText();
	}
	@And("Select close date as today's date")
	public void closedata() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='26']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		Thread.sleep(2000);
	}
	@And("Select Stage field as Needs Analysis")
	public void stagefield() {
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	}
	@When("Click on the Submit button")
	public void submitButton() {
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	}
	@Then("Verify if the Opportunity is successfully created")
	public void verification() throws InterruptedException {
		String OppName1 = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		if(OppName1.equals("Salesforce Automation by Prakash")) {
			System.out.println("Opportunity Name is verified and is the correct value");
		}else {
			System.out.println("Opportunity Name is wrong, please check");
		}
	Thread.sleep(2000);
	}
	@And("Close the SalesForce Browser")
	public void closeBrowser() {
		driver.close();
	}
}
	

