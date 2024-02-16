package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

public abstract class FilterPopUpBase extends SauceDemoAbstractScreenBase{

    public FilterPopUpBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isAtoZFilterPresent();

    public abstract boolean isZtoAFilterPresent();

    public abstract boolean isLowToHighFilterPresent();

    public abstract boolean isHighToLowFilterPresent();

    public abstract boolean isCancelButtonPresent();
}
