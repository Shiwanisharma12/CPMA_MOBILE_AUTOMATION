Feature: QA activity scenarios automation

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
#    And  I click on record activity button to select QA activity and then QA activity site

  Scenario Outline: I successfully submit the QA Activity form

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
    And  I click on record activity button to select QA activity and then QA activity site

    When  I select site type
    And   I fill positive dips value and negative dips values as "<positive dips>" and "<negative dips>" respectively
    And   I fill total acres field as "<total acres>" and acres breeding as "<acres breeding>"
    And   I select values of breeding potential ,fish present field,moving water field,evidence of water field
    And   I select all the options of mosquito habitat indicators
    And   I fill "<potential value 1>","<value #1>","<potential value 2>","<value #2>","<site potential>" fields
    And   I select values of larvae present field,larvae inside treated area field,larvae outside treated area field,rason larvae present,water present,movement1,"<moving>"field
    And   I select all the options of soil conditions,water source and water conditions and select value of how long water present field
    And   I select values of aquatic Organisms,vegetation,source reduction methods,adult activity,activity taken
    And  I click on submit button to submit site visit
    Then  I verify pop up error message as "Info!" "Feature saved successfully."
    And  I click on ok button
    Examples:
      | positive dips | negative dips | total acres | acres breeding | potential value 1 | value #1 | potential value 2 | value #2 | site potential | moving |
      | 6             | 2             | 2.1         | 1.2            | 2                 | 4        | 6                 | 7        | 8              | 10     |


  Scenario Outline:I successfully submit the Larva count form
    And  I click on record activity button to select QA activity and then QA activity site

    When I click on larvae count tab
    When I select species type larvae count form
    And  I enter "<stage1>" count in stage one field
    And  I enter "<stage2>" count in stage two field
    And  I enter "<stage3>" count in stage three field
    And  I enter "<stage4>" count in stage four field
    And  I enter "<pupa>" count in pupa field
    And  I enter "<egg>" count in egg field
    And  I enter comment of more than 300 characters and verify 250 characters have been accepted in lavae count form
    And  I click on submit button to submit site visit
    Then  I verify pop up error message as "Info!" "Larva Count data submitted"
    And  I click on ok button

    Examples:
      | stage1 | stage2 | stage3 | stage4 | pupa | egg |
      | 10     | 15     | 20     | 25     | 30   | 35  |


  Scenario Outline: I Verify all the error messages in larvae count form
    When I click on larvae count tab
    When I select species type larvae count form
    And  I enter "<stage1>" count in stage one field
    Then  I verify pop up error message as "Info!" "You can enter upto 32767"
    And  I click on okay button
    And  I enter "<stage2>" count in stage two field
    Then  I verify pop up error message as "Info!" "You can enter upto 32767"
    And  I click on okay button
    And  I enter "<stage3>" count in stage three field
    Then  I verify pop up error message as "Info!" "You can enter upto 32767"
    And  I click on okay button
    And  I enter "<stage4>" count in stage four field
    Then  I verify pop up error message as "Info!" "You can enter upto 32767"
    And  I click on okay button
    And  I enter "<pupa>" count in pupa field
    Then  I verify pop up error message as "Info!" "You can enter upto 32767"
    And  I click on okay button
    And  I enter "<egg>" count in egg field
    And  I verify pop up error message as "Info!" "You can enter upto 32767"
    And  I click on okay button
    And  I click on cancel button
    Then  I verify pop up error message as "Warning!" "All your input data will be lost. Do you want to continue?"
    And  I click on continue button of cancelling form submission
    Examples:
      | stage1  | stage2  | stage3  | stage4  | pupa    | egg     |
      | 1234567 | 1234567 | 1234567 | 1234567 | 1234567 | 1234567 |

  Scenario Outline: I successfully fill observation form
    When  I click on observation tab
    And   I select product type
    And   I enter "<quantity floating>"in quantity floating field
    And   I enter "<quantity sunk>"in quantity sunk field
    And   I enter "<quantity dry>"in quantity dry field
    And   I enter "<ground visible>"in ground visible field
    And   I select larvae field value
    And   I enter "<percentage coverage>"in percentage coverage field
    And   I enter "<Acres treated>" in acres treated field
    And   I enter "<Acres not treated>" in acres not treated field
    And   I enter comment of more than 300 characters and verify 250 characters have been accepted in product on=bservation field
    And  I click on submit button to submit site visit
    Then  I verify pop up error message as "Info!" "Product Observation data submitted"
    And  I click on ok button

    Examples:
      | quantity floating | quantity sunk | quantity dry | ground visible | percentage coverage | Acres treated | Acres not treated |
      | 10                | 20            | 30           | 40             | 50                  | 60            | 70                |


  Scenario Outline: I verify all the error messages of observation form
    When  I click on observation tab
    And   I select product type
    And   I enter "<quantity floating>"in quantity floating field
    Then   I verify pop up error message as "Info!" "You can enter upto 32767"
    And   I click on okay button
    And   I enter "<quantity sunk>"in quantity sunk field
    Then   I verify pop up error message as "Info!" "You can enter upto 32767"
    And   I click on okay button
    And   I enter "<quantity dry>"in quantity dry field
    Then   I verify pop up error message as "Info!" "You can enter upto 32767"
    And   I click on okay button
    And   I enter "<ground visible>"in ground visible field
    Then   I verify pop up error message as "Info!" "You can enter upto 32767"
    And   I click on okay button
    And   I enter "<percentage coverage>"in percentage coverage field
    Then   I verify pop up error message as "Info!" "You can enter upto 32767"
    And   I click on okay button
    And   I click on cancel button
    Then   I verify pop up error message as "Warning!" "All your input data will be lost. Do you want to continue?"
    And   I click on continue button of cancelling form submission

    Examples:
      | quantity floating | quantity sunk | quantity dry | ground visible | percentage coverage |
      | 98765555          | 98765555      | 98765555     | 98765555       | 98765555            |





