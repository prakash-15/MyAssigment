package runner;

import org.testng.annotations.Test;

import baseclass.Pom_SFAdminBaseclass;
import page.SF_Login;

public class TC_SFADMIN_003 extends Pom_SFAdminBaseclass {
	
	@Test
	public void SF_rundata() throws InterruptedException
	{
		SF_Login l1=new SF_Login(driver);
		l1.EnterUserName().EnterPassword().ClickLoginbutton()
		.Myhomeclikmore().confirmWindow().Learnpage().Admincerti()
		.AdmincertList();
		
	}

}
