package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\LoginWithData.feature"},
		glue = {"Steps"}
				
		)

public class LoginWithDataRunner extends AbstractTestNGCucumberTests {

}
