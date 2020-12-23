package mobile.steps;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobile.pages.LoginPage;
import mobile.pages.TraptypePage;
import mobile.utilities.I;

import java.io.FileReader;
import java.util.Properties;

public class LoginStep {

    boolean loginStatus = true;

    FileReader fileReader = null;
    static String UserType = I.getValueFromProperty("mobile", "userType");


    @When("^I click on login button$")
    public void iClickOnLoginButton() throws InterruptedException {
        if (!loginStatus) {

            Thread.sleep(3);
            LoginPage.loginBtn();
        }
    }


    @And("^I click on SignIn Button$")
    public void iClickOnSignInButton() throws InterruptedException {

        Thread.sleep(5);
        LoginPage.signIn();
        LoginPage.loader();
    }

    @And("^I close app$")
    public void iCloseApp() {
        LoginPage.closeapp();
    }

    @And("^I verify select group field$")
    public void iVerifySelectGroupField() throws InterruptedException {

        Thread.sleep(1);
        LoginPage.loader();
        LoginPage.selectGroup();
    }

    @Then("^error message is displaying as \"([^\"]*)\"$")
    public void errorMessageIsDisplayingAs(String message) {
    }

    @When("^I lauch app$")
    public void iLauchApp() {
        LoginPage.launchapp();
    }


    @Given("^I verify user is not logged in$")
    public void iVerifyUserIsNotLoggedIn() {
        if (loginStatus) {
            loginStatus = false;
        }
    }


    @Then("^I see frontier precision logo$")
    public void iSeeFrontierPrecisionLogo() {
        LoginPage.fsLogo();
    }

    @And("^I see FS GIS for mosquito control logo$")
    public void iSeeFSGISForMosquitoControlLogo() {
        LoginPage.fslogoGis();
    }

    @And("^I see Login button$")
    public void iSeeLoginButton() {
        LoginPage.seeLoginbutton();
    }

    @And("^I see enterprise login button$")
    public void iSeeEnterpriseLoginButton() {
        LoginPage.seeEnterpriseloginBtn();
    }

    @Then("^I see username field$")
    public void iSeeUsernameField() {
        LoginPage.userNamedisplay();
    }

    @And("^I see password field$")
    public void iSeePasswordField() {
        LoginPage.passwordDisplay();
    }

    @And("^I see signIn button$")
    public void iSeeSignInButton() {
        LoginPage.signIndisplay();
    }

    @And("^I see cancel button$")
    public void iSeeCancelButton() {
        LoginPage.cancelBtnDisplay();

    }


    @And("^I see forgot username link$")
    public void iSeeForgotUsernameLink() {
        LoginPage.forgotUsernameLink();
    }

    @And("^I see forgot password link$")
    public void iSeeForgotPasswordLink() {
        LoginPage.forgoPasswordLink();
    }

    @When("^I see pick file button$")
    public void iSeePickFileButton() {
        LoginPage.pickupFiledisplay();
    }

    @When("^I click on setting icon$")
    public void iClickOnSettingIcon() {
        LoginPage.settingIcon();
    }

    @And("^I see enterprise portal configuration$")
    public void iSeeEnterprisePortalConfiguration() {
        LoginPage.enterpriseScreen();
    }

    @And("^I see portal URL field$")
    public void iSeePortalURLField() {
        LoginPage.portalUrldisplay();
    }

    @And("^I see client ID field$")
    public void iSeeClientIDField() {
        LoginPage.clientIdfieldDisplay();
    }

    @And("^I see client secret field$")
    public void iSeeClientSecretField() {
        LoginPage.clientSecretDisplay();
    }

    @And("^I see redirect URI$")
    public void iSeeRedirectURI() {
        LoginPage.redirectUrldisplay();
    }

    @And("^I see save button$")
    public void iSeeSaveButton() {
        LoginPage.saveBtndisplay();

    }

    @And("^I see clear button$")
    public void iSeeClearButton() {
        LoginPage.clearButtonDisplay();
    }

    @And("^I see cancel button of portal screen$")
    public void iSeeCancelButtonOfPortalScreen() {
        LoginPage.cancelPortalscreenBtn();
    }

    @When("^I click on i icon$")
    public void iClickOnIIcon() {
        LoginPage.infoIconclick();

    }

    @Then("^I see FSlogo$")
    public void iSeeFSlogo() {
        LoginPage.fsLogo();
    }

