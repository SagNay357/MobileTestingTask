package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = {"com.facebook.stepDefinitions","com.facebook.hooks"}, // Path to your step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"} // Reports output
)
public class TestRunner {
    // Empty class, just runs the tests
}
