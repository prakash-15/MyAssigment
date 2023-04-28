package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	@CucumberOptions (features="src/test/java/feature/CreateLead.feature",glue="stepdef",monochrome=true,publish=true) 
	
	
	public class RunnerClass extends AbstractTestNGCucumberTests {
		
		
		


}
