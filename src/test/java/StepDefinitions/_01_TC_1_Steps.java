package StepDefinitions;

import POM.PageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_TC_1_Steps {
    PageElements pe = new PageElements();
    @Given("I am on the e-junkie website")
    public void iAmOnTheEJunkieWebsite() {
     pe.navigateHomePage(pe.getHomePage(), "E-junkie");
    }

    @When("I click on {string} for {string}")
    public void iClickOnAddToCartForDemoEBook(String buttonName, String itemName) {
        List<WebElement> addToCartButtons = pe.getAddToCartButton(buttonName, itemName);
        for (WebElement button : addToCartButtons){
            pe.clickMethod(button);
        }
        pe.iframe(pe.getIframe1());
    }

    @Then("The cart item count should be 1")
    public void theCartItemCountShouldBeOne() {
        pe.validateCartItem(pe.getChartItem1(),1);
    }

    @When("I click on the {string} button")
    public void iClickOnTheRemoveButton(String removeButton) {
        WebElement button = pe.getRemoveButton(removeButton);
        pe.clickMethod(button);
    }

    @And("I click on {string}")
    public void iClickOnContinueShopping(String continueButton) {
//        DriverClass.getDriver().navigate().refresh();
        WebElement button = pe.getContinueButton(continueButton);
        pe.clickMethod(button);
        pe.defaultContentIframe();

    }

    @Then("The cart item count should be 0")
    public void theCartItemCountShouldBeZero() {

        pe.validateCartItem(pe.getCartItem0(),0);
    }
}
