package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by tanya on 24.06.2017.
 */
public class BasePage {

    AppiumDriver<MobileElement> driver;
    static boolean ios = false;
    static boolean android = false;

    public BasePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    public void setPlatform() {
        String platformName = (String) driver.getCapabilities().getCapability("platformName");
        if (platformName.equals("Android")) {
            android = true;
        } else {
            ios = true;
        }
    }

}


