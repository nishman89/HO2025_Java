Feature: Outcode Lookup
  As a user of the postcode API
  I want to look up outcode information
  So that I can get location details for any UK outcode

  Background:
    Given I am using the postcodes API with the end point "outcodes/"

  @Happy
  Scenario: Look up a valid London outcode
    When I look up the outcode "EC2Y"
    Then I should get a 200 response code
    And the returned outcode should be "EC2Y"

  @Sad
  Scenario Outline: Look up an invalid outcode
    When I look up the outcode "<outcode>"
    Then I should get a 404 response code
    Examples:
      | outcode   |
      | INVALID   |
      | 123456    |

  @Sad
  Scenario: Look up an empty outcode
    When I look up the outcode "outcodes/"
    Then I should get a 404 response code


