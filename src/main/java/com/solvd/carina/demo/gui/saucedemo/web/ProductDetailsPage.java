package com.solvd.carina.demo.gui.saucedemo.web;

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
        return inventoryNameS.format(productTitle).isElementPresent();
    }

    public boolean isInventoryImagePresent() {
        return inventoryImage.isElementPresent();
    }

    public boolean isAddToCartButtonPresent() {
        return (addToCartButton.isElementPresent());
    }

    public String getDescriptionText() {
        return inventoryDescription.getText();
    }

    public String getPriceText() {
        return inventoryPrice.getText();
    }

}