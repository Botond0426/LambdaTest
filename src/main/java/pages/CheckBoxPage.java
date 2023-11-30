package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage extends BasePage{

    public CheckBoxPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="isAgeSelected")
    private WebElement singleCheckbox;

    public void clickOnSingleCheckbox() {singleCheckbox.click();}
    @FindBy(id="<input type=\"checkbox\" class=\"mr-10\">")
    private WebElement singleCheckbox2;

    public void clickOnSingleCheckbox2() {singleCheckbox2.click();}
    @FindBy(id="<input type=\"checkbox\" class=\"mr-10\">")
    private WebElement singleCheckbox3;

    public void clickOnSingleCheckbox3() {singleCheckbox3.click();}
    @FindBy(id="box")
    private WebElement checkAllButton;

    public void clickOnCheckAllButton() {
        checkAllButton.click();}
}
