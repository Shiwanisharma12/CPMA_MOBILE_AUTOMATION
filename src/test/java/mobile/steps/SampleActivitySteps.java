package mobile.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import mobile.pages.LoginPage;
import mobile.pages.SampleActivityPage;
import mobile.pages.TraptypePage;
import mobile.utilities.I;


public class SampleActivitySteps {
    TraptypePage traptypePage;
    SampleActivityPage sampleActivityPage;

    @And("^I click on record activity button to select sample activity and then sample activity site$")
    public void iClickOnRecordActivityButtonToSelectSampleActivityAndThenSampleActivitySite() {
        LoginPage.loader();
        traptypePage.recordActivityBtn();
        sampleActivityPage.sampleActivity();
        sampleActivityPage.sampleActivitysite();
    }

    @When("^I enter sample id of (\\d+) characters and verify only (\\d+) has been accepted$")
    public void iEnterSampleIdOfCharactersAndVerifyOnlyHasBeenAccepted(int arg0, int arg1) {
        sampleActivityPage.sampleIdfield();
    }

    @And("^I fill sample type as blood and sample condition as unusable$")
    public void iFillSampleTypeAsBloodAndSampleConditionAsUnusable() {
        sampleActivityPage.sampleTypeField();
        sampleActivityPage.sampleTypevalue();
        sampleActivityPage.sampleConditionfield();
        sampleActivityPage.sampleConditionValur();
    }

    @And("^I select species as chicken and sex type as female$")
    public void iSelectSpeciesAsChickenAndSexTypeAsFemale() {
        sampleActivityPage.selectSpeciesField();
        sampleActivityPage.speciesValue();
        sampleActivityPage.sexTypefield();
        sampleActivityPage.sexTypevalue();
    }

    @And("^I enter comment of more than (\\d+) characters and verify (\\d+) characters have been accepted$")
    public void iEnterCommentOfMoreThanCharactersAndVerifyCharactersHaveBeenAccepted(int arg0, int arg1) {
        sampleActivityPage.sampleActivitycommentField();
        I.scrollDown();

    }

    @And("^I set finish date$")
    public void iSetFinishDate() {
        sampleActivityPage.finishDatefield();
    }

    @And("^I set finish date less than start date for site activity form$")
    public void iSetFinishDateLessThanStartDateForSiteActivityForm()
    {
        sampleActivityPage.finishDatefield();
        I.scrollDown();
        sampleActivityPage.finishDatelessThanstartDate();

    }
}
