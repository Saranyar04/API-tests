package com.solvd.carina.demo.gui.saucedemo.mobile.ios;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpScreenBase;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

public class FilterPopUpScreen extends FilterPopUpScreenBase {

    protected FilterPopUpScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAtoZFilterPresent() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public boolean isZtoAFilterPresent() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public boolean isLowToHighFilterPresent() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public boolean isHighToLowFilterPresent() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public boolean isCancelButtonPresent() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }
}
