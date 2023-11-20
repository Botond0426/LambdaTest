import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SimpleFormPage;

public class SimpleFormTests extends BasePage {

    private SimpleFormPage simpleFormPage;
    private final By simpleFormDemoLink = By.linkText("Simple Form Demo"); // Define the constant locator

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }
//1.caractere speciale
    //2.cifre
    //spatii
@Test (priority = 1)
public void enterMessageAndClickGetCheckedValue() {
    driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
    simpleFormPage.enterTextInTextField("Test");
    simpleFormPage.clickOnGetCheckValue();

    String actualResult = driver.findElement(By.id("message")).getText();
    System.out.println(actualResult);
    Assert.assertTrue(actualResult.contains("Test"));
}
    @Test
    public void enterMessageAndClickGetCheckedValue1() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("$%%^$%&#$*@#!!♥");
        simpleFormPage.clickOnGetCheckValue();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("$%%^$%&#$*@#!!♥"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue2() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("123456789");
        simpleFormPage.clickOnGetCheckValue();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("123456789"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue3() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("test  spatii");
        simpleFormPage.clickOnGetCheckValue();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("test  spatii"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue4() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField2("4");
        simpleFormPage.clickOnGetCheckValue();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Entered value is not a number"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue5() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.clickOnGetSumButton();
        simpleFormPage.enterTextInTextField3("5");
        simpleFormPage.clickOnGetCheckValue();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Entered value is not a number"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue6() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField2("2");
        simpleFormPage.enterTextInTextField3("2");
        simpleFormPage.clickOnGetSumButton();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("4"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue7() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField2("9");
        simpleFormPage.enterTextInTextField3("1");
        simpleFormPage.clickOnGetSumButton();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("10"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue8() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField2("150");
        simpleFormPage.enterTextInTextField3("150");
        simpleFormPage.clickOnGetSumButton();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("300"));
    }
    @Test
    public void enterMessageAndClickGetCheckedValue9() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField2("1500");
        simpleFormPage.enterTextInTextField3("1500");
        simpleFormPage.clickOnGetSumButton();

        String actualResult = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("3000"));
    }


}