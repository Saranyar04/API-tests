package com.solvd.carina.demo.gui.saucedemo.mobile.android;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.CartScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase{

    @FindBy(xpath="//android.widget.TextView[@text='YOUR CART']")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = ".//android.widget.TextView[@text='%s']")
    private ExtendedWebElement productTitleS;

    @FindBy(xpath = "//android.widget.TextView[@text='CONTINUE SHOPPING']")
    private ExtendedWebElement continueShoppingButton;

    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return screenTitle.isElementPresent();
    }

    @Override
    public ProductScreenBase continueShoppingButtonClick() {
        continueShoppingButton.click();
        return initPage(ProductScreenBase.class);
    }

    @Override
    public boolean isProductPresent(String productName) {
        return productTitleS.isElementPresent();
    }
}
