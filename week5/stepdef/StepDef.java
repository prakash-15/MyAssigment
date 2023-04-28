package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	public ChromeDriver driver;

	@Given ("Launch the browser and load the url and maximize the window")
	public void LoadUrl() {
	driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@And ("Entetr the user name as {string}")
	public void Uname(String nme) {
		driver.findElement(By.id("username")).sendKeys(nme);
	}
	
	@And ("Entetr the password as {string}")
	public void Passwd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When ("click on login button")
	public void ClickButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then ("verify my page sucessfully login")
	public void VerifyLogin() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		String text = driver.getTitle();
		if (text.contains("Testleaf")) {
			System.out.println("Login successfully");
		}
		else {
			System.out.println("Login not Sucessful");
			
		}
	}
	
	
	@When ("click on Lead button")
	public void clicklead() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And ("click on  Create button")
	public void createlead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And ("send the company name as (.*)$")
	public void cname(String cnm) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cnm);
	}
	@And ("send the First name as (.*)$")
	public void FirstName(String Fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
	}
	@And ("send the Last name as (.*)$")
	public void LastName(String Lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
	}
	@And ("send the Mobile Number as (.*)$")
	public void Number(String num) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(num);
	}
	
	@When ("click on Summit button")
	public void SubmitLead() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	
	@Then ("verify my page Lead sucessfully created")
	public void Verify() {
	
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Test Leaf")) {
			System.out.println("Lead created successfully");
			}
		else {
			System.out.println("Lead is not created");
		}	
	}
	
	@But ("verify my page not sucessfully login")
	public void LoginVerify() {
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		if (title.contains("TestLeaf")) {
			System.out.println("Login  successfully");
		}
		else {
			System.out.println("Login not successfully");
		}	
}

}

