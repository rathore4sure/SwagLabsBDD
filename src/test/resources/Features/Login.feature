Feature: Login test cases for Sauce Demo App
  ## setting the background for current feature testing
  Background: I am on login page
    Given I am on the SauceDemo login page
  ## scenarios in the current feature testing
  @smoke @P1
  Scenario: Successful login with standard user
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click the Login button
    Then I should be redirected to the inventory page
#
#  Scenario: Login fails with locked out user
#    When I enter username "locked_out_user"
#    And I enter password "secret_sauce"
#    And I click the Login button
#    Then I should see an error message "Epic sadface: Sorry, this user has been locked- out."
#  Scenario: Login fails with incorrect password
#    When I enter username "standard_user"
#    And I enter password "wrong_password"
#    And I click the Login button
#    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"
#  Scenario: Login fails with empty username and password
#    When I enter username ""
#    And I enter password ""
#    And I click the Login button
#    Then I should see an error message "Epic sadface: Username is required"
#  Scenario: Login fails with empty password
#    When I enter username "standard_user"
#    And I enter password ""
#    And I click the Login button
#    Then I should see an error message "Epic sadface: Password is required"
#  Scenario: Login fails with empty username
#    When I enter username ""
#    And I enter password "secret_sauce"
#    And I click the Login button
#    Then I should see an error message "Epic sadface: Username is required"
