#Feature: Login Functionality
#  As a user
#  I want to validate login with various credentials
#  So that I can ensure the system behaves as expected
#
#  Scenario Outline: Login validation for different users
#    Given I am on the SauceDemo login page
#    When I enter username "<username>"
#    And I enter password "<password>"
#    And I click the "Login" button
#    Then I should <expectedOutcome>
#
#    Examples:
#      | username           | password       | expectedOutcome                                  |
#      | standard_user      | secret_sauce   | be redirected to the inventory page              |
#      | locked_out_user    | secret_sauce   | see an error message "Epic sadface: Sorry, this user has been locked out." |
#      | standard_user      | wrong_password | see an error message "Epic sadface: Username and password do not match any user in this service" |
#      |                   |                | see an error message "Epic sadface: Username is required" |
#      | standard_user      |                | see an error message "Epic sadface: Password is required" |
#      |                   | secret_sauce   | see an error message "Epic sadface: Username is required" |
