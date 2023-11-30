package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BasePage{

    public RadioButtonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //-------------
    @FindBy(linkText = "Radio Buttons Demo")
    private WebElement radioButtonsDemoLink;

    public void radioButtonsDemo(){
        radioButtonsDemoLink.click();
    }

    @FindBy(css="#__next > div > section.mt-30 > div > div > div > div:nth-child(1) > div > label.text-size-16.mt-10.text-black.mr-20")
    private  WebElement maleRadio;

    public void selectMaleRadio(){maleRadio.click();
    }

    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(1) > div > p.text-gray-900.text-size-15.my-10.text-black.radiobutton")
    private WebElement selectedMaleMessage;

    public String getSelectedMaleMessage(){
        return selectedMaleMessage.getText();
    }
    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(2) > div > div > div > div:nth-child(2) > label > input")
    private WebElement checkbox1;

    public void clickOnCheckBox1(){checkbox1.click();}
    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div/div/div/div[2]/label/input")
    private WebElement checkbox2;

    public void clickOnCheckbox2(){checkbox2.click();}
    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(1) > div > p.text-gray-900.text-size-15.my-10.text-black.radiobutton")
    private WebElement selectedFemaleMessage;
    public String getSelectedFemaleMessage(){
        return selectedFemaleMessage.getText();
    }

    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(1) > div > label:nth-child(3) > input")
    private  WebElement femaleRadio;

    public void selectFemaleRadio(){femaleRadio.click();}

    @FindBy(xpath ="//*[@id=\"buttoncheck\"]")
    private  WebElement getValueButton;

    public void setGetValueButton(){getValueButton.click();}

    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(3) > div > div > div.w-8\\/12.smtablet\\:w-full.left-input.mr-20.pr-30.smtablet\\:mr-0.smtablet\\:pr-0 > div:nth-child(2) > label:nth-child(2) > input")
    private WebElement maleRadio2;

    public void selectMaleRadio2(){maleRadio2.click();}

    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(3) > div > div > div.w-8\\/12.smtablet\\:w-full.left-input.mr-20.pr-30.smtablet\\:mr-0.smtablet\\:pr-0 > div:nth-child(2) > label:nth-child(3) > input")
    private WebElement femaleRadio2;

    public void selectFemaleRadio2(){femaleRadio2.click();}

    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(3) > div > div > div.w-8\\/12.smtablet\\:w-full.left-input.mr-20.pr-30.smtablet\\:mr-0.smtablet\\:pr-0 > div:nth-child(2) > label:nth-child(4) > input")
    private WebElement Other;

    public void selectOther(){Other.click();}

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input")
    private WebElement age0to5;


    public void select0to5(){
        age0to5.click();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input")
    private  WebElement age5to15;

    public void select5to15(){age5to15.click();}

    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(3) > div > div > div.w-8\\/12.smtablet\\:w-full.left-input.mr-20.pr-30.smtablet\\:mr-0.smtablet\\:pr-0 > div.mt-20.mb-20 > label:nth-child(4) > input")
    private  WebElement age15to50;

    public void select15to50(){age15to50.click();}

    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(3) > div > div > div.w-8\\/12.smtablet\\:w-full.left-input.mr-20.pr-30.smtablet\\:mr-0.smtablet\\:pr-0 > button")
    private WebElement GetValue2;

    public void selectGetvalue2(){GetValue2.click();}
    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(3) > div > div > div.w-4\\/12.smtablet\\:w-full.rigth-input > p.mb-20.font-medium > span")
    private WebElement genderbutton;

    public String GetGenderButton() {
        return genderbutton.getText();
    }
    @FindBy(css = "#__next > div > section.mt-30 > div > div > div > div:nth-child(3) > div > div > div.w-4\\/12.smtablet\\:w-full.rigth-input > p:nth-child(2) > span")
    private WebElement agebutton;

    public String GetAgeButton(){
        return agebutton.getText();
    }


}
