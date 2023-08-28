package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Registration.feature"},
		glue = {"Steps"},
		publish = true
		
				
		)

public class RegistrationRunner extends AbstractTestNGCucumberTests {

}
