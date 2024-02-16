package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

public class CartScreenBase extends SauceDemoAbstractScreenBase {

    public CartScreenBase(WebDriver driver) {
        super(driver);
    }

    public ProductsScreenBase clickContinueShoppingButton() {
        throw new NotSupportedOperationException("clickContinueShoppingButton is not implemented for this page");
    }

    public boolean isProductPresent(String productName) {
        throw new NotSupportedOperationException("isProductPresent screen not implemented for this page.");
    }
}
