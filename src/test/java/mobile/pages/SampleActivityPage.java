package mobile.pages;

import cucumber.api.java.bs.A;
import mobile.utilities.I;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.yecht.Data;

public class SampleActivityPage extends I {
    static String commentText = I.getValueFromProperty("mobile", "commentData");
    private static String sampleActivityrecordActivity = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]\n";
    private static String sampleActivitysite = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView\n";
    private static String sampleIdfield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\n";
    private static String sampleType = "//android.widget.Button[@content-desc=\"Select sample Type. \"]\n";
    private static String sampleTypevalue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String sampleConditionfield = "//android.widget.Button[@content-desc=\"Select samplecond Type. \"]\n";
    private static String sampleConditionValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String selectSpeciesField = "//android.widget.Button[@content-desc=\"Select species Type. \"]\n";
    private static String speciesValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String sexTypefield = "//android.widget.Button[@content-desc=\"Select sex Type. \"]\n";
    private static String sexTypevalue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String commentField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.EditText\n";
    private static String finishDatefield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[6]/android.widget.TextView\n";
    private static String dateField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[5]/android.view.ViewGroup[1]/android.widget.EditText\n";
    private static String dateLess = "//android.view.View[@content-desc=\"10 November 2020\"]\n";
    private static String dateOk = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n";

    public static void sampleActivity() {
        waitFor(1);
        I.clickOnElement(By.xpath(sampleActivityrecordActivity));
    }

    public static void sampleActivitysite() {

        waitFor(1);
        I.clickOnElement(By.xpath(sampleActivitysite));
    }

    public static void sampleIdfield() {

        waitFor(1);
        I.fillField(By.xpath(sampleIdfield), "-12.34@AutomationTesting!@#12.232");
        int text = I.getLength(By.xpath(sampleIdfield));
        Assert.assertEquals(text, 25);


    }

    public static void sampleTypeField() {

        waitFor(1);
        I.clickOnElement(By.xpath(sampleType));

    }

    public static void sampleTypevalue() {

        waitFor(1);
        I.clickOnElement(By.xpath(sampleTypevalue));
    }

    public static void sampleConditionfield() {

        waitFor(1);
        I.clickOnElement(By.xpath(sampleConditionfield));
    }

    public static void sampleConditionValur() {

        waitFor(1);
        I.clickOnElement(By.xpath(sampleConditionValue));
    }

    public static void selectSpeciesField() {

        waitFor(1);
        I.clickOnElement(By.xpath(selectSpeciesField));
    }

    public static void speciesValue() {

        waitFor(1);
        I.clickOnElement(By.xpath(speciesValue));

    }

    public static void sexTypefield() {

        waitFor(1);
        I.clickOnElement(By.xpath(sexTypefield));
    }

    public static void sexTypevalue() {

        waitFor(1);
        I.clickOnElement(By.xpath(sexTypevalue));
    }

    public static void sampleActivitycommentField() {

        waitFor(1);
        I.fillField(By.xpath(commentField), commentText);
        int length = I.getLength(By.xpath(commentField));
        Assert.assertEquals(length, 250);
    }

    public static void finishDatefield() {

        waitFor(1);
        I.clickOnElement(By.xpath(finishDatefield));
    }

    public static void finishDatelessThanstartDate() {

        waitFor(1);
        I.clickOnElement(By.xpath(dateField));
        I.clickOnElement(By.xpath(dateLess));
        I.clickOnElement(By.xpath(dateOk));
    }
}
