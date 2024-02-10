package com.solvd.carina.demo.saucedemowentest;

import com.solvd.carina.demo.gui.saucedemo.pages.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLoginTest implements IAbstractTest {

    @Test
    public void invalidUserTest() {
        String username = "standard_usr";
        String password = "secret_sau";
        String error = "Epic sadface: Username and password do not match any user in this service";

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.typeUserName(username);
        loginPage.typePassword(password);
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isErrorMessage(error), "Error message not displayed");
    }

}
