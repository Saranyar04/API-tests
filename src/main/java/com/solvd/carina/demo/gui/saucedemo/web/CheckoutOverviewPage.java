package com.solvd.carina.demo.gui.saucedemo.web;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='title'][text()='Checkout: Overview']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//div[@class = 'inventory_item_name'][text() = '%s']")
    private ExtendedWebElement productTitleS;

    protected CheckoutOverviewPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
    }

    public boolean isProductPresent(String productTitle) {
        return productTitleS.format(productTitle).isElementPresent();
    }

}