    @And("^I see FS MobileVersion$")
    public void iSeeFSMobileVersion() {
        LoginPage.mobileVersion();
    }

    @And("^I see crossPlatform app version$")
    public void iSeeCrossPlatformAppVersion() {
        LoginPage.appVersion();
    }

    @And("^I see build no$")
    public void iSeeBuildNo() {
        LoginPage.buildNo();
    }

    @And("^I see build date$")
    public void iSeeBuildDate() {
        LoginPage.buildDate();
    }

    @And("^I see the text$")
    public void iSeeTheText() {
        LoginPage.textConfigure();
    }

    @And("^I see support desk$")
    public void iSeeSupportDesk() {
        LoginPage.supportDesk();
    }

    @And("^I see back arrow$")
    public void iSeeBackArrow() {
        LoginPage.backArrow();
    }

    @And("^I see github,facebook,google,apple link$")
    public void iSeeGithubFacebookGoogleAppleLink() {

        if (UserType.equals("user")) {
            LoginPage.links();
        }
    }

    @And("^I redirect to github page after clicking on github icon$")
    public void iRedirectToGithubPageAfterClickingOnGithubIcon() {
        LoginPage.githubRedirection();

    }


    @And("^I redirect to facebook page after clicking on facebook icon$")
    public void iRedirectToFacebookPageAfterClickingOnFacebookIcon() {
        LoginPage.facebookRedirection();

    }

    @And("^I redirect to google page after clicking on google icon$")
    public void iRedirectToGooglePageAfterClickingOnGoogleIcon() {
        LoginPage.googleRedirection();
    }

    @And("^And I redirect to apple page after clicking on apple icon$")
    public void andIRedirectToApplePageAfterClickingOnAppleIcon() {
        LoginPage.appleRedirection();
    }

    @Then("^I see FSlogo on info screen$")
    public void iSeeFSlogoOnInfoScreen() {
        LoginPage.fslogoInfoscreen();
    }

    @And("^I see forgot username link and see forgot password link$")
    public void iSeeForgotUsernameLinkAndSeeForgotPasswordLink() {
        if (UserType.equals("user")) {
            LoginPage.forgoPasswordLink();
            LoginPage.forgotUsernameLink();
        }
        if (UserType.equals("Enterprise")) {
            LoginPage.forgoEnterprisepasswordLink();
        }
    }

    @When("^I click on question mark icon$")
    public void iClickOnQuestionMarkIcon() {
        if (UserType.equals("user")) {
            LoginPage.questionMark();
        }
    }


    @Then("^I verify question mark screen elements$")
    public void iVerifyQuestionMarkScreenElements() {
        if (UserType.equals("user")) {
            LoginPage.questionMarkselements();
        }
    }

    @And("^I click on forgot username$")
    public void iClickOnForgotUsername() {
        if (UserType.equals("user")) {
            LoginPage.forgotUsername();
        }
    }

