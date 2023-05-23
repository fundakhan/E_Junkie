package StepDefinitions;

import POM.PageElements;
import Utilities.DriverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class _04_TC_4_Steps {

    PageElements pe = new PageElements();
    @And("I fill the Billing Details Form with fake data")
    public void iFillTheBillingDetailsFormWithFakeData(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        pe.sendKeysMethod(pe.getEmailInput(),dataList.get(0));
        pe.sendKeysMethod(pe.getConfirmEmailInput(),dataList.get(1));
        pe.sendKeysMethod(pe.getCardNameInput(),dataList.get(2));



    }

    @And("I enter the Card number as")
    public void iEnterAsTheCardNumberAS(DataTable dataTable) {
        DriverClass.getDriver().switchTo().frame(pe.getIframe2());
        List<String> data = dataTable.asList(String.class);
        pe.sendKeysMethod(pe.getCardNumberInput(),data.get(0));
        DriverClass.getDriver().switchTo().parentFrame();
    }

    @Then("I should see the {string} invalid data message displayed")
    public void iShouldSeeTheInvalidCardNumberErrorMessageDisplayed(String invalidCardNumText)  {

        pe.validateInvalidCardNumber(pe.getInvalidCardNumberMessage(invalidCardNumText));
    }
}
