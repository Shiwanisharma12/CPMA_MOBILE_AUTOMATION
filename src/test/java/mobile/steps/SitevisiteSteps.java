package mobile.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import mobile.pages.LoginPage;
import mobile.pages.SitevisitPage;
import mobile.pages.TraptypePage;
import mobile.utilities.I;

public class SitevisiteSteps {
    SitevisitPage sitevisitPage;
    I i;
    TraptypePage traptypePage;

    @And("^I select habitat more than allowed limit$")
    public void iSelectHabitatMoreThanAllowedLimit() {
        sitevisitPage.habitat();
    }

    @And("^I navigate back$")
    public void iNavigateBack() {
        I.navigateBack();
    }

    @And("^I select container values more than limit$")
    public void iSelectContainerValuesMoreThanLimit() {
        sitevisitPage.containerField();

    }

    @And("^I select condition type$")
    public void iSelectConditionType() {
        sitevisitPage.conditionField();
    }


    @And("^I click on okay button$")
    public void iClickOnOkayButton() {
        sitevisitPage.okay();
    }

    @And("^I click on submit button to submit site visit$")
    public void iClickOnSubmitButtonToSubmitSiteVisit() {
        I.scrollDown();
        sitevisitPage.submit();
        LoginPage.loader();
    }

    @And("^I click on no button$")
    public void iClickOnNoButton() {
        sitevisitPage.treatmentNo();
        LoginPage.loader();
    }

    @And("^I click on tools button$")
    public void iClickOnToolsButton() {
        LoginPage.loader();
        sitevisitPage.tools();
    }

    @And("^I click on truck inventory and get altsoid pellets quantity value$")
    public void iClickOnTruckInventoryAndGetAltsoidPelletsQuantityValue() {
        sitevisitPage.truckInventory();
        sitevisitPage.altsoidPelletsquantity();
    }

    @And("^I click on treatment tab$")
    public void iClickOnTreatmentTab() {
        I.scrollDown();
        sitevisitPage.treatmentTab();
        LoginPage.loader();

    }

    @And("^I fill product field of form$")
    public void iFillProductFieldOfForm() {
        sitevisitPage.product();

    }


    @And("^I fill acres Treated and treated acres field value as \"([^\"]*)\"$")
    public void iFillAcresTreatedAndTreatedAcresFieldValueAs(String value) {
        sitevisitPage.acrestreatedAndtreatedAcresfield(value);

    }

    @And("^I fill method field$")
    public void iFillMethodField() {

        I.scrollDown();
        sitevisitPage.methodField();

    }

    @And("^I fill all the remaining fields of form$")
    public void iFillAllTheRemainingFieldsOfForm() {
        sitevisitPage.equipmentField();
        sitevisitPage.treatmentCommentfield();
        sitevisitPage.averageTemperature();
        sitevisitPage.windSpeedfield();
        sitevisitPage.windDirection();
        sitevisitPage.treatmentFinisdate();
    }

    @And("^I click on calculator tab$")
    public void iClickOnCalculatorTab() {
        I.scrollDown();
        sitevisitPage.calculatorTab();

    }

    @And("^I click on continue button for treatment form$")
    public void iClickOnContinueButtonForTreatmentForm() {
        sitevisitPage.comtinueSubmitform();
    }


    @And("^I click on ok button to clear quantiy in treatment form$")
    public void iClickOnOkButtonToClearQuantiyInTreatmentForm() {
        sitevisitPage.okClearquantity();
    }

    @And("^I click on done button$")
    public void iClickOnDoneButton() {
        I.scrollDown();
        sitevisitPage.doneTreatmentform();
    }

    @And("^I click on yes button$")
    public void iClickOnYesButton() {
        sitevisitPage.treatmentYes();
    }


    @And("^I click on truck inventory and verify altsoid pellets quantity decucted to \"([^\"]*)\"$")
    public void iClickOnTruckInventoryAndVerifyAltsoidPelletsQuantityDecuctedTo(double value) {
        LoginPage.loader();
        sitevisitPage.truckInventory();
        sitevisitPage.truckInventorychangedQuantity(value);

    }

    @And("^I click on record activity button to select site visit activity and then select site$")
    public void iClickOnRecordActivityButtonToSelectSiteVisitActivityAndThenSelectSite() {
        LoginPage.loader();
        traptypePage.recordActivityBtn();
        sitevisitPage.siteVisitrecordActivity();
        LoginPage.loader();
        sitevisitPage.firstSite();

    }

