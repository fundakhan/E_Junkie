package POM;

import Utilities.DriverClass;
import io.cucumber.java.bs.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class BasePOM {

    WebDriver driver = DriverClass.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public void sendKeysMethod(WebElement element,String keys){
        waitUntilVisible(element);
      // scrollToElement(element);
      //  element.clear();
        element.sendKeys(keys);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }



    public void clickMethod(WebElement element){
        waitUntilClickable(element);
      //  scrollToElement(element);
        element.click();
     //   driver.switchTo().defaultContent();

    }

    public void validateCartItem(WebElement element, int value){
        waitUntilVisible(element);
        Wait(2);
        Assert.assertTrue(element.getText().contains(Integer.toString(value)));
    }

    public void iframe(WebElement element){

        waitUntilVisible(element);

        driver.switchTo().frame(element);
    }

    public void defaultContentIframe() {
        driver.switchTo().defaultContent();
    }
    public void navigateHomePage(WebElement element, String value){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(value));
    }

    public void validateUnsuccessfulMessage(WebElement element){

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains("Invalid promo code".toLowerCase()));
       // defaultContentIframe();
    }

    public void sendKeysAsInteger(WebElement element,String value){
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
    }
    public static void Wait(int second){

        try {
            Thread.sleep(second*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void validateInvalidMessage(WebElement element){
        //iframe(element);


        waitUntilVisible(element);
        String[] expectedErrorMessage = {"Invalid Email", "Invalid Email", "Invalid Billing Name"};

        List<String> actualErrorMessages = Arrays.asList(element.getText().split("\n"));

        Assert.assertEquals(Arrays.asList(expectedErrorMessage), actualErrorMessages);

         defaultContentIframe();
    }

//    public void fillTheForm(WebElement element,String keys){
//        waitUntilVisible(element);
//        element.clear();
//        element.sendKeys(keys);
//    }
//
//    public void fillTheCardNumber(WebElement element, String cardNumber){
//
//        waitUntilVisible(element);
//        element.sendKeys(cardNumber);
//
//    }

    public void validateInvalidCardNumber(WebElement element){

        waitUntilVisible(element);

        String expectedErrorMessage = "Your card number is invalid.";
        Assert.assertTrue(element.isDisplayed());
        Assert.assertEquals(expectedErrorMessage,element.getText());

    }

    public void validateThankYouMessage(WebElement element){

        waitUntilVisible(element);

        Assert.assertTrue(element.isDisplayed());
        Assert.assertTrue(element.getText().toLowerCase().contains("Thank you!".toLowerCase()));
    }



}
