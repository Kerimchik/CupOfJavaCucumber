Feature: Functionalities for Paylocity

Scenario: Add Employee no Discount

    Given an Employer
    And I am on the Benefits Dashboard page
    When I select Add Employee
    Then I should be able to enter employee details
    And First Name does not begin with “A” or “a”
    And the employee should save
    And I should see the employee in the table
    And the benefit cost calculations are correct





Scenario: Add Employee with Discount

    Given an Employer
    And I am on the Benefits Dashboard page
    When I select Add Employee
    Then I should be able to enter employee details
    And First Name begins with “A” or “a”
    And the employee should save
    And I should see the employee in the table
    And the employee has a 10% discount
    And the benefit cost calculations are correct

Scenario: Edit Employee

      Given an Employer
      And I am on the Benefits Dashboard page
      When I select the Action Edit
      Then I can edit employee details
      And the data should change in the table