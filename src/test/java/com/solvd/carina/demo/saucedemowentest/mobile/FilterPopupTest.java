package com.solvd.carina.demo.saucedemowentest.mobile;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.LoginScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductScreenBase;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterPopupTest extends AbstractTest {

    @Test
    public void checkFilterPopupContent() {
        LoginScreenBase loginScreen = initPage(LoginScreenBase.class);
        Assert.assertTrue(loginScreen.isOpened(), "Login screen is not opened");
        loginScreen.typeUserName(R.TESTDATA.get("standard_user_username"));
        loginScreen.typePassword(R.TESTDATA.get("default_user_password"));
        ProductScreenBase productScreen = loginScreen.clickLoginButton();
        Assert.assertTrue(productScreen.isOpened(), "Products screen is not opened");
        FilterPopUpScreenBase filterPopUpScreen = productScreen.clickFilterButton();
        Assert.assertTrue(filterPopUpScreen.isAtoZFilterPresent(), "A to Z filter not present");
        Assert.assertTrue(filterPopUpScreen.isZtoAFilterPresent(), "Z To A filter not present");
        Assert.assertTrue(filterPopUpScreen.isLowToHighFilterPresent(), "Low to High filter not present");
        Assert.assertTrue(filterPopUpScreen.isHighToLowFilterPresent(), "High to Low filter not present");
        Assert.assertTrue(filterPopUpScreen.isCancelButtonPresent(), "Cancel button not present");
    }
}
