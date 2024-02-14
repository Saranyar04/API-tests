package com.solvd.carina.demo.gui.saucedemo.mobile.android;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpScreenBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FilterPopUpScreen extends FilterPopUpScreenBase {

    @FindBy(xpath="//android.widget.TextView[@text='Sort items by...']")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='Name (A to Z)']")
    private ExtendedWebElement atoZFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Name (Z to A)']")
    private ExtendedWebElement ztoAFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Price (low to high)']")
    private ExtendedWebElement lowToHighFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Price (high to low)']")
    private ExtendedWebElement HighToLowFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Cancel']")
    private ExtendedWebElement cancelButton;

    protected FilterPopUpScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return screenTitle.isElementPresent();
    }

    @Override
    public boolean isAtoZFilterPresent() {
        return atoZFilter.isElementPresent();
    }

    @Override
    public boolean isZtoAFilterPresent() {
        return ztoAFilter.isElementPresent();
    }

    @Override
    public boolean isLowToHighFilterPresent() {
        return lowToHighFilter.isElementPresent();
    }

    @Override
    public boolean isHighToLowFilterPresent() {
        return HighToLowFilter.isElementPresent();
    }

    @Override
    public boolean isCancelButtonPresent() {
        return cancelButton.isElementPresent();
    }
}
