package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/feature/SF_CreateOps.feature",
			glue="stepdef",
			monochrome=true,
			publish=true)
public class SF_CreateOpp_Runner extends AbstractTestNGCucumberTests {

}
