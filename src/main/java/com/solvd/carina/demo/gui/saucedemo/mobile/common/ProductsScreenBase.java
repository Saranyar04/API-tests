package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.solvd.carina.demo.gui.saucedemo.mobile.components.Item;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductsScreenBase extends SauceDemoAbstractScreenBase {

    protected ProductsScreenBase(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart(String productName){
    }

    public FilterPopUpBase clickFilterButton() {
        return null;
    }

}
