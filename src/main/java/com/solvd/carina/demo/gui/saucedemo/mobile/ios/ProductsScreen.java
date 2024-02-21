package com.solvd.carina.demo.gui.saucedemo.mobile.ios;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductsScreenBase;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductsScreenBase.class)
public class ProductsScreen extends ProductsScreenBase {

    public ProductsScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void addProductToCart(String productName) {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public FilterPopUpBase clickFilterButton() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }
}
