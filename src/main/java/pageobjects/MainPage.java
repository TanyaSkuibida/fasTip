package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by tanya on 24.06.2017.
 */
public class MainPage extends BasePage{

    public MainPage (AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Settings")
//  @iOSFindBy(accessibility = "Settings")
    private MobileElement gotoSettingsButton;

    @AndroidFindBy(id = "billAmtEditText")
    private MobileElement billAmtEditText;

    @AndroidFindBy(id = "calcTipButton")
    private MobileElement calcTipButton;

    public SettingsPage goToSettings(){
        gotoSettingsButton.click();
  //      gotoSettingsButton.getText();  // зачем описали?
        return new SettingsPage(driver);
    }

    public void forBillAmount (String bill) {
        billAmtEditText.setValue(bill);
    }

    public MainPage clickOnCalcTipButton() {
        calcTipButton.click();
        return new MainPage(driver);
    }

    public String getTipPercentage(){
        String result = null;
        if (android) result = driver.findElementById("tipPctTextView").getText();
        return result;
    }

    public String getTipAmount(){
        String result = null;
        if (android) result = driver.findElementById("tipAmtTextView").getText();
        return result;
    }

    public String getTotalAmount(){
        String result = null;
        if (android) result = driver.findElementById("totalAmtTextView").getText();
        return result;
    }

}
