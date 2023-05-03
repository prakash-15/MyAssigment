package runner;

import org.testng.annotations.Test;

import baseclass.Pom_Baseclass;
import page.Login;

public class TC_002 extends Pom_Baseclass {
	
	@Test
	public void rundata()
	{
		Login l1=new Login(driver);
		l1.EnterUserName("DemoCsr").EnterPassword("crmsfa")
		.ClickLoginbutton();
	}

}
