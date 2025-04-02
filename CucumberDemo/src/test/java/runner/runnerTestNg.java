package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
    plugin = {"pretty", "json:target/cucumber-reports/CucumberLoginStepPrac.json"},
    features = "src/test/resources/com/features/LoginPrac.feature",
    glue = "StrepDef"
//    ,tags = ("not @Regression")
)
public class runnerTestNg extends AbstractTestNGCucumberTests {

}