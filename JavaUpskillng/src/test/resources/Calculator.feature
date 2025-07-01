Feature: Calculator

  Simple calculator which takes two numbers


  @HappyPath
  Scenario: Addition
    Given I have a calculator
    And I enter 5 and 2 into the calculator
    When I press add
    Then the result should be 7

  @HappyPath
  Scenario Outline: Subtraction
    Given I have a calculator
    And I enter <input1> and <input2> into the calculator
    When I press subtract
    Then the result should be <result>
    Examples:
      | input1 | input2 | result |
      | 5      | 1      | 4      |
      | 100    | 5      | 95     |


