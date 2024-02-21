package com.solvd.carina.demo.gui.saucedemo.mobile.android;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.enums.SortOption;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = FilterPopUpBase.class)
public class FilterPopUp extends FilterPopUpBase {

    @FindBy(xpath="//android.widget.TextView[@text='Sort items by...']")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement sortOptionS;

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
        return sortOptionS.format(sortOption.getSortOption()).isElementPresent();
    }

}
