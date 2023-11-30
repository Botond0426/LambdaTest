import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckBoxPage;

public class CheckBoxTests extends BasePage {
    private CheckBoxPage checkBoxPage;

    private static final By CHECK_BOX_DEMO = By.linkText("isAgeSelected");

    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkBoxPage = new CheckBoxPage(driver);
    }

    @Test()
    public void clickOnTheSingleCheckboxCheckmark(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkBoxPage.clickOnSingleCheckbox();

        String actualResult = driver.findElement(By.cssSelector("#txtAge")).getText();
        checkBoxPage.clickOnSingleCheckbox();

        String actualResult2 = driver.findElement(By.cssSelector("#txtAge")).getText();
        Assert.assertTrue(actualResult.contains("Checked"));
        Assert.assertEquals(actualResult, "Checked");
        checkBoxPage.clickOnSingleCheckbox();
       }
       @Test()
    public void clickOnTheFirstCheckBoxCheckmark(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkBoxPage.clickOnSingleCheckbox2();
           checkBoxPage.clickOnSingleCheckbox3();

        String actualResult3 = driver.findElement(By.cssSelector("#__next > div > section.mt-30 > div > div > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input")).getText();
        checkBoxPage.clickOnSingleCheckbox2();

        String actualresult3 = driver.findElement(By.cssSelector("#__next > div > section.mt-30 > div > div > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > input")).getText();
       checkBoxPage.clickOnSingleCheckbox3();
       }
       @Test()
    public void clickOnCheckAllButton(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkBoxPage.clickOnCheckAllButton();

        String actualresult4 = driver.findElement(By.xpath("//*[@id=\"box\"]")).getAccessibleName();
           System.out.println(actualresult4);
        Assert.assertTrue((actualresult4.contains("Uncheck All")));
        @Test()
                public void test1(){
            driver.findElement(By.linkText("Checkbox Demo")).click();
            checkBoxPage.c
           }
       }
    }

