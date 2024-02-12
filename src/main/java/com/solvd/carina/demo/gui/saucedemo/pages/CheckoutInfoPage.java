package com.solvd.carina.demo.gui.saucedemo.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutInfoPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='title'][text()='Checkout: Your Information']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//input[@id='first-name']")
    private ExtendedWebElement firstNameField;

    @FindBy(xpath = "//input[@id='last-name']")
    private ExtendedWebElement lastNameField;

    @FindBy(xpath = "//input[@id='postal-code']")
    private ExtendedWebElement postalCodeField;

    @FindBy(xpath = "//input[@id='continue']")
    private ExtendedWebElement continueButton;

    protected CheckoutInfoPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
    }

    public void typeFirstName(String firstName) {
        firstNameField.type(firstName);
    }

    public void typeLastName(String lastName) {
        lastNameField.type(lastName);
    }

    public void typePostalCode(String postalCode) {
        postalCodeField.type(postalCode);
    }

    public CheckoutOverviewPage clickContinueButton() {
        continueButton.click();
        return new CheckoutOverviewPage(getDriver());
    }

}