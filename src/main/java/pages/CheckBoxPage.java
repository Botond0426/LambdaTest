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
    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input")
    private WebElement singleCheckbox2;

    public void clickOnSingleCheckbox2() {singleCheckbox2.click();}
    @FindBy(id="<input type=\"checkbox\" class=\"mr-10\">")
    private WebElement singleCheckbox3;

    public void clickOnSingleCheckbox3() {singleCheckbox3.click();}
    @FindBy(id="box")
    private WebElement checkAllButton;

    public void clickOnCheckAllButton() {
        checkAllButton.click();}
    @FindBy(css = "#ex1-check1")
    private WebElement option1;

    public void clickOnOption1(){
    option1.click();}
    @FindBy(css = "#ex1-check2")
    private WebElement option2;

    public void clickOnOption2(){
        option2.click();
    }
    @FindBy(css = "#ex1-check3")
    private WebElement option3;

    public void clickOnOption3(){
        option3.click();
    }
    @FindBy(xpath = "//*[@id=\"ex1-check3\"]")
    private WebElement option4;

    public void clickOnOption4(){
        option4.click();
    }
}
