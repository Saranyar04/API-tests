package com.solvd.carina.demo.gui.saucedemo.mobile.android;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.enums.SortOption;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
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
    public boolean isSortOptionPresent(SortOption sortOption) {
        switch (sortOption) {
            case A_TO_Z_FILTER:
                return atoZFilter.isElementPresent();
            case Z_TO_A_FILTER:
                return ztoAFilter.isElementPresent();
            case HIGH_TO_LOW_FILTER:
                return highToLowFilter.isElementPresent();
            case LOW_TO_HIGH_FILTER:
                return lowToHighFilter.isElementPresent();
            case CANCEL_BUTTON:
                return cancelButton.isElementPresent();
            default:
                throw new NotSupportedOperationException(sortOption + "is not implemented for this page");
        }
    }

}
