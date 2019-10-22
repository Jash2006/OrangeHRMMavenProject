@Login
  Feature: Login
Scenario: Successful Login with valid credentials to Website
 Given I am on the Home Page of OrangeHRM website
 When I enter valid Username and Password
 And I click on LOGIN
 Then I should navigate to Dashboard page and 'Welcome Admin' message on right top corner


Scenario Outline: UnSuccessful Login with invalid credentials to Website
  Given I am on the Home Page of OrangeHRM website
  When I enter Username as "<username>"and Password as "<password>"
  And I click on LOGIN
  Then I should see the "<error message>"
Examples:
  | username | password | error message            |
  | Admin    | xyz123   | Invalid credentials      |
  | Admin    |          | Password cannot be empty |
  |          | admin123 | Username cannot be empty |
  | manoj    | admin123 | Invalid credentials      |
  |          |          | Username cannot be empty |
  | admin    | xyz123   | Invalid credentials      |



