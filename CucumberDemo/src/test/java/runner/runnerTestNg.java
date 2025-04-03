package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty" , "json:target/cucumber-Report/CucumberDemo1.json"}
				,features ="src/test/resources/com/features/Orange.feature"
				,glue ="StepDefinition"
		)
public class runnerTestNg extends AbstractTestNGCucumberTests{

}