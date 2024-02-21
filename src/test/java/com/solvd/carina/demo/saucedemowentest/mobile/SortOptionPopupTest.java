package com.solvd.carina.demo.saucedemowentest.mobile;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.FilterPopUpBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.LoginScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductsScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.enums.SortOption;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.solvd.carina.demo.gui.saucedemo.mobile.enums.SortOption.A_TO_Z_FILTER;
import static com.solvd.carina.demo.gui.saucedemo.mobile.enums.SortOption.valueOf;

public class SortOptionPopupTest extends AbstractTest {

    @Test
    public void checkFilterPopupContentTest() {
        LoginScreenBase loginScreen = initPage(LoginScreenBase.class);
        Assert.assertTrue(loginScreen.isOpened(), "Login screen is not opened");
        loginScreen.typeUserName(R.TESTDATA.get("standard_user_username"));
        loginScreen.typePassword(R.TESTDATA.get("default_user_password"));
        ProductsScreenBase productScreen = loginScreen.clickLoginButton();
        Assert.assertTrue(productScreen.isOpened(), "Products screen is not opened");
        FilterPopUpBase filterPopUpScreen = productScreen.clickFilterButton();
        Assert.assertTrue(filterPopUpScreen.isSortOptionPresent(SortOption.A_TO_Z_FILTER));
        Assert.assertTrue(filterPopUpScreen.isSortOptionPresent(SortOption.Z_TO_A_FILTER));
        Assert.assertTrue(filterPopUpScreen.isSortOptionPresent(SortOption.LOW_TO_HIGH_FILTER));
        Assert.assertTrue(filterPopUpScreen.isSortOptionPresent(SortOption.HIGH_TO_LOW_FILTER));
        Assert.assertTrue(filterPopUpScreen.isSortOptionPresent(SortOption.CANCEL_BUTTON));
    }
}
