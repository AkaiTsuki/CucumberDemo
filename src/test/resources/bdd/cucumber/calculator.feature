Feature: Add Two Number
  A simple calculator

  Scenario: Add two Integer
    Given I have a calculator
    When I input a formula "1 + 1"
    Then I should get 2

  Scenario: Minus two Integer
    Given I have a calculator
    When I input a formula "1 - 1"
    Then I should get 0

  Scenario: Multiply two Integer
    Given I have a calculator
    When I input a formula "10 * 2"
    Then I should get 20

  Scenario: Divide two Integer
    Given I have a calculator
    When I input a formula "10 / 5"
    Then I should get 2