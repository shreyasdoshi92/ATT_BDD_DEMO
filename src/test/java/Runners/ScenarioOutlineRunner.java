package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\ScenarioOutline.feature"},
		glue = {"Steps"},
		publish = true
		
				
		)

public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests {

}
