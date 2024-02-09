package com.solvd.carina.demo.utils;

import com.solvd.carina.demo.gui.saucedemo.pages.LoginPage;
import com.solvd.carina.demo.gui.saucedemo.pages.ProductPage;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import org.testng.Assert;

public class AuthUtil implements ICustomTypePageFactory {

    public ProductPage login(String username,String password) {
        LoginPage loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isPageOpened(),"Login page not opened");
        loginPage.typeUserName(username);
        loginPage.typePassword(password);
        return loginPage.clickLoginButton();
    }

    public ProductPage loginStandardUser() {
        return login(R.TESTDATA.get("standard_user_username"), R.TESTDATA.get("default_user_password"));
    }

}
