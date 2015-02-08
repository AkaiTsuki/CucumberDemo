package bdd.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jiachiliu on 2/7/15.
 */
public class CalculatorOutlineStepDef {

    private String inputFormula;
    private int result;

    @Given("^A input formula \"([^\"]*)\"$")
    public void A_input_formula(String formula) throws Throwable {
        this.inputFormula = formula;
    }


    @When("^the calculator is run$")
    public void the_calculator_is_run() throws Throwable {
        Calculator cal = new Calculator();
        this.result = cal.calculate(inputFormula);
    }

    @Then("^the output should be (-?\\d+)$")
    public void the_output_should_be(int expected) throws Throwable {
        assertEquals(expected, result);
    }
}
