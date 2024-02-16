package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import org.openqa.selenium.WebDriver;

public class HeaderBase extends SauceDemoAbstractScreenBase{

    public HeaderBase(WebDriver driver) {
        super(driver);
    }

    public CartScreenBase clickCartButton() {
        throw new NotSupportedOperationException("clickCartButton is not implemented for this page");
    }

    public MenuScreenBase clickBurgerButton(){
        throw new NotSupportedOperationException("clickBurgerButton is not implemented for this page");
    }
}
