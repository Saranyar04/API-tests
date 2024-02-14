package com.solvd.carina.demo.gui.saucedemo.web;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='title'][text() = 'Your Cart']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//button[@id='checkout']")
    private ExtendedWebElement checkoutButton;

    @FindBy(xpath = "//div[@class = 'inventory_item_name'][text() = '%s']")
    private ExtendedWebElement productTitleS;

    public CartPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
    }

    public boolean isProductPresent(String productTitle) {
        return productTitleS.format(productTitle).isElementPresent();
    }

    public CheckoutInfoPage clickCheckoutButton() {
        checkoutButton.click();
        return new CheckoutInfoPage(getDriver());
    }

}