Feature: First Feature
  // Scenario: We are checking cucumber keywords
  //   Given This is GIVEN 45
  //  When This is "WHEN when When"
  //   Then This is THEN

  Scenario Outline: We are checking cucumber keywords
    Given This is GIVEN <numbers>
    When This is "<strings>"
    Then This is Then

    Examples:
    |numbers|strings|
    |   5   | Lale  |
    |   6   | Laleli|