package POM;

import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageElements extends BasePOM{

    public PageElements(){
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(css = "span.shop-name")
    private WebElement homePage;

    @FindBy(xpath = "(//button[@class='view_product'])[2]")
    private List<WebElement> addToCartButton;

    @FindBy(xpath = "(//iframe[@class='EJIframeV3 EJOverlayV3'])[1]")
    private WebElement iframe1;

    @FindBy(xpath = "(//span[text()='1'])[2]")
    private WebElement chartItem1;

    @FindBy(css = "button[class='Product-Remove']")
    private WebElement removeButton;

    @FindBy(xpath = "//button[contains(@class,'Continue-Button')]")
    private WebElement continueButton;

    @FindBy(xpath = "(//span[text()='0'])[2]")
    private WebElement cartItem0;

    @FindBy(xpath = "//button[text()='Add Promo Code']")
    private WebElement addPromoCodeButton;

    @FindBy(xpath = "//input[@placeholder='Promo Code']")
    private WebElement promoCodeInput;

    @FindBy(className = "Promo-Apply")
    private WebElement applyButton;

    @FindBy(xpath = "//div[@id='SnackBar']")
    private WebElement unsuccessfulMessage;

    @FindBy(xpath = "//button[@class='Payment-Button CC']")
    private WebElement payDebitCreditButton;

    @FindBy(xpath = "//button[@class='Pay-Button']")
    private WebElement payButton;

    @FindBy(xpath = "//span[contains(text(),'Invalid Email')]")
    private WebElement invalidMessage;

    @FindBy(css = "input[placeholder='Email']")
    private WebElement emailInput;

    @FindBy(css = "input[placeholder='Confirm Email']")
    private WebElement confirmEmailInput;

    @FindBy(css = "input[placeholder='Name On Card']")
    private WebElement cardNameInput;

    @FindBy(css = "[name^='__privateStripeFrame']")
    private WebElement iframe2;

    @FindBy(xpath = "//input[@aria-label='Credit or debit card number']")
    private WebElement cardNumberInput;

    @FindBy(xpath = "//span[text()='Your card number is invalid.']")
    private WebElement invalidCardNumberMessage;

    @FindBy(xpath = "//input[@name='exp-date']/../../../../..")
    private WebElement expDateInput;

    @FindBy(xpath = "//input[@name='cvc']")
    private WebElement cvcInput;

    @FindBy(css = "span[class='green_text_margin']")
    private WebElement thankYouMessage;

    public WebElement getThankYouMessage(String confirmText) {
        return thankYouMessage;
    }

    public WebElement getExpDateInput() {
        return expDateInput;
    }

    public WebElement getCvcInput() {
        return cvcInput;
    }

    public WebElement getInvalidCardNumberMessage(String invalidCardNumText) {
        return invalidCardNumberMessage;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getConfirmEmailInput() {
        return confirmEmailInput;
    }

    public WebElement getCardNameInput() {
        return cardNameInput;
    }

    public WebElement getIframe2() {
        return iframe2;
    }

    public WebElement getCardNumberInput() {
        return cardNumberInput;
    }

    public WebElement getInvalidMessage(String invalidText) {
        return invalidMessage;
    }

    public WebElement getPayButton() {
        return payButton;
    }

    public WebElement getPayDebitCreditButton() {
        return payDebitCreditButton;
    }

    public WebElement getUnsuccessfulMessage(String errorMessage) {
        return unsuccessfulMessage;
    }

    public WebElement getApplyButton() {
        return applyButton;
    }

    public WebElement getPromoCodeInput(String promCode) {
        return promoCodeInput;
    }

    public WebElement getAddPromoCodeButton(String promoCodeBtn) {
        return addPromoCodeButton;
    }

    public WebElement getHomePage() {
        return homePage;
    }

    public List<WebElement> getAddToCartButton(String buttonName, String itemName) {
        return addToCartButton;
    }

    public WebElement getIframe1() {
        return iframe1;
    }

    public WebElement getChartItem1() {
        return chartItem1;
    }

    public WebElement getRemoveButton(String removeButton) {
        return this.removeButton;
    }

    public WebElement getContinueButton(String continueButton) {
        return this.continueButton;
    }

    public WebElement getCartItem0() {
        return cartItem0;
    }
}