    @And("^I enter incorrect email in email field$")
    public void iEnterIncorrectEmailInEmailField() {
        if (UserType.equals("user")) {
            LoginPage.forgotUsernameemail();
        }
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {

        if (UserType.equals("user")) {
            LoginPage.continueBtn();
        }
        if (UserType.equals("Enterprise")) {
            LoginPage.enterpriseContinueBtn();
        }
    }

    @Then("^I see error message as \"([^\"]*)\"$")
    public void iSeeErrorMessageAs(String errorMsg) {
        if (UserType.equals("user")) {
            LoginPage.forgotUsernameIncorrectemail(errorMsg);
        }

    }

    @And("^I send white spaces in email field$")
    public void iSendWhiteSpacesInEmailField() {
        if (UserType.equals("user")) {
            LoginPage.whiteSpaces();
        }

    }

    @And("^I see error message in white space case  as \"([^\"]*)\"$")
    public void iSeeErrorMessageInWhiteSpaceCaseAs(String errorMessage) {
        if (UserType.equals("user")) {
            LoginPage.whiteSpaceErrorMessage(errorMessage);
        }

    }

    @And("^I click on forgot password$")
    public void iClickOnForgotPassword() {
        if (UserType.equals("user")) {
            LoginPage.forgotPw();
        }
        if (UserType.equals("Enterprise")) {
            LoginPage.enterpriseForgotpw();
        }

    }

    @And("^I enter username  in username field$")
    public void iEnterUsernameInUsernameField() {
        if (UserType.equals("user")) {
            LoginPage.usernameForgotpw();
        }
        if (UserType.equals("Enterprise")) {
            LoginPage.usernameEnterpriseforgotPw();
        }
    }

    @Then("^I see message as \"([^\"]*)\"$")
    public void iSeeMessageAs(String message) {
        if (UserType.equals("user")) {
            LoginPage.forgotPwsuccessfulMessage(message);
        }

    }

    @Then("^I see error popup with message \"([^\"]*)\"$")
    public void iSeeErrorPopupWithMessage(String message) {
        if (UserType.equals("Enterprise")) {
            LoginPage.errorPopup();
            LoginPage.enterpriseErrormessage(message);
            LoginPage.enterpriseErrorok();

        }
    }

    @And("^I verify validation message as \"([^\"]*)\"$")
    public void iVerifyValidationMessageAs(String validationMessage) {

        if (UserType.equals("user")) {
            LoginPage.selectGroupWebmapValidation(validationMessage);
        }
        if (UserType.equals("Enterprise")) {
            LoginPage.EnterpriseSelectgroupWebmapvalidation(validationMessage);

        }

    }

    @And("^I click on submit button$")
    public void iClickOnSubmitButton() {

        if (UserType.equals("user")) {

            LoginPage.submit();
        }
        if (UserType.equals("Enterprise")) {
            LoginPage.enterpriseSubmit();
        }
    }

    @And("^I see the zone$")
    public void iSeeTheZone() {
        LoginPage.seeZone();
    }

    @And("^I see the vehicle$")
    public void iSeeTheVehicle() {
        LoginPage.seeVehicle();
    }

    @And("^I click on forgot username continue button$")
    public void iClickOnForgotUsernameContinueButton() {
        if (UserType.equals("user")) {
            LoginPage.continueBtn();
        }

    }

    @Then("^I see message as \"([^\"]*)\"or in case of enterprise \"([^\"]*)\"$")
    public void iSeeMessageAsOrInCaseOfEnterprise(String message, String enterpriseMessage) {
        if (UserType.equals("user")) {
            LoginPage.forgotPwsuccessfulMessage(message);


        }
        if (UserType.equals("Enterprise")) {
            LoginPage.errorPopup();
            LoginPage.enterpriseErrormessage(enterpriseMessage);
            LoginPage.enterpriseErrorok();


        }
    }

    @And("^I verify empty zone vehicle error message as \"([^\"]*)\"$")
    public void iVerifyEmptyZoneVehicleErrorMessageAs(String errroMessage) {
        LoginPage.emptyZonevehicleErrormessage(errroMessage);
    }


    @And("^I verify empty vehicle error message as \"([^\"]*)\"$")
    public void iVerifyEmptyVehicleErrorMessageAs(String message) {
        LoginPage.emptyVehicleerrorMsg(message);
    }

    @And("^I verify empty zone error message as \"([^\"]*)\"$")
    public void iVerifyEmptyZoneErrorMessageAs(String message) {
        LoginPage.emptyZoneerrorMsg(message);
    }

    @When("^I enter valid credentials$")
    public void iEnterValidCredentials() throws InterruptedException {
        LoginPage.loader();
        LoginPage.email();
        Thread.sleep(2);
        LoginPage.password();

    }

    @When("^I enter Invalid credentials as \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterInvalidCredentialsAs(String invalidEmail, String invalidPassword)
    {
        LoginPage.Invalidemail(invalidEmail);
        LoginPage.invalidPassword(invalidPassword);
    }

    @And("^I verify error message as \"([^\"]*)\"$")
    public void iVerifyErrorMessageAs(String message)
    {
        LoginPage.errorMessage(message);

    }

    @And("^I verify error message for blank username as \"([^\"]*)\"$")
    public void iVerifyErrorMessageForBlankUsernameAs(String blankUsername)
    {
        LoginPage.blankUNerror(blankUsername);

    }

    @And("^I verify error message for blank password as \"([^\"]*)\"$")
    public void iVerifyErrorMessageForBlankPasswordAs(String blankPassword)
    {
        LoginPage.blankPwderror(blankPassword);

    }

    @And("^I select zone value$")
    public void iSelectZoneValue()
    {
        LoginPage.zoneValue();
    }

    @And("^I select the vehicle$")
    public void iSelectTheVehicle()
    {
        TraptypePage.vehichle();
    }
}
