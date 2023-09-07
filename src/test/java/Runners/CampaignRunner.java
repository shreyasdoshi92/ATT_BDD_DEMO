package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
//		1. End to end scenarios
//		2. Critical functionalities
//		3. Client requirement
//		4. Repeatativeness 
		
		features = {"src\\test\\resources\\appfeature\\Campaigns.feature"},
		
		glue = {"Steps", "Hooks"},
		
		plugin = {"pretty"},
		
		tags = "@campaigns"
		
		
		)

public class CampaignRunner extends AbstractTestNGCucumberTests{

}
