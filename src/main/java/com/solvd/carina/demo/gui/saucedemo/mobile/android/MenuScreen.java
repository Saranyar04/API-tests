package com.solvd.carina.demo.gui.saucedemo.mobile.android;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.LoginScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.MenuScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MenuScreenBase.class)
public class MenuScreen extends MenuScreenBase {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-ALL ITEMS']")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGOUT']")
    private ExtendedWebElement logoutMenuItem;

    public MenuScreen(WebDriver driver) {
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
    public LoginScreenBase clickLogoutButton() {
        logoutMenuItem.click();
        return initPage(LoginScreenBase.class);
    }

}
