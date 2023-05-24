package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;






public class Baseclass_Exrepo {

	public  ChromeDriver driver;
	public static  ExtentReports extent;
	public static ExtentTest test;
	public String TestName,TestDesc,Auname,Aucategory;

	
	@BeforeMethod
	public void Precheck()
	{
	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	
	@BeforeSuite
	public void startreport() {
		//Step1
		
				ExtentHtmlReporter repo =new ExtentHtmlReporter("./report/resutl.html");
				
				repo.setAppendExisting(true);
				
				//Step2
				
		extent =new ExtentReports();
				
				//Step3
				
				extent.attachReporter(repo);
				
	}
	
	@BeforeClass
	public void tesdetails() {

		 test=extent.createTest(TestName, TestDesc);
		test.assignAuthor(Auname);
		test.assignCategory(Aucategory);
	}
	
	public void reportstatus(String Message,String Status) throws IOException {
		if(Status.equalsIgnoreCase("pass")) {
			test.pass(Message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takesnap()+".png").build());
		}else if(Status.equalsIgnoreCase("fail")) {
			test.fail(Message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takesnap()+".png").build());
		}
	}
	
	
public int takesnap() throws IOException {
	int random= (int)(Math.random()*99999);
	File src=driver.getScreenshotAs(OutputType.FILE);
	File des=new File("./snap/img"+random+".png");
	FileUtils.copyFile(src, des);
	return random;
}
	
	
	@AfterSuite
	public void stopreport() {
		extent.flush();
	}
	
	@AfterMethod
	public void Postcheck()
	{
	driver.close();
	}
	}