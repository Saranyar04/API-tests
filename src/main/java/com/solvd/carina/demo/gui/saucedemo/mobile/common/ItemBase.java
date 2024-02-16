package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ItemBase extends AbstractPage {

    public ItemBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddToCartButton(String productName);
}
