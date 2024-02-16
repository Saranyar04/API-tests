package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

public abstract class MenuScreenBase extends SauceDemoAbstractScreenBase {

    public MenuScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginScreenBase logoutMenuItemClick();

}
