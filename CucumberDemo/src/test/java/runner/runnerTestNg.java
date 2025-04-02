
package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(plugin={"pretty","json:target/cucumber-reports/Cucumber4.json"},
			features="src/test/resources/com/features/Login.feature",
			glue="StrepDef")
public class runnerTestNg extends AbstractTestNGCucumberTests{
		
	}
