package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

public class MenuScreenBase extends SauceDemoAbstractScreenBase {

    public MenuScreenBase(WebDriver driver) {
        super(driver);
    }

    public LoginScreenBase logoutMenuItemClick() {
        throw new NotSupportedOperationException("clickContinueShoppingButton is not implemented for this page");
    }

}
