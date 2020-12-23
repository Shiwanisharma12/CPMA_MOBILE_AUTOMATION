package mobile.pages;
import jnr.ffi.annotations.In;
import mobile.utilities.I;
import org.junit.Assert;
import org.openqa.selenium.By;


public class LoginPage extends I
{
    static String UserType = I.getValueFromProperty("mobile", "userType");
    static int shorttime=Integer.parseInt(I.getValueFromProperty("mobile", "shortwait"));
    static int  longTime= Integer.parseInt(I.getValueFromProperty("mobile", "longwait"));




    private static String loginBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button[1]\n";
    private static String usernameField = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.TabWidget/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText\n";
    private static String passwordField = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.TabWidget/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText\n";
    private static String signInbutton = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.TabWidget/android.view.View[2]/android.view.View[1]/android.widget.Button[1]\n";
    private static String selectGroup = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button\n";
    private static String errorMessage = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[1]\n";
    private static String processing = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView";
    private static String blankPwd = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.TabWidget/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.TextView";
    private static String blankUN = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.TabWidget/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.TextView";
    private static String enterpriseLogin = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button[2]\n";
    private static String cancelButton="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.TabWidget/android.view.View[2]/android.view.View[1]/android.widget.Button[2]";
    private static String whiteSpaceerrorMsg="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView";
    private static String forgotUNemail="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText";
    private static String invalidEmailerrorMsg="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView";
    private static String continueBtn="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]";
    private static String forgotUNlink="//android.view.View[@content-desc='Forgot username?']/android.widget.TextView";
    private static String enterpriseForgotPWlink="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TabWidget/android.view.View[2]/android.view.View[2]/android.view.View";
    private static String forgotPwusername="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText";
    private static String enterpriseForgotPwusername="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[4]/android.widget.EditText\n";
    private static String forgotPWlink="//android.view.View[@content-desc='Forgot password?']/android.widget.TextView";
    private static String enterpriseOkay="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button";
    private static String enterpriseConfiguration="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup";
    private static String pickFile="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]";
    private static String filename="com.android.documentsui:id/item_root";
    private static String save= "(//*[@class= \"android.widget.Button\"])[1]";
    private static String cancelPortalscreenBtn="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Button[3]";
    private static String clearBtn="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Button[2]";
    private static String fsLogo="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[1]\n";
    private static String fslogoGis="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]";
    private static String settingIcon="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView[1]";
    private static String enterpriseScreen="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]";
    private static String portalUrl="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]";
    private static String clientId="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[4]";
    private static String clientSecret="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[5]";
    private static String redirectUri="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[6]";
    private static String infoIcon="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView[2]";
    private static String mobileVersion="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]";
    private static String appVersion="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]";
    private static String buildNo="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[3]";
    private static String buildDate="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]";
    private static String textOnconfigureScreen="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";
    private static String backArrow="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageButton";
    private static String supportDesk="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.Button";
    private static String githubLink="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View[1]";
    private static String facebookLink="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View[2]";
    private static String googleLink="//android.view.View[@content-desc=\"Sign in with Google\"]/android.view.View/android.widget.Image";
    private static String appleLink="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View[4]";
    private static String githubPage="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]\n";
    private static String facebookPage="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]\n";
    private static String fslogoInfoscreen="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView";
    private static String questionMark="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.widget.Image";
    private static String fsQuestionmark="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.app.Dialog/android.view.View[1]";
    private static String crossButton="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.app.Dialog/android.view.View[2]";
    private static String developedBy="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.app.Dialog/android.view.View[3]";
    private static String companyName="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.app.Dialog/android.view.View[4]";
    private static String heading="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.TabWidget/android.view.View[2]";
    private static String informationText="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.app.Dialog/android.view.View[7]";
    private static String aeroplane ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Image[2]";
    private static String forgotPwsuccessfulMsg ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]";
    private static String returnTosignIn="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]";
    private static String enterpriseContinuebtn="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button";
    private static String errorPopup="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]\n";
    private static String enterpriseErrormessage="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View";
    private static String enterpriseOk="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.Button";
    private static String textInfo="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView\n";
    private static String emptyGroupwebmapValidationmessage="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView\n";
    private static String emptyGroupwebmapOk="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button";
    private static String submit="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button";
    private static String enterpriseSubmit="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button\n";
    private static String selectZone="//android.widget.Button[@content-desc='Select Zone. ']";
    private static String vehicleValue="//android.widget.Button[@content-desc=\"Select Vehicle. \"]";
    private static String selectZoneveicleErrormsg="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView";
    private static String zoneValue="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]";
    private static String selectVeicleerrorMsg="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView\n";
    private static String emptyZoneerrorMsg="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView";




    public static void loginBtn()
    {
         if (UserType.equals("user"))
        {
            waitFor(3);
            I.seeElemet(By.xpath(loginBtn));
            I.clickOnElement(By.xpath(loginBtn));
            waitFor(2);
            loader();
        }
        else if(UserType.equals("Enterprise"))
       {
           waitFor(3);
            I.clickOnElement(By.xpath(enterpriseLogin));
           waitFor(3);
            LoginPage.uploadFile();
           waitFor(3);
            I.clickOnElement(By.xpath(enterpriseLogin));
       }
    }

    public static void uploadFile() {

        waitFor(3);
        I.clickOnElement(By.xpath(enterpriseOkay));
        I.seeElemet(By.xpath(enterpriseConfiguration));
        I.clickOnElement(By.xpath(pickFile));
        I.clickOnElement(By.id(filename));
        I.clickOnElement(By.xpath(save));

    }
    public static void email() {
        loader();
        String userName = I.getValueFromProperty("mobile", "username");
        waitFor(5);
//        loader();
        I.seeElemet(By.xpath(usernameField));
        I.fillField(By.xpath(usernameField), userName);
    }
    public static void password() {
        waitFor(3);
        String PW = I.getValueFromProperty("mobile", "password");
        waitFor(4);
        I.fillField(By.xpath(passwordField), PW);

    }


    public static void signIn()
    {
        waitFor(5);
        I.clickOnElement(By.xpath(signInbutton));
        waitFor(1);
        waitTillElementIsInvisible(By.xpath("//android.view.View[@content-desc=\"API Reference\"]/android.widget.TextView\n"));
        LoginPage.loader();
    }

    public static void closeapp() {

        waitFor(3);
        I.closeApp();

    }

    public static void submit() {
        waitFor(3);
        waitTillElementIsInvisible(By.xpath(processing));
        I.clickOnElement(By.xpath(submit));
    }

    public static void selectGroup() {

        LoginPage.loader();
        I.seeElemet(By.xpath(selectGroup));
        I.waitTillElementIsInvisible(By.xpath(processing));
    }

    public static void errorMessage(String message) {

        String actualMessage = I.getText(By.xpath(errorMessage));
        Assert.assertEquals(message, actualMessage);
    }

    public static void loader() {

        I.waitTillElementIsInvisible(By.xpath(processing));

    }

    public static void launchapp() {
        I.launchApp();
    }

    public static void blankPwderror(String blankPassword) {

        String actualMessage = I.getText(By.xpath(blankPwd));
        Assert.assertEquals(blankPassword, actualMessage);
    }

    public static void blankUNerror(String blankUsername) {

        String actualMessage = I.getText(By.xpath(blankUN));
        Assert.assertEquals(blankUsername, actualMessage);
    }


    public static void Invalidemail(String invalidEmail) {

        waitFor(3);
        I.fillField(By.xpath(usernameField), invalidEmail);    }

    public static void invalidPassword(String invalidPassword) {
        waitFor(3);
        I.fillField(By.xpath(passwordField), invalidPassword);
    }

    public static void fsLogo() {

        waitFor(3);
        I.seeElemet(By.xpath(fsLogo));
    }

    public static void fslogoGis() {

        waitFor(3);
        I.seeElemet(By.xpath(fslogoGis));
    }

    public static void seeLoginbutton() {

        waitFor(3);
        I.seeElemet(By.xpath(loginBtn));
    }

    public static void seeEnterpriseloginBtn() {

        waitFor(3);
        I.seeElemet(By.xpath(enterpriseLogin));
    }

    public static void userNamedisplay() {

        waitFor(3);
        loader();
        I.seeElemet(By.xpath(usernameField));
    }

    public static void passwordDisplay() {


        waitFor(3);
        I.seeElemet(By.xpath(passwordField));
    }

    public static void signIndisplay() {
        waitFor(3);
        I.seeElemet(By.xpath(signInbutton));
    }

    public static void cancelBtnDisplay() {

        waitFor(3);
        I.seeElemet(By.xpath(cancelButton));
    }

    public static void forgotUsernameLink() {
        waitFor(3);
        I.seeElemet(By.xpath(forgotUNlink));
    }

    public static void  forgoPasswordLink() {

        waitFor(3);
            I.seeElemet(By.xpath(forgotPWlink));

    }

    public static void pickupFiledisplay() {
        waitFor(3);
        I.seeElemet(By.xpath(pickFile));


    }

    public static void settingIcon() {

        waitFor(3);
        I.clickOnElement(By.xpath(settingIcon));
    }


    public static void enterpriseScreen() {

        waitFor(3);
        I.seeElemet(By.xpath(enterpriseScreen));
    }

    public static void portalUrldisplay() {

        waitFor(3);
        I.seeElemet(By.xpath(portalUrl));
    }

    public static void clientIdfieldDisplay() {

        waitFor(3);
        I.seeElemet(By.xpath(clientId));
    }

    public static void clientSecretDisplay() {

        waitFor(3);
        I.seeElemet(By.xpath(clientSecret));
    }

    public static void redirectUrldisplay() {
        waitFor(3);
        I.seeElemet(By.xpath(redirectUri));
    }

    public static void saveBtndisplay() {
        waitFor(3);
        I.seeElemet(By.xpath(save));
    }

    public static void clearButtonDisplay() {

        waitFor(3);
        I.seeElemet(By.xpath(clearBtn));
    }

    public static void cancelPortalscreenBtn() {

        waitFor(3);
        I.seeElemet(By.xpath(cancelPortalscreenBtn));

    }

    public static void infoIconclick() {
        waitFor(3);
        I.seeElemet(By.xpath(infoIcon));
        I.clickOnElement(By.xpath(infoIcon));
    }

    public static void mobileVersion() {

        waitFor(3);
        I.seeElemet(By.xpath(mobileVersion));
    }

    public static void appVersion() {

        waitFor(3);
        I.seeElemet(By.xpath(appVersion));
    }

    public static void buildNo() {
        waitFor(3);
        I.seeElemet(By.xpath(buildNo));
    }

    public static void buildDate() {
        waitFor(3);
        I.seeElemet(By.xpath(buildDate));
    }

    public static void textConfigure() {

        waitFor(3);
        I.seeElemet(By.xpath(textOnconfigureScreen));
    }

    public static void supportDesk() {
        waitFor(3);
        I.seeElemet(By.xpath(supportDesk));
    }

    public static void backArrow() {
        waitFor(3);
        I.seeElemet(By.xpath(backArrow));
    }

    public static void links() {
        waitFor(3);
        I.seeElemet(By.xpath(githubLink));
        I.seeElemet(By.xpath(facebookLink));
        I.seeElemet(By.xpath(googleLink));
        I.seeElemet(By.xpath(appleLink));

    }

    public static void githubRedirection() {

        if (UserType.equals("user")) {
            waitFor(3);
            I.clickOnElement(By.xpath(githubLink));
            I.seeElemet(By.xpath(githubPage));
            I.navigateBack();
        }

    }

    public static void facebookRedirection() {

        if (UserType.equals("user")) {
            waitFor(3);
            I.clickOnElement(By.xpath(loginBtn));
            I.clickOnElement(By.xpath(facebookLink));
            I.seeElemet(By.xpath(facebookPage));
            I.navigateBack();

        }
    }

    public static void googleRedirection() {


        waitFor(3);
        I.clickOnElement(By.xpath(googleLink));
//        I.seeElemet(By.xpath(googlePage));
        I.navigateBack();


    }

    public static void appleRedirection() {


        waitFor(3);
        I.clickOnElement(By.xpath(appleLink));
    }

    public static void fslogoInfoscreen() {
        waitFor(3);
        I.clickOnElement(By.xpath(fslogoInfoscreen));
    }

    public static void questionMark() {

        waitFor(3);
        I.seeElemet(By.xpath(questionMark));
        I.clickOnElement(By.xpath(questionMark));

    }
    public static void questionMarkselements()
    {
        waitFor(3);
        I.seeElemet(By.xpath(fsQuestionmark));
        waitFor(3);
        I.seeElemet(By.xpath(crossButton));
        waitFor(3);
        I.seeElemet(By.xpath(developedBy));
        waitFor(3);
        I.seeElemet(By.xpath(companyName));
        waitFor(3);
        I.seeElemet(By.xpath(heading));
        waitFor(3);
        I.seeElemet(By.xpath(informationText));
    }

    public static void forgoEnterprisepasswordLink() {
        waitFor(3);
        I.seeElemet(By.xpath(enterpriseForgotPWlink));
    }

    public static void forgotUsername() {

        waitFor(3);
        I.clickOnElement(By.xpath(forgotUNlink));
    }

    public static void forgotUsernameemail() {

        waitFor(3);
        I.fillField(By.xpath(forgotUNemail),"!2345^&^&");
    }

    public static void continueBtn() {

        waitFor(3);
        I.clickOnElement(By.xpath(continueBtn));
    }

    public static void forgotUsernameIncorrectemail(String errorMsg) {
        waitFor(3);
        I.seeElemet(By.xpath(invalidEmailerrorMsg));
       String text= I.getText(By.xpath(invalidEmailerrorMsg));
       Assert.assertEquals(text,errorMsg);
    }

    public static void whiteSpaces() {
        waitFor(3);
        I.fillField(By.xpath(forgotUNemail),"     ");

    }

    public static void whiteSpaceErrorMessage(String errorMessage) {

        waitFor(3);
        I.seeElemet(By.xpath(whiteSpaceerrorMsg));
        String text= I.getText(By.xpath(whiteSpaceerrorMsg));
        Assert.assertEquals(text,errorMessage);
    }

    public static void forgotPw() {

        waitFor(3);
        I.clickOnElement(By.xpath(forgotPWlink));
        waitFor(3);


    }

    public static void enterpriseForgotpw() {

        waitFor(3);
        I.clickOnElement(By.xpath(enterpriseForgotPWlink));
        waitFor(3);

    }

    public static void usernameForgotpw() {

        waitFor(3);
        I.fillField(By.xpath(forgotPwusername),"Shiwani@123");
    }

    public static void usernameEnterpriseforgotPw() {

        waitFor(3);
        I.waitTillElementIsInvisible(By.xpath(forgotPWlink));
        I.fillField(By.xpath(enterpriseForgotPwusername),"Shiwani@123");
    }

    public static void enterpriseContinueBtn()
    {
        waitFor(3);
        I.clickOnElement(By.xpath(enterpriseContinuebtn));
    }

    public static void forgotPwsuccessfulMessage(String message) {
        waitFor(3);
        I.seeElemet(By.xpath(aeroplane));
        I.seeElemet(By.xpath(forgotPwsuccessfulMsg));
        I.seeElemet(By.xpath(returnTosignIn));
        String text= I.getText(By.xpath(forgotPwsuccessfulMsg));
        Assert.assertEquals(text,message);
        I.navigateBack();

    }

    public static void errorPopup() {
        waitFor(3);
        I.seeElemet(By.xpath(errorPopup));
    }

    public static void enterpriseErrormessage(String message) {

        I.seeElemet(By.xpath(enterpriseErrormessage));
        String text= I.getText(By.xpath(enterpriseErrormessage));
        Assert.assertEquals(text,message);
    }

    public static void enterpriseErrorok() {
        waitFor(3);
        I.seeElemet(By.xpath(enterpriseOk));


    }

    public static void selectGroupWebmapValidation(String validationMessage)
    {
        I.seeElemet(By.xpath(textInfo));
        I.seeElemet(By.xpath(emptyGroupwebmapValidationmessage));
        String text= I.getText(By.xpath(emptyGroupwebmapValidationmessage));
        Assert.assertEquals(text,validationMessage);
        I.clickOnElement(By.xpath(emptyGroupwebmapOk));



    }

    public static void EnterpriseSelectgroupWebmapvalidation(String validationMessage) {

        I.seeElemet(By.xpath(textInfo));
        I.seeElemet(By.xpath(emptyGroupwebmapValidationmessage));
        String text= I.getText(By.xpath(emptyGroupwebmapValidationmessage));
        Assert.assertEquals(text,validationMessage);
        I.clickOnElement(By.xpath(emptyGroupwebmapOk));
    }

    public static void enterpriseSubmit() {

        waitFor(3);
        waitTillElementIsInvisible(By.xpath(processing));
        waitFor(3);
        I.clickOnElement(By.xpath(enterpriseSubmit));

    }

    public static void seeZone() {

        I.waitTillElementIsInvisible(By.xpath(processing));
        I.seeElemet(By.xpath(selectZone));


    }

    public static void seeVehicle() {

        waitFor(3);
        I.seeElemet(By.xpath(vehicleValue));
    }

    public static void emptyZonevehicleErrormessage(String errroMessage) {

        I.seeElemet(By.xpath(textInfo));
        I.seeElemet(By.xpath(selectZoneveicleErrormsg));
        String text= I.getText(By.xpath(emptyGroupwebmapValidationmessage));
        Assert.assertEquals(text,errroMessage);
        I.clickOnElement(By.xpath(emptyGroupwebmapOk));
    }

    public static void zoneValue() {

        waitFor(3);
        I.clickOnElement(By.xpath(selectZone));
        I.clickOnElement(By.xpath(zoneValue));
    }

    public static void emptyVehicleerrorMsg(String message) {

        I.seeElemet(By.xpath(textInfo));
        I.seeElemet(By.xpath(selectVeicleerrorMsg));
        String text= I.getText(By.xpath(selectVeicleerrorMsg));
        Assert.assertEquals(text,message);
        I.clickOnElement(By.xpath(emptyGroupwebmapOk));
    }

    public static void emptyZoneerrorMsg(String message) {

        waitFor(3);
        I.seeElemet(By.xpath(textInfo));
        I.seeElemet(By.xpath(emptyZoneerrorMsg));
        String text= I.getText(By.xpath(emptyZoneerrorMsg));
        Assert.assertEquals(text,message);
        I.clickOnElement(By.xpath(emptyGroupwebmapOk));


    }

}



