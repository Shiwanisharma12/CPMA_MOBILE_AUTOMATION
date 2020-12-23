package mobile.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobile.pages.LoginPage;
import mobile.pages.TraptypePage;
import mobile.utilities.I;

public class TraptypeSteps {

    TraptypePage traptypePage;
    static String UserType = I.getValueFromProperty("mobile", "userType");


    @And("^I select the technician type$")
    public void iSelectTheTechnicianType() {
        traptypePage.technician();
    }


    @And("^I click on Go button$")
    public void iClickOnGoButton() {

        traptypePage.go();
    }


    @And("^I click on Sewer Ponds$")
    public void iClickOnSewerPonds() {
        traptypePage.sewerPonds();

    }

    @And("^I select Trap type$")
    public void iSelectTrapType() {
        traptypePage.mandatoryTraptype();
    }

    @And("^I select BG Counter as trap data$")
    public void iSelectBGCounterAsTrapData() {
        traptypePage.bgCounter();
    }

    @And("^I select Trap acivity type$")
    public void iSelectTrapAcivityType() {
        traptypePage.mandatoryTrapactivityType();
        traptypePage.retrieve();
        I.scrollDown();
    }

    @And("^I select date$")
    public void iSelectDate() {
        traptypePage.date();
    }

    @And("^I click on submit button to submit trap type$")
    public void iClickOnSubmitButtonToSubmitTrapType() {
        I.scrollDown();
        traptypePage.submitTraptype();

    }

    @And("^I click on ok button$")
    public void iClickOnOkButton() {
        traptypePage.okay();

    }

    @And("^I select the zone$")
    public void iSelectTheZone() {
        traptypePage.zone();
    }

    @And("^I verify pop up error message as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyPopUpErrorMessageAs(String Info, String message) {
        traptypePage.infoText(Info);
        traptypePage.errorMsgverification(message);
    }


    @And("^I fill one mandatory field ie trap activity type$")
    public void iFillOneMandatoryFieldIeTrapActivityType() {
        traptypePage.trapActivitytypeField();

    }

    @And("^I click on cancel button$")
    public void iClickOnCancelButton() {

        traptypePage.cancelBtn();
    }

    @And("^I verify all the fields of trap data and fill all the fields of form$")
    public void iVerifyAllTheFieldsOfTrapDataAndFillAllTheFieldsOfForm() {
        traptypePage.trapStartfield();
        traptypePage.trapTypefield();
        traptypePage.trapConditionfield();
        traptypePage.trapActivitytypeField();
        traptypePage.trapAveragetemperatureField();
        traptypePage.trapWindspeedField();
        traptypePage.trapWinddirectionField();
        traptypePage.trapTyperainGauge();
        traptypePage.trapTypecomment();
        traptypePage.trapTypefinishDate();
        traptypePage.trapTypecancelButton();
    }

    @And("^I submit trap data form$")
    public void iSubmitTrapDataForm() {
        traptypePage.submitTraptype();


    }

    @Then("^I click on continue button of cancelling form submission$")
    public void iClickOnContinueButtonOfCancellingFormSubmission() {
        traptypePage.continueBtn();
    }

    @And("^I set finish date less than start date$")
    public void iSetFinishDateLessThanStartDate() {
        traptypePage.finishDatelessThanstartDate();
    }

    @And("^I verify pop up error message by key \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyPopUpErrorMessageByKey(String warning, String errorKey) {
        traptypePage.infoText(warning);
        traptypePage.messageVerification(errorKey);
        traptypePage.truckContinueBtn();

    }

    @And("^I select group field and webmap value$")
    public void iSelectGroupFieldAndWebmapValue() {
        traptypePage.clickOnselectGroup();
        if (UserType.equals("user")) {
            traptypePage.groupFieldvalue();
        }
        if (UserType.equals("Enterprise")) {
            traptypePage.enterpriseGrroupfieldValue();
        }
        traptypePage.clickOnselectwebMap();

        traptypePage.webMapfieldValue();


    }

    @And("^I click on select group field and select group field value$")
    public void iClickOnSelectGroupFieldAndSelectGroupFieldValue() {
        traptypePage.clickOnselectGroup();
        if (UserType.equals("user")) {
            traptypePage.groupFieldvalue();
        }
        if (UserType.equals("Enterprise")) {
            traptypePage.enterpriseGrroupfieldValue();
        }

    }

    @And("^I select zone and vehicle value$")
    public void iSelectZoneAndVehicleValue() {
        LoginPage.zoneValue();
        traptypePage.vehichle();


    }

    @And("^I click on record activity button to select traptype activity and then trap data site$")
    public void iClickOnRecordActivityButtonToSelectTraptypeActivityAndThenTrapDataSite() {
        LoginPage.loader();
        traptypePage.recordActivityBtn();
        traptypePage.activityTraptype();
        traptypePage.sites();
    }
}
