package com.solvd.carina.demo.gui.saucedemo.mobile.ios;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.LoginScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductsScreenBase;
import com.zebrunner.carina.utils.exception.NotSupportedOperationException;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginScreenBase.class)
public class LoginScreen extends LoginScreenBase{
        public LoginScreen(WebDriver driver) {
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
        public ProductsScreenBase clickLoginButton() {
            throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
        }
}

