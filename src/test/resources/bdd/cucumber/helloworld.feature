Feature: Hello World
  A simple hello world feature

  Scenario: Print Hello World Message
    Given I have a hello app with "John"
    When I ask it to say hi
    Then it should answer with "Hello John!"