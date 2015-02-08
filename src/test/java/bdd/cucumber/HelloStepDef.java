package bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

/**
 * Created by jiachiliu on 2/7/15.
 * <p/>
 * A simple step definition for hello world app
 */
public class HelloStepDef {

    private String result;
    private HelloWorldApp app;

    @Given("^I have a hello app with \"([^\"]*)\"$")
    public void I_have_a_hello_app_with(String username) throws Throwable {
        app = new HelloWorldApp(username);
    }

    @When("^I ask it to say hi$")
    public void I_ask_it_to_say_hi() throws Throwable {
        result = app.sayHi();
    }

    @Then("^it should answer with \"([^\"]*)\"$")
    public void it_should_answer_with(String expect) throws Throwable {
        assertEquals(expect, result);
    }

}
