Feature: Trap type scenarios automation

  Background:

#    When  I lauch app
#    Given I verify user is not logged in
#    When I click on login button
#    When I enter valid credentials
#    And  I click on SignIn Button
#    And  I verify select group field
#    And  I select group field and webmap value
#    And  I click on submit button
#    And  I select zone and vehicle value
#    And  I click on Go button


  Scenario: Successful submission of trap type form by filling all the fields


    When  I lauch app
    Given I verify user is not logged in
    When I click on login button
    When I enter valid credentials
    And  I click on SignIn Button
    And  I verify select group field
    And  I select group field and webmap value
    And  I click on submit button
    And  I select zone and vehicle value
    And  I click on Go button

    And  I click on record activity button to select traptype activity and then trap data site
    And  I verify all the fields of trap data and fill all the fields of form
    And  I submit trap data form
    Then  I verify pop up error message as "Info!" "Feature saved successfully."
    And  I click on ok button

  Scenario: Error pop up verification without filling mandatory fields in trap type form

    And  I click on record activity button to select traptype activity and then trap data site
    And  I click on submit button to submit trap type
    Then  I verify pop up error message as "Info!" "Please enter mandatory details."
    And  I click on ok button
    And  I fill one mandatory field ie trap activity type
    And  I click on submit button to submit trap type
    Then  I verify pop up error message as "Info!" "Please enter mandatory details."
    And  I click on ok button
    And  I click on cancel button
    Then I verify pop up error message as "Warning!" "All your input data will be lost. Do you want to continue?"
    And  I click on continue button of cancelling form submission

  Scenario: warning pop up verification for cancel button after filling all fields in trap type form
    And  I click on record activity button to select traptype activity and then trap data site
    And  I verify all the fields of trap data and fill all the fields of form
    And  I click on cancel button
    Then  I verify pop up error message as "Warning!" "All your input data will be lost. Do you want to continue?"
    And  I click on continue button of cancelling form submission


  Scenario: warning pop up verification for start date less than finish date in trap type form
    And  I click on record activity button to select traptype activity and then trap data site
    And  I verify all the fields of trap data and fill all the fields of form
    And  I set finish date less than start date
    Then  I verify pop up error message as "Information" "Finish Time can not be less than Start Time"
    And  I click on ok button
    And  I close app




