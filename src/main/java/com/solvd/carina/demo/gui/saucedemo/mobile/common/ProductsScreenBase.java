package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.solvd.carina.demo.gui.saucedemo.mobile.components.Item;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class ProductsScreenBase extends SauceDemoAbstractScreenBase {

    public ProductsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void addProductToCart(String productName);

    public abstract FilterPopUpBase clickFilterButton();

}
