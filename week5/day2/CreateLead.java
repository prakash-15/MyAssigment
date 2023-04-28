package week5.day2;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Baseclass {
	
	@DataProvider(name="fetchdata")
	public String[][] fetchdata() throws IOException {
		//String[][] fetch=new String[2][2];
//		fetch[0][0]="99";
//		fetch[0][1]="IBM";
//		
//		fetch[1][0]="98";
//		fetch[1][1]="Mindtree";
		
		String[][] passdata = Excelintegration.Passdata();
		
		return passdata;
		
		
	}
	
	@Test(dataProvider="fetchdata")
	public  void createLead (String Cmny,String nme,String lname,String pno) {
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cmny);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(nme);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pno);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}
