Feature: Sample Demo QA

  Scenario: Verify user can input all select menu successfully
    Given User go to "https://demoqa.com/select-menu"
    When User in Select Menu page
    And User choose select value "Another root option"
    And User choose select one "Other"
    And User choose old style select menu "Aqua"
    Then User success input select menu

  Scenario: Verify title, author, publisher is correct between search result and detail book
    Given User go to "https://demoqa.com/books"
    When User in Book Store page
    And User search book "Git Pocket Guide"
    And User click book "Git Pocket Guide"
    Then User see "Git Pocket Guide"
    # Additional step for assert title, author, & publisher using setter getter
    And User see data between search result and book detail is corresponding