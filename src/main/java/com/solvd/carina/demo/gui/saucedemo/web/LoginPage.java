package com.solvd.carina.demo.gui.saucedemo.web;

import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@id = 'user-name']")
    private ExtendedWebElement userNameField;

    @FindBy(xpath = "//input[@id = 'password']")
    private ExtendedWebElement passwordField;

    @FindBy(css = ".submit-button")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//h3[@data-test = 'error'][text() = '%s']")
    private ExtendedWebElement errorButtonS;


    public LoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(loginButton);
        setPageAbsoluteURL(R.CONFIG.get("url"));
    }

    public void typeUserName(String userName) {
        userNameField.type(userName);
    }

    public void typePassword(String password) {
        passwordField.type(password);
    }

    public ProductsPage clickLoginButton() {
        loginButton.click();
        return new ProductsPage(getDriver());
    }

    public boolean isErrorMessage(String error) {
        return errorButtonS.format(error).isElementPresent();
    }

}