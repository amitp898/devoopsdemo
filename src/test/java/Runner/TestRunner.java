package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/java/Feature",
        glue = "MyStepDefination",
        plugin = {"pretty","html:target/cucmber-report.html","json:target/cucumber-report.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
