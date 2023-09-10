package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
//		features = {"src\\test\\resources\\execution"},
		
		features = {"@target/failedrun.txt"},
		
		glue = {"execution"},
		
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"rerun:target/failedrun.txt"}
		
//		tags = "@functional"
		
		)




public class AmazonFailedRunnerTest2 extends AbstractTestNGCucumberTests{

}
