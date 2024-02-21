package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.solvd.carina.demo.gui.saucedemo.mobile.enums.SortOption;
import org.openqa.selenium.WebDriver;

public abstract class FilterPopUpBase extends SauceDemoAbstractScreenBase{

    public FilterPopUpBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isSortOptionPresent(SortOption sortOption);

}
