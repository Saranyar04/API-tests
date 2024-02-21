package com.solvd.carina.demo.gui.saucedemo.mobile.android;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductsScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.components.Item;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsScreenBase.class)
public class ProductsScreen extends ProductsScreenBase {

    @FindBy(xpath="//android.widget.TextView[@text='PRODUCTS']")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Modal Selector Button']")
    private ExtendedWebElement filterButton;

    public ProductsScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return screenTitle.isElementPresent();
    }

    @Override
    public void addProductToCart(String productName) {
        Item item = new Item(getDriver());
        item.clickAddToCartButton(productName);
    }

    @Override
    public FilterPopUp clickFilterButton() {
        filterButton.click();
        return new FilterPopUp(getDriver());
    }

}
