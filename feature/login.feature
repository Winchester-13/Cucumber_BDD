Feature: Login

  Scenario: User should be able to login
    Given the user opens demoguru site
    When the user enter the login creds ("username=admin", "Password:admin")
    And the user clicks on the Submit button
    Then the user should see the Login Successful message
