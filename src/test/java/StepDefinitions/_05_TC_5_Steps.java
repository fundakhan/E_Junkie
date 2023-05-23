package StepDefinitions;

import POM.PageElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_TC_5_Steps {

    PageElements pe = new PageElements();

//    @And("I enter Expiration date and CVC as")
//    public void iEnterExpirationDateAndCVCAs(DataTable dataTable) {
//
//        List<String> dataList = dataTable.asList(String.class);
//        pe.sendKeysMethod(pe.getExpDateInput(),dataList.get(0));
//        pe.sendKeysMethod(pe.getCvcInput(),dataList.get(1));
//
//    }
    @Then("I should be navigated to the confirmation page and see the {string} message is displayed")
    public void iShouldBeNavigatedToTheConfirmationPageAndSeeTheMessageIsDisplayed(String confirmText) {
        pe.validateThankYouMessage(pe.getThankYouMessage(confirmText));
    }




}
