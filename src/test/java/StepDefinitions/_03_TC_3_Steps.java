package StepDefinitions;

import POM.PageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _03_TC_3_Steps {

    PageElements pe = new PageElements();
    @And("I click on Pay using Debit Card button")
    public void iClickOnPayUsingDebitCardButton() {
        pe.clickMethod(pe.getPayDebitCreditButton());
    }

    @And("I click on Pay button")
    public void iClickOnPayButton() {
        pe.clickMethod(pe.getPayButton());
    }

    @Then("I should see the {string} error message displayed")
    public void iShouldSeeTheInvalidEmailInvalidEmailInvalidBillingNameErrorMessageDisplayed(String invalidText) {

        pe.validateInvalidMessage(pe.getInvalidMessage(invalidText));
        pe.defaultContentIframe();
    }
}
