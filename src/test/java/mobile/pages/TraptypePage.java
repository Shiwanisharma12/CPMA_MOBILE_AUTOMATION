package mobile.pages;

import mobile.utilities.I;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TraptypePage extends I {


    private static String groupfieldValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]";
    private static String selectGroup = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button";
    private static String webMapfieldValue = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button";
    private static String selectMapfieldValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String technician = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]\n";
    private static String go = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button";
    private static String loading = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ProgressBar";
    private static String recordActivity = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[3]\n";
    //    private static String selectRecordactivityType = "";
    private static String sewerPonds = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
    private static String mandatoryTraptype = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button";
    private static String bgCounter = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]";
    private static String trapActivitytype = "//android.widget.Button[@content-desc=\"Select trapactivity Type. \"]\n";
    private static String retrieve = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]";
    private static String date = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[6]";
    private static String submitTraptype = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView";
    private static String okay = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\n";
    private static String selectZone = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button\n";
    private static String zoneValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String vehicle = "//android.widget.Button[@content-desc=\"Select Vehicle. \"]\n";
    private static String vehicleValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String enterpriseGroupfieldValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView";
    private static String trapDatasites = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
    private static String trapStartdate = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.EditText\n";
    private static String trapStarttime = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.EditText\n";
    private static String trapType = "//android.widget.Button[@content-desc=\"Select trap Type. \"]\n";
    private static String selectTraptypeoption1 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]";
    private static String selectTraptypeoption2 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]";
    private static String selectTraptypeoption3 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]\n";
    private static String selectTraptypeoption4 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]\n";
    private static String selectTraptypeoption5 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]";
    private static String selectTraptypeoption6 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[7]\n";
    private static String trapConditionfield = "//android.widget.Button[@content-desc=\"Select trapcondition Type. \"]\n";
    private static String trapConditiontype1 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String trapConditiontype2 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]\n";
    private static String trapConditiontype3 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]\n";
    private static String trapActivitytype1 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String trapActivitytype2 = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]\n";
    private static String averageTemperature = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText\n";
    private static String windSpeed = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText\n";
    private static String windDirection = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[5]\n";
    private static String rainGauefield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[6]/android.widget.EditText\n";
    private static String trapTypecommentField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[7]/android.widget.EditText\n";
    private static String windDirectionfieldOption = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String TraptypefinishDate = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[8]/android.widget.TextView\n";
    private static String submitButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView\n";
    private static String cancelButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView\n";
    private static String successMessage = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView\n";
    private static String fillAllmandatoryMsg = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView\n";
    private static String infoText = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView\n";
    private static String continueBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n";
    private static String finishDatefield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[7]/android.view.ViewGroup[1]/android.widget.EditText\n";
    private static String finishDate = "//android.view.View[@content-desc=\"03 November 2020\"]\n";
    private static String dateOk = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n";
    private static String truckOk = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n";
    private static String loadingText = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView\n";
    private static String trapTypeactivity = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String recordActivityBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[3]\n";

    static String UserType = I.getValueFromProperty("mobile", "userType");
    static String shorttime = I.getValueFromProperty("mobile", "shortwait");
    static String longTime = I.getValueFromProperty("mobile", "longwait");


    public static String getErrormsgByproperty(String messageKey) {

        return I.getValueFromProperty("mobile", messageKey);


    }

    public static void groupFieldvalue() {
        LoginPage.loader();
        I.clickOnElement(By.xpath(groupfieldValue));
        LoginPage.loader();
        waitFor(3);
    }

    public static void webMapfieldValue() {
        LoginPage.loader();
        waitFor(3);
        I.clickOnElement(By.xpath(selectMapfieldValue));


    }

    public static void clickOnselectGroup() {

        LoginPage.loader();
        LoginPage.loader();
        I.clickOnElement(By.xpath(selectGroup));

    }

    public static void clickOnselectwebMap() {

        LoginPage.loader();
        I.clickOnElement(By.xpath(webMapfieldValue));


    }


    public static void technician() {

        LoginPage.loader();
        I.clickOnElement(By.xpath(technician));
    }


    public static void go() {

        LoginPage.loader();
        waitFor(3);
        I.clickOnElement(By.xpath(go));
        LoginPage.loader();

    }


    public static void sewerPonds() {

        I.clickOnElement(By.xpath(sewerPonds));

    }

    public static void mandatoryTraptype() {

        I.clickOnElement(By.xpath(mandatoryTraptype));


    }

    public static void bgCounter() {

        I.clickOnElement(By.xpath(bgCounter));

    }

    public static void mandatoryTrapactivityType() {

        I.clickOnElement(By.xpath(trapActivitytype));

    }

    public static void retrieve() {

        I.clickOnElement(By.xpath(retrieve));

    }

    public static void date() {

        I.clickOnElement(By.xpath(date));
    }


    public static void submitTraptype() {

        I.clickOnElement(By.xpath(submitTraptype));
        LoginPage.loader();


    }

    public static void okay() {

        waitFor(1);
        I.clickOnElement(By.xpath(okay));
        waitFor(2);

    }

    public static void zone() {

        LoginPage.loader();
        I.clickOnElement(By.xpath(selectZone));
        LoginPage.loader();
        I.clickOnElement(By.xpath(zoneValue));

    }

    public static void vehichle() {
        LoginPage.loader();
        I.clickOnElement(By.xpath(vehicle));
        LoginPage.loader();
        I.clickOnElement(By.xpath(vehicleValue));


    }

    public static void enterpriseGrroupfieldValue() {
        LoginPage.loader();
        I.clickOnElement(By.xpath(enterpriseGroupfieldValue));
        LoginPage.loader();


    }


    public static void trapStartfield() {

        waitFor(1);
        I.seeElemet(By.xpath(trapStartdate));
        I.seeElemet(By.xpath(trapStarttime));

    }

    public static void trapTypefield() {
        waitFor(2);
        I.seeElemet(By.xpath(trapType));
        I.clickOnElement(By.xpath(trapType));
        I.seeElemet(By.xpath(selectTraptypeoption1));
        I.seeElemet(By.xpath(selectTraptypeoption2));
        I.seeElemet(By.xpath(selectTraptypeoption3));
        I.seeElemet(By.xpath(selectTraptypeoption4));
        I.seeElemet(By.xpath(selectTraptypeoption5));
        I.seeElemet(By.xpath(selectTraptypeoption6));
        I.clickOnElement(By.xpath(selectTraptypeoption1));
    }

    public static void trapConditionfield() {
        waitFor(1);
        I.seeElemet(By.xpath(trapConditionfield));
        I.clickOnElement(By.xpath(trapConditionfield));
        I.seeElemet(By.xpath(trapConditiontype1));
        I.seeElemet(By.xpath(trapConditiontype2));
        I.seeElemet(By.xpath(trapConditiontype3));
        I.clickOnElement(By.xpath(trapConditiontype1));


    }

    public static void trapActivitytypeField() {

        waitFor(1);
        I.seeElemet(By.xpath(trapActivitytype));
        I.clickOnElement(By.xpath(trapActivitytype));
        I.seeElemet(By.xpath(trapActivitytype1));
        I.seeElemet(By.xpath(trapActivitytype2));
        I.clickOnElement(By.xpath(trapActivitytype1));
    }

    public static void trapAveragetemperatureField() {
        waitFor(1);
        I.seeElemet(By.xpath(averageTemperature));
        I.fillField(By.xpath(averageTemperature), "98765432109876543210");
        waitFor(1);
        int length = I.getLength(By.xpath(averageTemperature));
        Assert.assertEquals(length, 16);

    }

    public static void trapWindspeedField() {

        waitFor(1);
        I.seeElemet(By.xpath(windSpeed));
        I.fillField(By.xpath(windSpeed), "98765432109876543210");
        waitFor(1);
        int length = I.getLength(By.xpath(windSpeed));
        Assert.assertEquals(length, 16);
        I.scrollDown();


    }

    public static void trapWinddirectionField() {

        waitFor(1);
        I.seeElemet(By.xpath(windDirection));
        I.clickOnElement(By.xpath(windDirection));
        I.seeElemet(By.xpath(windDirectionfieldOption));
        I.clickOnElement(By.xpath(windDirectionfieldOption));
    }

    public static void trapTyperainGauge() {

        waitFor(1);
        I.seeElemet(By.xpath(rainGauefield));
        I.fillField(By.xpath(rainGauefield), "98765432109876543210");
        waitFor(1);
        int length = I.getLength(By.xpath(rainGauefield));
        Assert.assertEquals(length, 16);
    }

    public static void trapTypecomment() {
        waitFor(1);
        I.seeElemet(By.xpath(trapTypecommentField));
        I.fillField(By.xpath(trapTypecommentField), "Comment added successfully");
    }

    public static void trapTypefinishDate() {

        waitFor(1);
        I.seeElemet(By.xpath(TraptypefinishDate));
        I.clickOnElement(By.xpath(TraptypefinishDate));
        I.scrollDown();
    }

    public static void trapTypesubmitButton() {

        waitFor(1);
        I.seeElemet(By.xpath(submitButton));
        I.clickOnElement(By.xpath(submitButton));

    }

    public static void trapTypecancelButton() {

        waitFor(1);
        I.seeElemet(By.xpath(cancelButton));
    }

    public static void trapTypesuccessMessge(String message) {

        waitFor(1);
        I.seeElemet(By.xpath(successMessage));
        String actualMessage = I.getText(By.xpath(successMessage));
        Assert.assertEquals(message, actualMessage);
    }

    public static void errorMsgverification(String message) {

        waitFor(1);
        I.seeElemet(By.xpath(fillAllmandatoryMsg));
        String actualMessage = I.getText(By.xpath(fillAllmandatoryMsg));
        Assert.assertEquals(message, actualMessage);
    }

    public static void infoText(String info) {

        waitFor(1);
        I.seeElemet(By.xpath(infoText));
        String infoVariable = I.getText(By.xpath(infoText));
        Assert.assertEquals(info, infoVariable);
    }

    public static void cancelBtn() {

        waitFor(1);
        I.scrollDown();
        I.seeElemet(By.xpath(cancelButton));
        I.clickOnElement(By.xpath(cancelButton));

    }

    public static void continueBtn() {

        waitFor(1);
        I.seeElemet(By.xpath(continueBtn));
        I.clickOnElement(By.xpath(continueBtn));
    }

    public static void finishDatelessThanstartDate() {

        I.scrollDown();
        finishDatefield();
        finishDate();

    }

    private static void finishDate() {
        waitFor(1);
        I.seeElemet(By.xpath(finishDate));
        I.clickOnElement(By.xpath(finishDate));
        I.clickOnElement(By.xpath(dateOk));

    }

    private static void finishDatefield() {

        waitFor(1);
        I.clickOnElement(By.xpath(finishDatefield));
    }

    public static void messageVerification(String errorKey) {


        waitFor(1);
        I.seeElemet(By.xpath(fillAllmandatoryMsg));
        String text = getErrormsgByproperty(errorKey);
        String actualMessage = I.getText(By.xpath(fillAllmandatoryMsg));
        Assert.assertEquals(actualMessage, text);
    }

    public static void truckContinueBtn() {

        waitFor(1);
        I.seeElemet(By.xpath(truckOk));
        I.clickOnElement(By.xpath(truckOk));

    }

    public static void sites() {

        waitFor(3);
        I.clickOnElement(By.xpath(trapDatasites));
    }

    public static void activityTraptype() {

        waitFor(3);
        I.clickOnElement(By.xpath(trapTypeactivity));
    }

    public static void recordActivityBtn() {

        waitFor(3);
        I.clickOnElement(By.xpath(recordActivityBtn));
    }
}

