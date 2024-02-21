package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import org.openqa.selenium.WebDriver;

public abstract class LoginScreenBase extends SauceDemoAbstractScreenBase {

    protected LoginScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUserName(String username);

    public abstract void typePassword(String password);

    public abstract ProductsScreenBase clickLoginButton();

}
