package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.solvd.carina.demo.gui.saucedemo.mobile.components.Items;
import com.solvd.carina.demo.gui.saucedemo.web.components.InventoryItem;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductScreenBase extends SauceDemoAbstractScreenBase {

    protected ProductScreenBase(WebDriver driver) {
        super(driver);
    }

    public void burgerButtonClick() {
    }

    public LoginScreenBase logoutMenuItemClick() {
        return null;
    }

    public List<Items> getProducts() {
        return null;
    }

    public void addProductToCart(String productName){
    }

    public CartScreenBase clickCartButton() {
        return null;
    }

    public FilterPopUpScreenBase clickFilterButton() {
        return null;
    }

}
