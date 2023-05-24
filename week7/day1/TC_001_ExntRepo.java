package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.Baseclass_Exrepo;
import baseclass.Pom_Baseclass;
import page.Login;
import page.Loginpage;

public class TC_001_ExntRepo extends Baseclass_Exrepo {
	
	@BeforeTest
	public void setData() {
		TestName="Login";
		TestDesc="Pasitive Data";
		Auname="Prakash C";
		Aucategory="Sanity";
}
	
	@Test()
	public void rundata() throws IOException
	{
		Loginpage l1=new Loginpage(driver);
		l1.enterUserName("DemoCsr").enterPassword("crmsfa")
		.clickLoginbutton();
		
}
}