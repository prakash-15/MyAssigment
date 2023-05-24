package week6.day3;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReport {

	public static void main(String[] args) throws IOException {
		
		
		//Step1
		
		ExtentHtmlReporter repo =new ExtentHtmlReporter("./report/resutl.html");
		
		repo.setAppendExisting(true);
		
		//Step2
		
		ExtentReports extent =new ExtentReports();
		
		//Step3
		
		extent.attachReporter(repo);
		
		//Step4
		
		ExtentTest test=extent.createTest("CreateLead", "Check The CreateLead Details");
		test.assignAuthor("Prakash C");
		test.assignCategory("Smoke Test");
		
		//Step5
		
		test.pass("Enter teh UserName",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/snap1.png").build());
		test.pass("Enter teh Password");
		test.pass("Click the Login");
		
		//Step6
		
		extent.flush();
		
		System.out.println("Done");
		
	}

}
