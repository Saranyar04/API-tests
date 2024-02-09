package com.solvd.carina.demo.gui.saucedemo.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='header_container inventory_details']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//div[@class = 'inventory_details_name large_size'][text()= '%s']")
    private ExtendedWebElement inventoryNameS;

    @FindBy(xpath = "//div[@class='inventory_details_price']")
    private ExtendedWebElement inventoryPrice;

    @FindBy(xpath = "//div[@class='inventory_details_desc large_size']")
    private ExtendedWebElement inventoryDescription;

    @FindBy(xpath = "//img[@class='inventory_details_img']")
    private ExtendedWebElement inventoryImage;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    private ExtendedWebElement addToCartButton;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
    }

    public boolean isProductPresent(String productTitle) {
        if(inventoryNameS.format(productTitle).isElementPresent() && inventoryPrice.isElementPresent() && addToCartButton.isElementPresent() && inventoryImage.isElementPresent())
            return true;
        else
            return false;
    }

    public boolean isDescriptionPresent() {
        if(inventoryDescription.isElementPresent() && inventoryDescription.getText() != null)
            return true;
        else
            return false;
    }

    public boolean isPricePresent() {
        if(inventoryPrice.isElementPresent() && inventoryPrice.getText().matches("^\\$(([1-9]\\d{0,2}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d\\d)?$")) {
            return true;
        }
        else
            return false;
    }

}
