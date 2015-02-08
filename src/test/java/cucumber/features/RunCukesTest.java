package cucumber.features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jiachiliu on 2/7/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json"},
        features = {"src/test/java/cucumber/features"})
public class RunCukesTest {
}
