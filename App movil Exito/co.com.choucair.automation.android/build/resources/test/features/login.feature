
Feature: Login in website exito
  I, as a user, want to login in the site web to add products in the shopping cart


  Scenario: Login website exito
    Given that user is on login page
    When I enter the email and password
    And add products in the shopping cart
    Then I should see the product pull