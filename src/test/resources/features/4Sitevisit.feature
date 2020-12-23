Feature: site visit scenarios automation

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

  Scenario: I successfully submit site visit form

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

    And  I click on record activity button to select site visit activity and then select site
    And  I select habitat more than allowed limit
    Then I verify pop up error message as "Information" "Habitat-type field length limit has reached."
    And  I click on ok button
    And  I navigate back
    And  I select container values more than limit
    Then  I verify pop up error message as "Information" "Container-type field length limit has reached."
    And  I click on ok button
    And  I navigate back
    And  I select condition type
    And  I enter value in dips field as "123456789"
    Then I verify pop up error message as "Info!" "You can enter upto 32767"
    And  I click on okay button
    And  I enter value in dips field as "1234"
    And  I fill value in larvae field as "1234567890"
    Then  I verify pop up error message as "Info!" "You can enter upto 32767"
    And  I click on okay button
    And  I fill value in larvae field as "1234"
    And  I select larval and action stages
    Then  I verify pop up error message as "Information" "Action-type field length limit has reached."
    And  I click on ok button
    And  I add comment and finish date in respective fields
    Then  I verify pop up error message as "Info!" "Would you like to record a treatment?"
    And  I click on no button
    Then  I verify pop up error message as "Info!" "Feature saved successfully."
    And  I click on ok button


  Scenario Outline: I successfully fill treatment form and calculating area treated by entering quantity and Rate to apply
    And  I click on tools button
    And  I click on truck inventory and get altsoid pellets quantity value
    And  I navigate back
    And  I click on record activity button to select site visit activity and then select site
    And  I select habitat more than allowed limit
    And  I click on ok button
    And  I navigate back
    And  I select container values more than limit
    And  I click on ok button
    And  I navigate back
    And  I select condition type
    And  I enter value in dips field as "<dipsField value>"and "<larvaeField value>"
    And  I select larval and action stages
    And  I click on ok button
    And  I add comment and finish date in respective fields
    Then  I verify pop up error message as "Info!" "Would you like to record a treatment?"
    And  I click on yes button
    And  I fill product field of form
    And  I fill treatment form quantity field value as "123457890"
    Then  I verify pop up quantity error message as "Info!" "Max. available qty. is"
    And  I click on ok button
    And  I fill treatment form quantity field value as "4"
    And  I fill method field
    And  I fill all the remaining fields of form
    And  I click on calculator tab
    And  I fill calculator quantity field value as "1234"
    Then  I verify pop up error message as "Info!" "Sufficient Quantity not available for this Product."
    And  I click on okay button to close the popup error
    And  I fill calculator quantity field value as "<quantity>"
    And  I enter rate as "<rate>"
    And  I click on calculate button to calculate value
    And  I verify calculate area is "<quantity>"divided by "<rate>"
    And  I click on done button
    And  I click on submit button to submit site visit
    Then  I verify pop up error message as "Warning!" "Entered area is more than location area  0.7831acre"
    And  I click on continue button for treatment form
    Then  I verify pop up error message as "Info!" "Treatment data submitted"
    And  I click on ok button
    And  I click on submit button to submit site visit
    Then  I verify pop up error message as "Info!" "Feature saved successfully."
    And  I click on ok button
    And  I click on tools button
    And  I click on truck inventory and verify altsoid pellets quantity decucted to "<quantity>"
    And  I navigate back

    Examples:
      | quantity | rate | dipsField value | larvaeField value |
      | 6        | 2    | 123             | 1234              |

  Scenario Outline:I successfully fill treatment form and calculating quantity by entering area treated and rate to apply
    And  I click on tools button
    And  I click on truck inventory and get altsoid pellets quantity value
    And  I navigate back
    And  I click on record activity button to select site visit activity and then select site
    And  I select habitat more than allowed limit
    And  I click on ok button
    And  I navigate back
    And  I select container values more than limit
    And  I click on ok button
    And  I navigate back
    And  I select condition type
    And  I enter value in dips field as "<dipsField value>"and "<larvaeField value>"
    And  I select larval and action stages
    And  I click on ok button
    And  I add comment and finish date in respective fields
    Then  I verify pop up error message as "Info!" "Would you like to record a treatment?"
    And  I click on yes button
    And  I fill product field of form
    And  I fill treatment form quantity field value as "<value>"
    And  I fill acres Treated and treated acres field value as "1234"
    And  I click on calculator tab
    And  I fill calculator quantity field value as "<value>"
    And  I fill area treated value as "<area>"
    Then  I verify pop up error message as "Info!" "Do you want to clear quantity and calculate based on an Area Treated and Application Rate?"
    And  I click on continue button of cancelling form submission
    And  I enter rate as "1234567890"
    And  I click on calculate button to calculate value
    Then  I verify pop up error message as "Info!" "Please enter the value between low and high range"
    And  I click on okay button
    And  I enter rate as "<rate>"
    And  I click on calculate button to calculate value
    And  I verify calculated quantity is product of "<area>" and "<rate>"
    And  I click on done button
    And  I click on submit button to submit site visit
    Then  I verify pop up error message as "Warning!" "Entered area is more than location area  0.7831acre"
    And  I click on continue button for treatment form
    Then  I verify pop up error message as "Info!" "Treatment data submitted"
    And  I click on ok button
    And  I click on submit button to submit site visit
    Then  I verify pop up error message as "Info!" "Feature saved successfully."
    And  I click on ok button

    Examples:
      | value | dipsField value | larvaeField value | area | rate |
      | 6     | 1234            | 1234              | 10   | 2    |


  Scenario: I successfully submit sample form
    And   I click on record activity button to select site visit activity and then select site
    When  I click on samples tab of site visit
    And   I fill enter sample id as "Automation@123"
    And   I select container type value
    And   I select field species value more than allowed limit
    Then   I verify pop up error message as "Information" "FieldSpecies-type field length limit has reached."
    And   I click on okay button to close the popup error
    And   I enter larvae count value as "12345678"
    And   I verify pop up error message as "Info!" "You can enter upto 32767"
    And   I click on okay button
    And   I enter larvae count value as "1234"
    And   I add comment in comment field of sample form
    And   I click on submit button to submit sample form
    Then   I verify pop up error message as "Info!" "Sample data submitted"
    And   I click on ok button
    And   I click on submit button to submit site visit
    And   I verify pop up error message as "Info!" "Would you like to record a treatment?"
    And   I click on no button
    Then   I verify pop up error message as "Info!" "Feature saved successfully."
    And   I click on ok button
    And   I close app


























