package com.solvd.carina.demo.gui.saucedemo.mobile.common;

import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class gitSauceDemoAbstractScreenBase extends AbstractPage implements IMobileUtils {

    protected final int IS_ELEMENT_PRESENT_TIMEOUT = 15;
    protected final String NOT_IMPLEMENTED_FOR_IOS = "Not implemented for Android";

    public SauceDemoAbstractScreenBase(WebDriver driver) {
        super(driver);
    }

    public boolean isOpened() {
        throw new NotSupportedOperationException("isOpened is not implemented for this page");
    }

    public boolean isOpened(int timeout) {
        throw new NotSupportedOperationException("isOpened is not implemented for this page");
    }
}
