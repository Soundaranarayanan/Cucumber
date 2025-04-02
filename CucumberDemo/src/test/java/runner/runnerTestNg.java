
package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(plugin={"pretty","html:target/cucumber-reports/Cucumber2.html"},
			features="src/test/resources/com/features/Login.feature",
			glue="StrepDef")
public class runnerTestNg extends AbstractTestNGCucumberTests{
		
	}
