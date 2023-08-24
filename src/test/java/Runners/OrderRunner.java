package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Order.feature"},
		glue = {"Steps"}
				
		)

public class OrderRunner extends AbstractTestNGCucumberTests {

}
