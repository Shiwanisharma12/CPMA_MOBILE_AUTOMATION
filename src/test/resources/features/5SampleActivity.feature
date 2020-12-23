Feature: sample activity scenarios automation

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
#    And  I click on record activity button to select sample activity and then sample activity site

  Scenario: I successfully fill sample activity form

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
    And  I click on record activity button to select sample activity and then sample activity site

    When I enter sample id of 30 characters and verify only 25 has been accepted
    And  I fill sample type as blood and sample condition as unusable
    And  I select species as chicken and sex type as female
    And  I enter comment of more than 400 characters and verify 250 characters have been accepted
    And  I set finish date
    And  I click on submit button to submit site visit
    Then  I verify pop up error message as "Info!" "Feature saved successfully."
    And  I click on ok button

  Scenario: Cancel button functionality verification for sample activity form

    And  I click on record activity button to select sample activity and then sample activity site
    When I enter sample id of 30 characters and verify only 25 has been accepted
    And  I fill sample type as blood and sample condition as unusable
    And  I select species as chicken and sex type as female
    And  I enter comment of more than 400 characters and verify 250 characters have been accepted
    And  I set finish date
    And  I click on cancel button
    Then  I verify pop up error message as "Warning!" "All your input data will be lost. Do you want to continue?"
    And  I click on continue button of cancelling form submission

  Scenario: Verifying error messages when mandatory fields are not filled  in sample activity form

    And  I click on record activity button to select sample activity and then sample activity site
    And  I click on submit button to submit site visit
    And  I verify pop up error message as "Info!" "Please enter mandatory details."
    And  I click on ok button
    When I enter sample id of 30 characters and verify only 25 has been accepted
    And  I click on submit button to submit site visit
    Then  I verify pop up error message as "Info!" "Please enter mandatory details."
    And  I click on ok button
    And  I click on cancel button
    Then  I verify pop up error message as "Warning!" "All your input data will be lost. Do you want to continue?"
    And  I click on continue button of cancelling form submission


  Scenario: warning pop up verification for start date less than finish date in sample activity form

    And  I click on record activity button to select sample activity and then sample activity site
    When I enter sample id of 30 characters and verify only 25 has been accepted
    And  I fill sample type as blood and sample condition as unusable
    And  I select species as chicken and sex type as female
    And  I enter comment of more than 400 characters and verify 250 characters have been accepted
    And  I set finish date less than start date for site activity form
    Then I verify pop up error message as "Information" "Finish Time can not be less than Start Time"
    And  I click on ok button



