package bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by jiachiliu on 2/7/15.
 */
public class CalculatorStepDef {

    private Calculator cal;
    private int result;

    @Given("^I have a calculator$")
    public void I_have_a_calculator() throws Throwable {
        cal = new Calculator();
    }

    @When("^I input a formula \"([^\"]*)\"$")
    public void I_input_a_formula(String formula) throws Throwable {
        // Express the Regexp above with the code you wish you had
        result = cal.calculate(formula);
    }

    @Then("^I should get (\\d+)$")
    public void I_should_get(int expect) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assertEquals(expect, result);
    }
}
