package cucumber.impl;

/**
 * Created by jiachiliu on 2/7/15.
 */
public class Calculator {

    public int calculate(String formula) {
        String[] tokens = formula.trim().split("\\s+");
        if (tokens.length != 3) {
            throw new RuntimeException("Invalid Formula!");
        }

        int left = Integer.parseInt(tokens[0]);
        int right = Integer.parseInt(tokens[2]);
        char op = tokens[1].toCharArray()[0];

        switch (op) {
            case '+':
                return left + right;
            case '-':
                return left - right;
            case '*':
                return left * right;
            case '/':
                return left / right;
            default:
                throw new RuntimeException("Invalid Operator!");
        }
    }
}
