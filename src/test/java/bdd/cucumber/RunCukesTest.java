package bdd.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jiachiliu on 2/7/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"})
public class RunCukesTest {

}
