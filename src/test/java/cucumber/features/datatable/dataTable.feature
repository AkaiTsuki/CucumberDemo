Feature: Data Table Feature

  Scenario: Data Table Demo
    Given the following integers needs to be calculate
      | left | right |
      | 2    | 3     |
      | 4    | 5     |
    When I have the operator "+"
    Then the calculator should return
      # why adding a header will cause exception
      | 5 |
      | 9 |