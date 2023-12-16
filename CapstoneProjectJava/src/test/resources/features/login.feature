Feature: Login Functionality

  Scenario Outline: Login with valid and invalid credentials
    Given I am on the login page
    When I enter "<username>" and "<password>" and click submit
    Then I should see "<title>" as page title

    Examples:
      | username | password | title                |
      | gooduser | goodpass | Swag Labs            |
      | baduser  | badpass  | Epic sadface: Sorry, that username and password do not match any user in this service |