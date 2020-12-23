package mobile.pages;

import jnr.ffi.annotations.In;
import mobile.utilities.I;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class SitevisitPage extends I {

    static String commentText = I.getValueFromProperty("mobile", "commentData");

    static double initialValuealtsoidPellet;
    static int rateToapply;
    static int treatedArea;
//    double finalQuantity= Double.parseDouble(0.00);


    private static String siteVisit = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]";
    private static String firstSite = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup\n";
    private static String habitatField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView\n";
    private static String habitatOneother = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView\n";
    private static String habitatTwocanal = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView\n";
    private static String habitatThreecatchBasin = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView\n";
    private static String habitatFourContainer = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView\n";
    private static String containerField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]\n";
    private static String containterFirstvalueAquarium = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView\n";
    private static String containerSecondvalueFlowerpoint = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";
    private static String containerThirdValuegallonBucket = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView\n";
    private static String conditionField = "//android.widget.Button[@content-desc=\"Select sitecond Type. \"]";
    private static String conditionOptionclean = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]";
    private static String dipsField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText\n";
    private static String larvaeField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.EditText\n";
    private static String stageOne = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String stageTwo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String stageThree = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String stageFour = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[7]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String actionOnetreatment = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String actionTwocoveredContainer = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String actionThreeclearedDebris = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[5]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String actionFourMaintainance = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[7]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String commentField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.EditText\n";
    private static String finishDateField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView\n";
    private static String okay = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\n";
    private static String submitSitevisite = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView";
    private static String treatmentYes = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n";
    private static String treatmentNo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]\n";
    private static String toolsBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[5]\n";
    private static String truckInventory = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]\n";
    private static String altsoidPelletsquantity = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[4]\n";
    private static String treatmentTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView\n";
    private static String productField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button\n";
    private static String productAltsoidpellets = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String quantityField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText\n";
    private static String acresTreatedfield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText\n";
    private static String TreatedAcresfield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.EditText\n";
    private static String methodField = "//android.widget.Button[@content-desc=\"Select method Type. \"]";
    private static String methodFieldValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String selectEquipmentfield = "//android.widget.Button[@content-desc=\"Select equip Type. \"]";
    private static String selectEquipmentfieldValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String commentFieldTreatment = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.EditText\n";
    private static String treatmentAveragetemperature = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[5]/android.widget.EditText\n";
    private static String treatmentWindSpeed = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[6]/android.widget.EditText\n";
    private static String calculatorTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]\n";
    private static String rateField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText\n";
    private static String quantityFieldcalculator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.EditText\n";
    private static String continueBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n";
    private static String treatmentWinddirectionField = "//android.widget.Button[@content-desc=\"Select winddir Type. \"]\n";
    private static String treatmentWinddirectionValue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String treatmentFinishdate = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[6]/android.widget.TextView\n";
    private static String areaTreatedField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText\n";
    private static String okClearquantity = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n";
    private static String doneTreatmentform = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.TextView\n";
    private static String calculateBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.TextView\n";
    private static String sampleTab = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.ImageView\n";
    private static String sampleIdfield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.EditText\n";
    private static String containerTypefield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.Button\n";
    private static String containerTypevalue = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n";
    private static String fieldspecies1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String fieldspecies2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String fieldspecies3 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[5]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String fieldspecies4 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[7]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\n";
    private static String commentFieldsampleForm = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[6]/android.widget.EditText\n";
    private static String larvaecountSampleform = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[5]/android.widget.EditText\n";
    private static String submitSampleform = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView\n";
    private static String fillAllmandatoryMsg = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView\n";
    private static String cancelCleartreatmentForm = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]\n";
    private static String calculatedValue = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]\n";

    public static void siteVisitrecordActivity() {
        waitFor(1);
        I.clickOnElement(By.xpath(siteVisit));
    }

    public static void firstSite() {

        waitFor(1);
        I.clickOnElement(By.xpath(firstSite));

    }

    public static void habitat() {

        waitFor(1);
        I.clickOnElement(By.xpath(habitatField));
        I.clickOnElement(By.xpath(habitatOneother));
        I.clickOnElement(By.xpath(habitatTwocanal));
        I.clickOnElement(By.xpath(habitatThreecatchBasin));
        I.clickOnElement(By.xpath(habitatFourContainer));
    }

    public static void containerField() {

        waitFor(1);
        I.clickOnElement(By.xpath(containerField));
        I.clickOnElement(By.xpath(containterFirstvalueAquarium));
        I.clickOnElement(By.xpath(containerSecondvalueFlowerpoint));
        I.clickOnElement(By.xpath(containerThirdValuegallonBucket));

    }

    public static void conditionField() {

        waitFor(1);
        I.clickOnElement(By.xpath(conditionField));
        waitFor(1);
        I.clickOnElement(By.xpath(conditionOptionclean));
    }

    public static void dipsField(String dipsValue) {

        waitFor(1);
        I.fillField(By.xpath(dipsField), dipsValue);

    }

    public static void larvaeCount(String larvaeCount) {

        waitFor(1);
        I.fillField(By.xpath(larvaeField), larvaeCount);
    }

    public static void larvalStages() {
        waitFor(1);
        I.clickOnElement(By.xpath(stageOne));
        I.clickOnElement(By.xpath(stageTwo));
        I.clickOnElement(By.xpath(stageThree));
        I.clickOnElement(By.xpath(stageFour));
    }

    public static void Action() {
        waitFor(1);
        I.clickOnElement(By.xpath(actionOnetreatment));
        waitFor(1);
        I.clickOnElement(By.xpath(actionTwocoveredContainer));
        waitFor(1);
        I.clickOnElement(By.xpath(actionThreeclearedDebris));
        waitFor(1);
        I.clickOnElement(By.xpath(actionFourMaintainance));
    }

    public static void commentField() {

        waitFor(1);
        I.fillField(By.xpath(commentField), commentText);
        int commentTextlength = I.getLength(By.xpath(commentField));
        assertEquals(commentTextlength, 250);
    }

    public static void finishDate() {

        waitFor(1);
        I.clickOnElement(By.xpath(finishDateField));

    }

    public static void okay() {
        waitFor(2);
        I.clickOnElement(By.xpath(okay));
//            I.clickOnElement(By.xpath(okay));
//            I.clickOnElement(By.xpath(okay));
    }


    public static void submit() {

        waitFor(3);
        I.clickOnElement(By.xpath(submitSitevisite));
    }

    public static void treatmentNo() {
        waitFor(1);
        I.clickOnElement(By.xpath(treatmentNo));
    }

    public static void tools() {

        waitFor(2);
        I.clickOnElement(By.xpath(toolsBtn));
    }

    public static void truckInventory() {

        waitFor(1);
        I.clickOnElement(By.xpath(truckInventory));
    }

    public static void altsoidPelletsquantity() {

        waitFor(1);
        System.out.println("alstoid = " + I.getText(By.xpath(altsoidPelletsquantity)));
        String value = I.getText(By.xpath(altsoidPelletsquantity)).split(" ")[0];
        initialValuealtsoidPellet = Double.parseDouble(value);
        System.out.println(initialValuealtsoidPellet);

    }

    public static void treatmentTab() {
        waitFor(1);
        I.clickOnElement(By.xpath(treatmentTab));

    }

    public static void product() {

        waitFor(3);
        I.clickOnElement(By.xpath(productField));
        waitFor(1);
        I.clickOnElement(By.xpath(productAltsoidpellets));
    }

    public static void quantity(String value) {
        waitFor(1);
        I.fillField(By.xpath(quantityField), value);
    }

    public static void acrestreatedAndtreatedAcresfield(String acresValue) {

        waitFor(1);
        I.fillField(By.xpath(acresTreatedfield), acresValue);
        String treatedAcres = I.getText(By.xpath(TreatedAcresfield));
        assertEquals(acresValue, treatedAcres);

    }

    public static void methodField() {

        waitFor(1);
        I.clickOnElement(By.xpath(methodField));
        I.clickOnElement(By.xpath(methodFieldValue));
    }

    public static void equipmentField() {
        waitFor(1);
        I.clickOnElement(By.xpath(selectEquipmentfield));
        I.clickOnElement(By.xpath(selectEquipmentfieldValue));
    }

    public static void treatmentCommentfield() {

        waitFor(1);
        I.fillField(By.xpath(commentFieldTreatment), commentText);
        int commentTextlength = I.getLength(By.xpath(commentField));
        assertEquals(commentTextlength, 250);

    }

    public static void averageTemperature() {
        waitFor(1);
        I.seeElemet(By.xpath(treatmentAveragetemperature));
        I.fillField(By.xpath(treatmentAveragetemperature), "98765432109876543210");
        waitFor(1);
        int length = I.getLength(By.xpath(treatmentAveragetemperature));
        assertEquals(length, 16);
    }

    public static void windSpeedfield() {

        waitFor(1);
        I.seeElemet(By.xpath(treatmentWindSpeed));
        I.fillField(By.xpath(treatmentWindSpeed), "98765432109876543210");
        waitFor(1);
        int length = I.getLength(By.xpath(treatmentWindSpeed));
        assertEquals(length, 16);
        I.scrollDown();

    }

    public static void calculatorTab() {

        waitFor(1);
        I.scrollDown();
        I.clickOnElement(By.xpath(calculatorTab));
    }

    public static void quantityFieldcalculator( String finalQuantity) {

        waitFor(1);
        I.fillField(By.xpath(quantityFieldcalculator),finalQuantity);


    }

    public static void rate(String rate) {

        I.scrollDown();
        waitFor(1);
        I.fillField(By.xpath(rateField),rate);
        rateToapply=Integer.parseInt(rate);

    }

    public static void comtinueSubmitform() {

        waitFor(1);
        I.clickOnElement(By.xpath(continueBtn));
    }

    public static void windDirection() {

        waitFor(1);
        I.clickOnElement(By.xpath(treatmentWinddirectionField));
        I.clickOnElement(By.xpath(treatmentWinddirectionValue));

    }

    public static void treatmentFinisdate() {

        waitFor(1);
        I.clickOnElement(By.xpath(treatmentFinishdate));
        I.scrollDown();
    }

    public static void areaTreatedTreatment(String treatedarea) {

        waitFor(1);
        treatedArea=Integer.parseInt(treatedarea);
        I.fillField(By.xpath(areaTreatedField), treatedarea);

    }

    public static void okClearquantity() {

        waitFor(1);
        I.clickOnElement(By.xpath(okClearquantity));
    }

    public static void doneTreatmentform() {

        waitFor(1);
        I.clickOnElement(By.xpath(doneTreatmentform));
    }

    public static void treatmentYes() {

        waitFor(1);
        I.clickOnElement(By.xpath(treatmentYes));
    }

    public static void calculate() {

        waitFor(1);
        I.scrollDown();
        I.clickOnElement(By.xpath(calculateBtn));
    }

    public static void truckInventorychangedQuantity(double value) {
        waitFor(1);
        String data = I.getText(By.xpath(altsoidPelletsquantity)).split(" ")[0];
        double initialValuealtsoidPellet = Double.parseDouble(data);
        System.out.println(initialValuealtsoidPellet);
        double x = initialValuealtsoidPellet - value;
        Assert.assertEquals(initialValuealtsoidPellet, x, 6);

    }

    public static void okayClosepopup() {

        waitFor(1);
        I.clickOnElement(By.xpath(okay));

    }

    public static void sampleTab() {

        waitFor(1);
        I.clickOnElement(By.xpath(sampleTab));
    }

    public static void sampleId(String sampleId) {

        waitFor(1);
        I.fillField(By.xpath(sampleIdfield), sampleId);
    }

    public static void containerTypefield() {

        waitFor(1);
        I.clickOnElement(By.xpath(containerTypefield));
    }

    public static void containerTypevalue() {

        waitFor(1);
        I.clickOnElement(By.xpath(containerTypevalue));
    }

    public static void fieldSpecies() {

        waitFor(1);
        I.clickOnElement(By.xpath(fieldspecies1));
        waitFor(1);
        I.clickOnElement(By.xpath(fieldspecies2));
        waitFor(1);
        I.clickOnElement(By.xpath(fieldspecies3));
        waitFor(1);
        I.clickOnElement(By.xpath(fieldspecies4));

    }

    public static void commentFieldsampleForm() {
        waitFor(1);
        I.fillField(By.xpath(commentFieldsampleForm), commentText);
        int commentTextlength = I.getLength(By.xpath(commentFieldsampleForm));
        assertEquals(commentTextlength, 250);
    }

    public static void larvaeCountsampleForm(String count) {

        waitFor(1);
        I.fillField(By.xpath(larvaecountSampleform), count);

    }

    public static void submitSampleform() {

        waitFor(1);
        I.clickOnElement(By.xpath(submitSampleform));

    }

    public static void quantityErrormsgVerification(String message) {
        {
            waitFor(1);
            I.seeElemet(By.xpath(fillAllmandatoryMsg));
            String actualMessage = I.getText(By.xpath(fillAllmandatoryMsg));
            Assert.assertEquals(message + " " + initialValuealtsoidPellet, actualMessage);

        }
    }

    public static void cancelCleartreatmentForm() {

        waitFor(1);
        I.clickOnElement(By.xpath(cancelCleartreatmentForm));

    }

    public static void calculatedArea(String quantity,String rate) {

        waitFor(1);
        I.seeElemet(By.xpath(calculatedValue));
        String actualValue = I.getText(By.xpath(calculatedValue));
        int qty= Integer.parseInt(quantity);
        int rateValue=Integer.parseInt(rate);
        Assert.assertEquals(actualValue, "Area"+" "+":"+" "+qty/rateValue+" "+"acre");

    }

    public static void calculatedQuantity(String area, String rate) {

        waitFor(1);
        I.seeElemet(By.xpath(calculatedValue));
        String actualValue = I.getText(By.xpath(calculatedValue));
        int areaValue=Integer.parseInt(area);
        int rateValue= Integer.parseInt(rate);
        //        System.out.println(actualValue);
        Assert.assertEquals(actualValue, rateToapply+" "+"lb/acre"+" "+":"+" "+areaValue*rateValue+" "+"lb");
    }

    public static void treatmentQuantityfield(String qty) {

        waitFor(1);
        I.fillField(By.xpath(quantityField),qty);
    }


}
