package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage extends BasePage {

    //====================================================
    public SimpleFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //=====================================================

    @FindBy(css = "input[placeholder='Please enter your Message']")
    private WebElement textField;

    public void enterTextInTextField(String text) {
        textField.sendKeys(text);
    }
    @FindBy(id = "sum1")
    private WebElement textField2;

    public void enterTextInTextField2(String text) {
        textField2.sendKeys(text);
    }
    @FindBy(id = "showInput")
    private WebElement GetCheckValue;

    public void clickOnGetCheckValue(){
        GetCheckValue.click();
    }

    @FindBy(id = "sum2")
    private WebElement textField3;

    public void enterTextInTextField3(String text) {
        textField3.sendKeys(text);
    }
    @FindBy(css = "#gettotal > button")
    private WebElement getSum;

    public void clickOnGetSumButton(){
        getSum.click();
    }

}
