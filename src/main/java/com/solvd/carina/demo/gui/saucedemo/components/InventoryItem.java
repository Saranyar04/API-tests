package com.solvd.carina.demo.gui.saucedemo.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class InventoryItem extends AbstractUIObject {

    @FindBy(xpath = ".//div[@class = 'inventory_item_name ']")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = ".//button[contains(@id,'add-to-cart')]")
    private ExtendedWebElement addToCartButton;

    @FindBy(xpath = "//button[contains(@id,'remove')]")
    private ExtendedWebElement removeButton;

    public InventoryItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickAddToCardButton() {
        addToCartButton.click();
    }

    public void clickProductName() {
        productTitle.click();
    }

    public void clickRemoveButton() {
        removeButton.click();
    }

    public String getProductTitle() {
        return productTitle.getText();
    }

}