import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.SettingsPage;

/**
 * Created by tanya on 24.06.2017.
 */
public class CalculateTipTest extends BaseTest{

    @Test
    public void testCalculateTip(){

        MainPage mainPage = new MainPage(driver);
        mainPage.goToSettings();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.clear();
        settingsPage.forTipPercentage("5.0");
        settingsPage.clickOnSaveSettingsButton();  //!!!!!!!!

        mainPage.forBillAmount("100");
        mainPage.clickOnCalcTipButton();

        String tipPercentage = mainPage.getTipPercentage();
        String tipAmount = mainPage.getTipAmount();
        String totalAmount = mainPage.getTotalAmount();

        Assert.assertEquals(tipPercentage,"5.0%");
        Assert.assertEquals(tipAmount,"$5.00");
        Assert.assertEquals(totalAmount,"$105.00");

    }

}
