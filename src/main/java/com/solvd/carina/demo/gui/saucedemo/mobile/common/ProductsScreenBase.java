package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.solvd.carina.demo.gui.saucedemo.mobile.components.Item;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductsScreenBase extends SauceDemoAbstractScreenBase {

    protected ProductsScreenBase(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart(String productName){
    }

    public FilterPopUpBase clickFilterButton() {
        throw new NotSupportedOperationException("clickFilterButton is not implemented for this page");
    }

}
