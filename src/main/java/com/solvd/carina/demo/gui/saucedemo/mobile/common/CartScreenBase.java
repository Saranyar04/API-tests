package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import org.openqa.selenium.WebDriver;

public abstract class CartScreenBase extends SauceDemoAbstractScreenBase {

    public CartScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract ProductsScreenBase clickContinueShoppingButton();

    public abstract boolean isProductPresent(String productName);

}
