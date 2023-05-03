package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.Pom_Baseclass;
import page.Login;

public class TC_001 extends Pom_Baseclass {
	
	@BeforeTest
	public void setData() {
		fileName="CreateLead";
}
	
	@Test(dataProvider="fetchdata")
	public void rundata(String companyName,String fName,String lName,String PhNo)
	{
		Login l1=new Login(driver);
		l1.EnterUserName("DemoCsr").EnterPassword("crmsfa")
		.ClickLoginbutton().clickCRMLink()
		.clickLeadButton().clickCreateLeafButton()
		.EnteCompanyName(companyName).EnteFirstName(fName).EnteLastName(lName).EntephoneNumber(PhNo)
		.clickSubmitButton().Verfiylead();
	}

}
