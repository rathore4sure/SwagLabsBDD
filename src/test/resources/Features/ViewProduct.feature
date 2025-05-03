Feature: Search and view a single product
  Scenario: Search an item with successful login
    Given I am on the SauceDemo login page
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click the Login button
    Then I should be redirected to the inventory page
    When I click on the product named "Sauce Labs Fleece Jacket"
    Then I should be redirected to the product detail page