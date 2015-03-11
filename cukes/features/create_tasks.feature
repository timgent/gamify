Feature: Creating tasks
  
  Scenario: As a user I am able to add tasks
    
    Given I go to the task selection part of the site
    When I create some tasks
    Then I am able to view these tasks in the task review part of the site