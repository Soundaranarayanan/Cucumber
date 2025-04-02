package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
    plugin = {"pretty", "json:target/cucumber-reports/CucumberLoginStepPrac1.json"},
    features = "src/test/resources/com/features/Login.feature",
    glue = "StrepDef",
    monochrome=true,dryRun =false
//    ,tags = ("not @Regression")
)
public class runnerTestNg extends AbstractTestNGCucumberTests {

}