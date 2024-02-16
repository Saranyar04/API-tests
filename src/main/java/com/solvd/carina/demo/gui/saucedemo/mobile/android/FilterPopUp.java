package com.solvd.carina.demo.gui.saucedemo.mobile.android;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = FilterPopUpBase.class)
public class FilterPopUp extends FilterPopUpBase {

    @FindBy(xpath="//android.widget.TextView[@text='Sort items by...']")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='Name (A to Z)']")
    private ExtendedWebElement atoZFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Name (Z to A)']")
    private ExtendedWebElement ztoAFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Price (low to high)']")
    private ExtendedWebElement lowToHighFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Price (high to low)']")
    private ExtendedWebElement highToLowFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Cancel']")
    private ExtendedWebElement cancelButton;

    protected FilterPopUp(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return isOpened(IS_ELEMENT_PRESENT_TIMEOUT);
    }

    @Override
    public boolean isOpened(int timeout) {
        return screenTitle.isElementPresent(timeout);
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
        return highToLowFilter.isElementPresent();
    }

    @Override
    public boolean isCancelButtonPresent() {
        return cancelButton.isElementPresent();
    }
}
