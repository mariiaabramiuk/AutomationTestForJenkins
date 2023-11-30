Feature: this feature is for smoke test

  @smoke
  Scenario:
    Smoke test
    Given I print hello world
    Then everybody is happy

@regression
    Scenario: This is for cucumber test
      Given I run cucumber test
      Then verify this is correct test