    @And("^I click on okay button to close the popup error$")
    public void iClickOnOkayButtonToCloseThePopupError() {
        sitevisitPage.okayClosepopup();
    }

    @And("^I click on samples tab of site visit$")
    public void iClickOnSamplesTabOfSiteVisit() {
        I.scrollDown();
        sitevisitPage.sampleTab();
    }

    @And("^I fill enter sample id as \"([^\"]*)\"$")
    public void iFillEnterSampleIdAs(String sampleId) {
        sitevisitPage.sampleId(sampleId);
    }

    @And("^I select container type value$")
    public void iSelectContainerTypeValue() {
        sitevisitPage.containerTypefield();
        sitevisitPage.containerTypevalue();
    }


    @And("^I select field species value more than allowed limit$")
    public void iSelectFieldSpeciesValueMoreThanAllowedLimit() {
        sitevisitPage.fieldSpecies();
    }

    @And("^I add comment in comment field of sample form$")
    public void iAddCommentInCommentFieldOfSampleForm() {
        I.scrollDown();
        sitevisitPage.commentFieldsampleForm();
    }

    @And("^I enter larvae count value as \"([^\"]*)\"$")
    public void iEnterLarvaeCountValueAs(String count) {
        sitevisitPage.larvaeCountsampleForm(count);
    }

    @And("^I click on submit button to submit sample form$")
    public void iClickOnSubmitButtonToSubmitSampleForm() {
        I.scrollDown();
        sitevisitPage.submitSampleform();
    }

    @And("^I verify pop up quantity error message as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyPopUpQuantityErrorMessageAs(String Info, String message) {
        traptypePage.infoText(Info);
        sitevisitPage.quantityErrormsgVerification(message);
    }

    @And("^I click on cancel button to clear quantiy in treatment form$")
    public void iClickOnCancelButtonToClearQuantiyInTreatmentForm() {
        sitevisitPage.cancelCleartreatmentForm();
    }

    @And("^I click on calculate button to calculate value$")
    public void iClickOnCalculateButtonToCalculateValue() {
        sitevisitPage.calculate();

    }

    @And("^I enter value in dips field as \"([^\"]*)\"and \"([^\"]*)\"$")
    public void iEnterValueInDipsFieldAsAnd(String dipsValue, String larvaeCount) {
        sitevisitPage.dipsField(dipsValue);
        sitevisitPage.larvaeCount(larvaeCount);
        I.scrollDown();
    }

    @And("^I select larval and action stages$")
    public void iSelectLarvalAndActionStages() {
        sitevisitPage.larvalStages();
        sitevisitPage.Action();
    }

    @And("^I add comment and finish date in respective fields$")
    public void iAddCommentAndFinishDateInRespectiveFields() {
        sitevisitPage.commentField();
        I.scrollDown();
        sitevisitPage.finishDate();
    }

    @And("^I enter value in dips field as \"([^\"]*)\"$")
    public void iEnterValueInDipsFieldAs(String dipsValue) {
        sitevisitPage.dipsField(dipsValue);
    }

    @And("^I fill value in larvae field as \"([^\"]*)\"$")
    public void iFillValueInLarvaeFieldAs(String larvaeCount) {
        sitevisitPage.larvaeCount(larvaeCount);
        I.scrollDown();
    }


    @And("^I fill area treated value as \"([^\"]*)\"$")
    public void iFillAreaTreatedValueAs(String area) {
        sitevisitPage.areaTreatedTreatment(area);

    }

    @And("^I enter rate as \"([^\"]*)\"$")
    public void iEnterRateAs(String rate) {
        sitevisitPage.rate(rate);
        I.scrollDown();
    }


    @And("^I verify calculate area is \"([^\"]*)\"divided by \"([^\"]*)\"$")
    public void iVerifyCalculateAreaIsDividedBy(String quantity, String rate) {
        sitevisitPage.calculatedArea(quantity, rate);
    }

    @And("^I verify calculated quantity is product of \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iVerifyCalculatedQuantityIsProductOfAnd(String area, String rate) {
        sitevisitPage.calculatedQuantity(area, rate);

    }

    @And("^I fill treatment form quantity field value as \"([^\"]*)\"$")
    public void iFillTreatmentFormQuantityFieldValueAs(String qty) {
        sitevisitPage.treatmentQuantityfield(qty);
//        I.scrollDown();
    }

    @And("^I fill calculator quantity field value as \"([^\"]*)\"$")
    public void iFillCalculatorQuantityFieldValueAs(String quantity) {
        sitevisitPage.quantityFieldcalculator(quantity);
        I.scrollDown();
    }
}
