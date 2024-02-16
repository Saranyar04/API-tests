package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import org.openqa.selenium.WebDriver;

public abstract class MenuScreenBase extends SauceDemoAbstractScreenBase {

    public MenuScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginScreenBase clickLogoutButton();

}
