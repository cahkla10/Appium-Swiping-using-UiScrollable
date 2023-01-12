package helpers;

import io.appium.java_client.MobileBy;
import setups.DriverSetup;

import static org.junit.Assert.assertEquals;

public class Common {

    private String uiautomatorText(String locator, String element){
        String uiautomator = "new UiScrollable(UiSelector().scrollable(true))." +
                "scrollIntoView(new UiSelector()." + locator + "(\"" + element + "\"))";
        return uiautomator;
    }

    public void swipeAndClick(String locator, String element){
        DriverSetup.getAppiumDriver().
                findElement(MobileBy.AndroidUIAutomator(uiautomatorText(locator,element))).click();
    }

    public void swipeAndRead(String locator, String element, String expected){
        String text = DriverSetup.getAppiumDriver().
                findElement(MobileBy.AndroidUIAutomator(uiautomatorText(locator,element))).getText();

        assertEquals(expected, text);
    }
}