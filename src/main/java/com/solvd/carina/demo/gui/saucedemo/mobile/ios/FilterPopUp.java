package com.solvd.carina.demo.gui.saucedemo.mobile.ios;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.enums.SortOption;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

public class FilterPopUp extends FilterPopUpBase {

    public FilterPopUp(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isSortOptionPresent(SortOption sortOption) {
            throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

}
