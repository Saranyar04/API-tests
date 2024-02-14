package com.solvd.carina.demo.gui.saucedemo.mobile.ios;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.CartScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.LoginScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.components.Items;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductScreenBase.class)
public class ProductScreen extends ProductScreenBase {

    protected ProductScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void burgerButtonClick() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public LoginScreenBase logoutMenuItemClick() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public List<Items> getProducts() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public void addProductToCart(String productName) {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public CartScreenBase clickCartButton() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public FilterPopUpScreenBase clickFilterButton() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }
}
