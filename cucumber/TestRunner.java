package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="Features",
		glue = {"cucumberExamples"},
		tags = "@SmokeTest",
	//	plugin= {"pretty"},
		plugin= {"html:cucumber"},
		monochrome=true
	//	dryRun=true
		
				
		)
public class TestRunner {

}
