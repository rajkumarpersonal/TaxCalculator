package stepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = { "html:target/cucumber-report/cucumber.html","json:target/cucumber-report/cucumber.json"},
        features = "src/test/resources/features",
        glue = {"stepDefinition"},
        dryRun = false,
        monochrome = true,
        tags = "@Retirement-calculator"


)
public class RunnerClass {
}
