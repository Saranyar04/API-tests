package com.solvd.carina.demo.gui.saucedemo.mobile.ios;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.LoginScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductScreenBase;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginScreenBase.class)
public class LoginScreen extends LoginScreenBase{
        protected LoginScreen(WebDriver driver) {
            super(driver);
        }

        @Override
        public void typeUserName(String username) {
            throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
        }

        @Override
        public void typePassword(String password) {
            throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
        }

        @Override
        public ProductScreenBase clickLoginButton() {
            throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
        }
}

