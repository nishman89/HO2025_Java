Feature: Look up UK postcodes

  Scenario: Retrieve details for a valid postcode
    Given I search for postcode "EC2Y5AS"
    Then the response status code should be 200
    And the postcode in the response should be "EC2Y 5AS"
    And the server header should be "cloudflare"
