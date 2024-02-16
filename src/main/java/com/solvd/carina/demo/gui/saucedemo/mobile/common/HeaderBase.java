package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

public abstract class HeaderBase extends SauceDemoAbstractScreenBase {

    public HeaderBase(WebDriver driver) {
        super(driver);
    }

    public abstract CartScreenBase clickCartButton();

    public abstract MenuScreenBase clickBurgerButton();

}
