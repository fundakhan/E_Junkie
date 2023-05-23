package StepDefinitions;

import POM.PageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class _02_TC_2_Steps {

    PageElements pe = new PageElements();
    @And("I click on {string} button")
    public void iClickOnAddPromoCodeButton(String promoCodeBtn) {
        pe.clickMethod(pe.getAddPromoCodeButton(promoCodeBtn));

    }

    @And("I enter {string} as the promo code")
    public void iEnterAsThePromoCode(String promCode) {
        WebElement promoCodeInput = pe.getPromoCodeInput(promCode);
        pe.sendKeysAsInteger(promoCodeInput, promCode);
    }

    @And("I click on Apply button")
    public void iClickOnApplyButton() {
        pe.clickMethod(pe.getApplyButton());
    }

    @Then("I should see the {string} message displayed")
    public void iShouldSeeTheInvalidPromoCodeMessageDisplayed(String errorMessage) {

        pe.validateUnsuccessfulMessage(pe.getUnsuccessfulMessage(errorMessage));
        pe.defaultContentIframe();
    }


}
