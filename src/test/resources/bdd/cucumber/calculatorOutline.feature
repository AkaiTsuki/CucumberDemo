Feature: Calculate Two Numbers
  In order to help me for my daily work,
  As a bank clerk,
  I want to have a calculator two compute algebraic result

  Scenario Outline:
    Given A input formula "<input>"
    When the calculator is run
    Then the output should be <output>

  Examples: Positive Integer
  working with positive integers
    | input  | output |
    | 2 + 2  | 4      |
    | 4 - 3  | 1      |
    | 2 * 3  | 6      |
    | 10 / 5 | 2      |

  Examples: Negative Integer
  working with negative integers
    | input  | output |
    | -2 + 2 | 0      |
    | -4 - 3 | -7     |