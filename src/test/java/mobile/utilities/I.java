package mobile.utilities;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

public class I extends MobileConfiguration {
    private static AppiumDriver<MobileElement> driver = getAppiumDriver();
    private static final int DEFAULT_TIME_OUT = 10000;
    private static WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIME_OUT);

    protected static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    private static void waitForVisible(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    private static void waitForVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    private static void waitForClickable(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    private static void waitForClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected static void textIsPresent(WebElement webElement, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
    }

    protected static void textIsPresent(By locator, String text) {
        wait.until(ExpectedConditions.textToBe(locator, text));
    }


    protected static void waitTillTextIsInvisible(By locator, String text) {
        wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));
    }


    protected static void waitTillElementIsInvisible(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static String getValueFromProperty(String fileName, String key) {
        Properties properties = new Properties();
        try {
            FileReader fileReader = new FileReader("./src/test/resources/" + fileName + ".properties");
            properties.load(fileReader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties.get(key).toString();
    }


    public static void waitFor(int minute) {
        try {
            Thread.sleep(minute * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected static void clickOnElement(By locator) {

        waitForVisible(locator);
        waitForClickable(locator);
        getDriver().findElement(locator).click();
    }

    protected static void clickOnElement(WebElement webElement) {
        waitForVisible(webElement);
        waitForClickable(webElement);
        webElement.click();
    }


    protected static void seeElemet(By locator) {

        waitForVisible(locator);
    }

    protected static boolean seeElemetBoolean(By locator) {

        waitForVisible(locator);
        return false;
    }


    protected static void fillField(By locator, String data) {
        waitForVisible(locator);
        getDriver().findElement(locator).clear();
        getDriver().findElement(locator).sendKeys(data);
        getDriver().hideKeyboard();
    }

//    protected static void fillField(By mobileElement, int data) {
//        waitForVisible(mobileElement);
//        mobileElement.clear();
//        mobileElement.sendKeys(data);
//        getDriver().hideKeyboard();
//    }

    protected static void fillField(WebElement webElement, String data) {
        waitForVisible(webElement);
        webElement.sendKeys(Keys.CONTROL + "a");
        webElement.sendKeys(Keys.ENTER);
        //webElement.clear();
        webElement.sendKeys(data);
        getDriver().hideKeyboard();
    }

    protected static String getText(By locator) {
        waitForVisible(locator);
        return getDriver().findElement(locator).getText();
    }

    protected static int getLength(By locator) {
        waitForVisible(locator);
        return getDriver().findElement(locator).getText().length();
    }

    protected static String getText(WebElement webElement) {
        waitForVisible(webElement);
        return webElement.getText();
    }

    protected static void closeApp() {
        getDriver().closeApp();
    }

    public static void launchApp() {
        getDriver().launchApp();
    }

    public static void navigateBack() {
        getDriver().navigate().back();
    }

    public static void scrollDown() {
        Dimension dimension = getDriver().manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.8);
        int scrollEnd = (int) (dimension.getHeight() * 0.2);

        new TouchAction((PerformsTouchActions) getDriver())
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }


    public static  void scrollToElementByTextContains(String text)
    {
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
//                ".scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0));"));

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\""+text+"\"))"));
    }
}



