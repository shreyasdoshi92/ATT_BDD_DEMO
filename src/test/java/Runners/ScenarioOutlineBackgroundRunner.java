package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\ScenarioOutlineBackground.feature"},
		glue = {"Steps"},
		publish = true
		
				
		)

public class ScenarioOutlineBackgroundRunner extends AbstractTestNGCucumberTests {

}
