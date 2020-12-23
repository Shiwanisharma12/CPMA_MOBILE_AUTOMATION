Feature: Login scenarios automation

  Background:
    When  I lauch app
    Given I verify user is not logged in


  Scenario: Verify Login landing screen elements
    Then I see frontier precision logo
    And  I see FS GIS for mosquito control logo
    And  I see Login button
    And  I see enterprise login button

  Scenario: Verify Login screen elements
    And  I click on login button
    Then I see username field
    And  I see password field
    And  I see signIn button
    And  I see cancel button
    And  I see forgot username link and see forgot password link
    And  I close app


  Scenario: Login with valid user credential
    When I click on login button
    When I enter valid credentials
    And I click on SignIn Button
    And I verify select group field
    And I close app

  Scenario Outline: Login with Invalid email and Invalid password
    When  I click on login button
    When  I enter Invalid credentials as "<username>" "<password>"
    And   I click on SignIn Button
    And   I verify error message as "<errorMessage>"
    And   I close app
    Examples:
      | username           |  | password | errorMessage                  |
      | Shiwani QA ANALYST |  | FSA6767  | Invalid username or password. |


  Scenario Outline: Login with blank password
    When  I click on login button
    When  I enter Invalid credentials as "<username>" "<password>"
    And   I click on SignIn Button
    And   I verify error message for blank password as "<errorMessage>"
    And   I close app
    Examples:
      | username           |  | password | errorMessage                 |
      | Shiwani QA ANALYST |  |          | A valid password is required |


  Scenario Outline: Login with blank username
    When  I click on login button
    When  I enter Invalid credentials as "<username>" "<password>"
    And   I click on SignIn Button
    And   I verify error message for blank username as "<errorMessage>"
    And  I close app

    Examples:
      | username |  | password   | errorMessage                 |
      |          |  | Automation | A valid username is required |


  Scenario: Verify setting icon and the portal configuration screen elements
    When I click on setting icon
    When I see pick file button
    And  I see enterprise portal configuration
    And  I see portal URL field
    And  I see client ID field
    And  I see client secret field
    And  I see redirect URI
    And  I see save button
    And  I see clear button
    And  I see cancel button of portal screen
    And  I close app


  Scenario: Verify app information icon("i") on login screen
    When I click on i icon
    Then I see FSlogo on info screen
    And  I see FS MobileVersion
    And  I see crossPlatform app version
    And  I see build no
    And  I see build date
    And  I see the text
    And  I see support desk
    And  I see back arrow
    And  I close app


  Scenario: Verify links
    When I click on login button
    Then I see github,facebook,google,apple link
    And  I redirect to github page after clicking on github icon
    And  I redirect to facebook page after clicking on facebook icon
    And  I close app


  Scenario: Verify ? icon functionality
    When I click on login button
    When I click on question mark icon
    Then I verify question mark screen elements
    And  I close app

  Scenario: Forget username negative scenarios
    When I click on login button
    And  I click on forgot username
    And  I enter incorrect email in email field
    And  I click on forgot username continue button
    Then I see error message as "Email does not appear to be valid."
    And  I send white spaces in email field
    And  I click on forgot username continue button
    And  I see error message in white space case  as "Please provide the information requested"
    And I close app


  Scenario: Forget password negative scenarios
    When I click on login button
    And  I click on forgot password
    And  I enter username  in username field
    And  I click on continue button
    Then I see message as "An email has been sent to you."or in case of enterprise "Username does not exist or is inaccessible."
    When I click on login button
    And  I click on forgot password
    And  I send white spaces in email field
    And  I click on continue button
    And  I see error message in white space case  as "Please provide the information requested"
    And  I close app

  Scenario: Forget password negative scenarios in enterprise
    When I click on login button
    And  I click on forgot password
    And  I enter username  in username field
    And  I click on continue button
    Then I see error popup with message "Username does not exist or is inaccessible."
    And  I close app

  Scenario: To verify validation message before selecting group and webmap value
    When I click on login button
    When I enter valid credentials
    And  I click on SignIn Button
    And  I verify select group field
    And  I click on submit button
    And  I verify validation message as "Select group before go"
    And  I close app


  Scenario: To verify validation message before selecting webmap value
    When I click on login button
    When I enter valid credentials
    And  I click on SignIn Button
    And  I verify select group field
    And  I click on select group field and select group field value
    And  I click on submit button
    And  I verify validation message as "Select webmap before go"
    And  I close app


  Scenario: Verify next screen After selecting webmap and group value
    When I click on login button
    When I enter valid credentials
    And  I click on SignIn Button
    And  I verify select group field
    And  I select group field and webmap value
    And  I click on submit button
    And  I see the zone
    And  I see the vehicle
    And  I close app

  Scenario: Verify validation message for proceeding further without selecting zone and vehicle value
    When I click on login button
    When I enter valid credentials
    And  I click on SignIn Button
    And  I verify select group field
    And  I select group field and webmap value
    And  I click on submit button
    And  I see the zone
    And  I see the vehicle
    And  I click on Go button
    And  I verify empty zone vehicle error message as "Select zone and vehicle."
    And  I close app

  Scenario: Verify validation message for proceeding further without selecting vehicle value
    When I click on login button
    When I enter valid credentials
    And  I click on SignIn Button
    And  I verify select group field
    And  I select group field and webmap value
    And  I click on submit button
    And  I see the zone
    And  I see the vehicle
    And  I select zone value
    And  I click on Go button
    And  I verify empty vehicle error message as "Select vehicle."
    And  I close app

  Scenario: Verify validation message for proceeding further without selecting zone value
    When I click on login button
    When I enter valid credentials
    And  I click on SignIn Button
    And  I verify select group field
    And  I select group field and webmap value
    And  I click on submit button
    And  I see the zone
    And  I see the vehicle
    And  I select the vehicle
    And  I click on Go button
    And  I verify empty zone error message as "Select zone."
    And  I close app









