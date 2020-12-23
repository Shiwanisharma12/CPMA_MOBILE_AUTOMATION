Feature: Landing count scenarios automation

#  Background:
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
#    And  I click on record activity button to select landing count activity and then landing site

  Scenario: I submit the form after filling all the fields of landing count form

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
    And  I click on record activity button to select landing count activity and then landing site

    And  I set date and time
    And  I enter landing rate as "1234"
    And  I enter comment of more than four hundred words and verify three hundred words have been accepted
    And  I set valid finish date and time
    And  I enter long rain gauge string and verify 16 digit has been accepted
    And  I click on submit button of landing count
    Then  I verify pop up error message as "Info!" "Feature saved successfully."
    And  I click on ok button

  Scenario: Verification of error messages when all fields are empty or only single mandatory filled is filled in landing count form
    And  I click on record activity button to select landing count activity and then landing site
    When I click on submit button of landing count
    And  I verify pop up error message as "Info!" "Please enter mandatory details."
    And  I click on ok button
    And  I enter rain gauge value without entering finish date as "1234"
    And  I click on submit button of landing count
    Then  I verify pop up error message as "Info!" "Please enter mandatory details."
    And  I click on ok button


  Scenario: Verify error message for mandatory fields when only non mandatory fields are filled in landing count form
    And  I enter comment of more than four hundred words and verify three hundred words have been accepted
    And  I enter long rain gauge string and verify 16 digit has been accepted
    And  I click on submit button of landing count
    Then  I verify pop up error message as "Info!" "Please enter mandatory details."
    And  I click on ok button
    And  I click on cancel button
    And  I click on continue button of cancelling form submission

  Scenario: Verfication of  cancel button functionality in landing count form
    And  I click on record activity button to select landing count activity and then landing site
    And  I set date and time
    And  I enter landing rate as "1234"
    And  I enter comment of more than four hundred words and verify three hundred words have been accepted
    And  I set valid finish date and time
    And  I enter long rain gauge string and verify 16 digit has been accepted
    And  I click on cancel button landing count
    Then  I verify pop up error message as "Warning!" "All your input data will be lost. Do you want to continue?"
    And  I click on continue button of cancelling form submission
    And  I close app











