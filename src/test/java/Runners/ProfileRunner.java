package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Profile.feature"},
		
		glue = {"Steps"},
		
		plugin = {"pretty"},
		
		dryRun = true
		
		
		)


public class ProfileRunner extends AbstractTestNGCucumberTests {

}