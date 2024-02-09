package com.solvd.carina.demo.gui.saucedemo.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends AbstractPage {

    @FindBy(xpath = "//button[@id='back-to-products']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//div[@class = 'inventory_details_name large_size'][text()= '%s']")
    private ExtendedWebElement inventoryNameS;
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
    }

    public boolean isProductDetails(String productTitle) {
        return inventoryNameS.format(productTitle).isElementPresent();
    }

}
