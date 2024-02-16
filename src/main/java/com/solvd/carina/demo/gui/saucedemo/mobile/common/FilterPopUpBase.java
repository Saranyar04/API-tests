package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

public class FilterPopUpBase extends SauceDemoAbstractScreenBase{

    protected FilterPopUpBase(WebDriver driver) {
        super(driver);
    }

    public boolean isAtoZFilterPresent() {
        throw new NotSupportedOperationException("isAtoZFilterPresent is not implemented for this page");
    }

    public boolean isZtoAFilterPresent() {
        throw new NotSupportedOperationException("isZtoAFilterPresent is not implemented for this page");
    }

    public boolean isLowToHighFilterPresent() {
        throw new NotSupportedOperationException("isLowToHighFilterPresent is not implemented for this page");
    }

    public boolean isHighToLowFilterPresent() {
        throw new NotSupportedOperationException("isHighToLowFilterPresent is not implemented for this page");
    }

    public boolean isCancelButtonPresent() {
        throw new NotSupportedOperationException("isCancelButtonPresent is not implemented for this page");
    }
}
