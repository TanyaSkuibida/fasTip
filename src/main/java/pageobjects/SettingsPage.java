package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by tanya on 24.06.2017.
 */
public class SettingsPage extends BasePage{

    public SettingsPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "tipPercentageEditText")
    private MobileElement tipPercentageEditText;

    @AndroidFindBy(accessibility = "saveSettingsButton")
    private MobileElement saveSettingsButton;

    public void clear () {
        tipPercentageEditText.clear();
    }

    public void forTipPercentage (String percentage) {
        tipPercentageEditText.setValue(percentage);
    }

    public MainPage clickOnSaveSettingsButton() {
        saveSettingsButton.click(); //!!!!!!!!!!!!!!1
        return new MainPage (driver);
    }

}


