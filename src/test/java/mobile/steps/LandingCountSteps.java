package mobile.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import mobile.pages.LandingCountPage;
import mobile.pages.LoginPage;
import mobile.pages.TraptypePage;
import mobile.utilities.I;

public class LandingCountSteps {

    LandingCountPage landingCountPage;
    TraptypePage traptypePage;

    @And("^I set date and time$")
    public void iSetDateAndTime()
    {
       landingCountPage.date();
       landingCountPage.time();

    }

    @And("^I enter comment of more than four hundred words and verify three hundred words have been accepted$")
    public void iEnterCommentOfMoreThanFourHundredWordsAndVerifyThreeHundredWordsHaveBeenAccepted() throws InterruptedException {
        Thread.sleep(1);
        I.scrollDown();
        landingCountPage.commentField();    }

    @And("^I set valid finish date and time$")
    public void iSetValidFinishDateAndTime()
    {
        landingCountPage.validFinishdate();
    }

    @And("^I enter long rain gauge string and verify (\\d+) digit has been accepted$")
    public void iEnterLongRainGaugeStringAndVerifyDigitHasBeenAccepted(int arg0)
    {
        landingCountPage.rainGaugefield();
    }

    @And("^I click on submit button of landing count$")
    public void iClickOnSubmitButtonOfLandingCount()
    {
        landingCountPage.submit();
    }


    @And("^I enter landing rate as \"([^\"]*)\"$")
    public void iEnterLandingRateAs(String landingRate)
    {
        landingCountPage.landingRateValue(landingRate);

    }

    @And("^I click on cancel button landing count$")
    public void iClickOnCancelButtonLandingCount()
    {
        LandingCountPage.cancelBtn();
    }


    @And("^I click on record activity button to select landing count activity and then landing site$")
    public void iClickOnRecordActivityButtonToSelectLandingCountActivityAndThenLandingSite()
    {
        LoginPage.loader();
        traptypePage.recordActivityBtn();
        landingCountPage.recordActivityelandingCount();
        traptypePage.sites();


    }


}
