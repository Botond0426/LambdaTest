import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RadioButtonPage;

public class RadioButtonTests extends BasePage {
    private RadioButtonPage radioButtonPage;

    private static final By RADIO_BUTTONS_TESTS =By.linkText("radiobutton-demo");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonPage = new RadioButtonPage(driver);
    }
    @Test()
    public void ClickOnRadioButtonsDemo(){
        radioButtonPage.radioButtonsDemo();

        radioButtonPage.selectMaleRadio();
        radioButtonPage.setGetValueButton();
        radioButtonPage.getSelectedMaleMessage();
        Assert.assertEquals("Radio button 'Male' is checked","Radio button 'Male' is checked");

        radioButtonPage.getSelectedFemaleMessage();
        radioButtonPage.setGetValueButton();
        radioButtonPage.getSelectedFemaleMessage();
        Assert.assertEquals("Radio button 'Female' is checked","Radio button 'Female' is checked");
        radioButtonPage.clickOnCheckBox1();
        radioButtonPage.clickOnCheckbox2();



    }
    @Test()
    public void clickonFemaleRadio() {
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        radioButtonPage.selectFemaleRadio();
        radioButtonPage.select0to5();
        radioButtonPage.selectGetvalue2();

        Assert.assertEquals(" Female"," Female");
        Assert.assertEquals(" 0 - 5"," 0 - 5");
    }
    @Test()
    public void clickonMaleRadio() {
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        radioButtonPage.selectMaleRadio2();
        radioButtonPage.select15to50();
        radioButtonPage.selectGetvalue2();
        Assert.assertEquals(" Male"," Male");
        Assert.assertEquals(" 15 - 50"," 15 - 50");
    }
    @Test()
    public void clickonOtherRadio(){
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        radioButtonPage.selectOther();
        radioButtonPage.select5to15();
        radioButtonPage.selectGetvalue2();
        Assert.assertEquals(" Other"," Other");
        Assert.assertEquals(" 5 - 15"," 5 - 15");
    }
}
