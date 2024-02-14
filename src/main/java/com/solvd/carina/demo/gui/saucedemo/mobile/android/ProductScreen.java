package com.solvd.carina.demo.gui.saucedemo.mobile.android;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.CartScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.LoginScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.components.Items;
import com.solvd.carina.demo.gui.saucedemo.web.components.InventoryItem;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductScreenBase.class)
public class ProductScreen extends ProductScreenBase {

    @FindBy(xpath="//android.widget.TextView[@text='PRODUCTS']")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Menu']")
    private ExtendedWebElement burgerButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGOUT']")
    private ExtendedWebElement logoutMenuItem;

    @FindBy(xpath = "//android.widget.TextView[@text='[]']")
    private List<Items> products;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']")
    private ExtendedWebElement cartButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Modal Selector Button']")
    private ExtendedWebElement filterButton;

    public ProductScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return screenTitle.isElementPresent();
    }

    @Override
    public void burgerButtonClick() {
        burgerButton.click();
    }

    @Override
    public LoginScreenBase logoutMenuItemClick() {
        logoutMenuItem.click();
        return initPage(LoginScreenBase.class);
    }

    @Override
    public List<Items> getProducts() {
        return products;
    }

    @Override
    public void addProductToCart(String productName) {
        Items items = new Items(getDriver());
        items.clickAddToCardButton(productName);
    }

    @Override
    public CartScreenBase clickCartButton() {
        cartButton.click();
        return initPage(CartScreenBase.class);
    }

    @Override
    public FilterPopUpScreen clickFilterButton() {
        filterButton.click();
        return new FilterPopUpScreen(getDriver());
    }

}
