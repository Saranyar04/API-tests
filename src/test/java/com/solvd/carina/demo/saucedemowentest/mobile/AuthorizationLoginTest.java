package com.solvd.carina.demo.saucedemowentest.mobile;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.LoginScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductsScreenBase;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationLoginTest extends AbstractTest {

    @Test
    public void standardUserLoginTest() {
        LoginScreenBase loginScreen = initPage(LoginScreenBase.class);
        Assert.assertTrue(loginScreen.isOpened(), "Login screen is not opened");
        loginScreen.typeUserName(R.TESTDATA.get("standard_user_username"));
        loginScreen.typePassword(R.TESTDATA.get("default_user_password"));
        ProductsScreenBase productScreen = loginScreen.clickLoginButton();
        Assert.assertTrue(productScreen.isOpened(), "products screen is not opened");
    }
}
