package com.solvd.carina.demo.gui.saucedemo.web;

import com.solvd.carina.demo.gui.saucedemo.web.components.InventoryItem;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='title'][text() = 'Products']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//div[@class = 'inventory_item_name ']")
    private ExtendedWebElement productNameButton;

    @FindBy(xpath = "//div[@class = 'inventory_item']")
    private List<InventoryItem> products;

    @FindBy(xpath = "//a[@class = 'shopping_cart_link']")
    private ExtendedWebElement cartButton;

    public ProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
    }

    public CartPage clickCartButton() {
        cartButton.click();
        return new CartPage(getDriver());
    }

    public List<InventoryItem> getProducts() {
        return products;
    }

    public void addProductToCart(String productName) {
        for (InventoryItem inventoryItem : products) {
            if(productName.equals(inventoryItem.getProductTitle())) {
                inventoryItem.clickAddToCardButton();
            }
        }
    }

    public void removeProductFromCart(String productName) {
        for (InventoryItem inventoryItem : products) {
            if(productName.equals(inventoryItem.getProductTitle())) {
                inventoryItem.clickRemoveButton();
            }
        }
    }

    public ProductDetailsPage clickProductName(String productName) {
        for (InventoryItem inventoryItem : products) {
            if(productName.equals(inventoryItem.getProductTitle())) {
                inventoryItem.clickProductName();
                break;
            }
        }
        return new ProductDetailsPage(getDriver());
    }

}