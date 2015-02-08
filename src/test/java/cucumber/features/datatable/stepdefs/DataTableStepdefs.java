package cucumber.features.datatable.stepdefs;

import cucumber.impl.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jiachiliu on 2/8/15.
 */
public class DataTableStepdefs {

    private Calculator calculator;
    private List<Integer> results;
    private List<IntegerRow> rows;

    @Given("^the following integers needs to be calculate$")
    public void the_following_integers_table(List<IntegerRow> row) throws Throwable {
        rows = row;
        calculator = new Calculator();
        results = new LinkedList<Integer>();
    }

    @When("^I have the operator \"([^\"]*)\"$")
    public void I_have_the_operator(String op) throws Throwable {
        for (IntegerRow row : rows) {
            String formula = row.left + " " + op + " " + row.right;
            results.add(calculator.calculate(formula));
        }
    }

    @Then("^the calculator should return$")
    public void the_calculator_should_return(List<Integer> expects) throws Throwable {
        assertEquals(expects, results);
    }

    class IntegerRow {
        String left;
        String right;

        @Override
        public String toString() {
            return "IntegerRow{" +
                    "left='" + left + '\'' +
                    ", right='" + right + '\'' +
                    '}';
        }
    }
}
